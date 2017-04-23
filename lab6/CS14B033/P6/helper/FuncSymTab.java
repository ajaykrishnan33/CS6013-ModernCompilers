package helper;
import java.util.*;
import java.io.*;
import syntaxtree.*;
import visitor.AliasAnalyser;

public class FuncSymTab {

	public String func_name;
	public String class_name;
	public String return_type;
	public ArrayList<String> formal_params = new ArrayList<String>();
	public HashMap<String, String> variables = new HashMap<String, String>();

	// public HashMap<String, String> references = new HashMap<String, String>();

	public ArrayList<BlockLine> blocks = new ArrayList<BlockLine>();
	public ArrayList<AliasQuery> queries = new ArrayList<AliasQuery>();

	public BlockLine currentBlock;

	public FuncSymTab(String func_name, String class_name, String return_type){
		this.func_name = func_name;
		this.class_name = class_name;
		this.return_type = return_type;
	}

	public void addFormalParam(String var_name, String type){
		this.variables.put(var_name, type);
		this.formal_params.add(var_name);
	}

	public void addVariable(String var_name, String type){
		this.variables.put(var_name, type);
	}

	public BlockLine addBlockLine(Node n){
		BlockLine b = new BlockLine(n);
		this.blocks.add(b);

		if(this.currentBlock!=null){
			this.currentBlock.successors.add(b);
			b.predecessors.add(this.currentBlock);
		}

		this.currentBlock = b;

		return b;
	}

	public AliasQuery addAliasQuery(String var1, String var2){
		BlockLine b = this.addBlockLine(null);
		AliasQuery q = new AliasQuery(var1, var2, b);
		this.queries.add(q);
		return q;
	}

	// public void addReference(String ref, String type){
	// 	this.references.add(ref, type);
	// }

	public String getVariableType(String var){
		if(this.variables.containsKey(var))
			return this.variables.get(var);

		return GlobalSymTab.classes.get(this.class_name).getVariableType(var);
	}

	public void initialiseBlocks(){
		for(BlockLine b:this.blocks){
			for(Map.Entry<String,String> v:this.variables.entrySet()){
				b.stack.put(v.getKey(), new HashSet<String>());
			}
			b.stackBottom.add("this");
			for(String f : this.formal_params){
				b.stackBottom.add(f);
			}
		}
	}

	public void transferToOld(){
		for(BlockLine b:this.blocks){
			b.old_stack = new HashMap<String, Set<String>>();
			for(Map.Entry<String,Set<String>> entry : b.stack.entrySet()){
				b.old_stack.put(entry.getKey(), new HashSet<String>(entry.getValue()));
			}
			b.old_stackBottom = new HashSet<String>(b.stackBottom);

			b.old_heap = new HashMap<String, Set<String>>();
			for(Map.Entry<String,Set<String>> entry : b.heap.entrySet()){
				b.old_heap.put(entry.getKey(), new HashSet<String>(entry.getValue()));
			}
			b.old_heapBottom = new HashSet<String>(b.heapBottom);
		}
	}

	public boolean detectChanges(){
		for(BlockLine b:this.blocks){
			if(!b.old_stackBottom.containsAll(b.stackBottom) || !b.stackBottom.containsAll(b.old_stackBottom))
				return true;
			for(Map.Entry<String,Set<String>> entry : b.stack.entrySet()){
				Set<String> temp = entry.getValue();
				if(!b.old_stack.get(entry.getKey()).containsAll(temp) || !temp.containsAll(b.old_stack.get(entry.getKey())))
					return true;
			}

			if(!b.old_heapBottom.containsAll(b.heapBottom) || !b.heapBottom.containsAll(b.old_heapBottom))
				return true;
			for(Map.Entry<String,Set<String>> entry : b.heap.entrySet()){
				Set<String> temp = entry.getValue();
				if(!b.old_heap.containsKey(entry.getKey()))
					return true;
				if(!b.old_heap.get(entry.getKey()).containsAll(temp) || !temp.containsAll(b.old_heap.get(entry.getKey())))
					return true;
			}
		}
		return false;
	}

	public void Analyse(AliasAnalyser x){

		GlobalSymTab.currentFunc = this;
		GlobalSymTab.currentClass = GlobalSymTab.classes.get(this.class_name);

		this.initialiseBlocks();

		while(true){ // outer while loop for trying to reach fixed point

			this.transferToOld();

			// inner loop: iterate through blocks

			for(BlockLine b : this.blocks){

				// take meet of predecessors
				b.predecessorMeet();

				if(b.stmt==null)
					continue;
				// evaluate stmt
				ArrayList<Object> res = (ArrayList<Object>)b.stmt.accept(x, "eval");
				if(res==null)
					continue;

				if(res.get(0).toString().equals("assgn")){
					String lhs = res.get(1).toString();
					ArrayList<Object> exp = (ArrayList<Object>)res.get(2);
					int type = Integer.parseInt(exp.get(0).toString());
					switch(type){
						case 0: // Identifier = Identifier
						String rhs = exp.get(1).toString();
						if(b.stackBottom.contains(rhs)||!this.variables.containsKey(rhs))
							b.stackBottom.add(lhs);
						else{
							b.stack.put(lhs, new HashSet<String>(b.stack.get(rhs)));
							if(b.stackBottom.contains(lhs))
								b.stackBottom.remove(lhs);
						}
						break;
						case 1: // Identifier = Identifier.Identifier
						if(b.stackBottom.contains(exp.get(1).toString()) || !this.variables.containsKey(exp.get(1).toString())){
							b.stackBottom.add(lhs);
						}
						else{
							Set<String> temp = new HashSet<String>();
							for(String ref:b.stack.get(exp.get(1).toString())){
								String rhs2 = ref+"|"+exp.get(2).toString();
								if(b.heapBottom.contains(rhs2)){
									b.stackBottom.add(lhs);
									break;
								}
								else{
									temp.addAll(b.heap.get(rhs2));
									b.stack.put(lhs, temp);
									if(b.stackBottom.contains(lhs))
										b.stackBottom.remove(lhs);
								}
							}
						}
						break;
						case 2: // Identifier = PrimaryExpression.Identifier(ArgList?)
						ArrayList<String> prim = (ArrayList<String>)exp.get(1);
						ArrayList<String> args = (ArrayList<String>)exp.get(3);

						// on any function call, set all fields and reachables to bottom
						// set reachables from args to bottom, args themselves cannot change
						// if x.pqr(a) is called, then set everything reachable from x and a
						// in the heap as bottom. if x is a field of the class, then x is same
						// as this.x which will point to bottom since "this" points to bottom. 
						// So set everything in heap to point bottom.

						if(prim.get(0).equals("identifier")){
							String id = prim.get(1);
							if(b.stackBottom.contains(id)||!this.variables.containsKey(id))
								b.makeAllBottom();
							else{
								ArrayList<String> x1 = new ArrayList<String>();
								x1.add(id);
								b.makeBottom(x1);
								b.makeBottom(args);
							}
						}
						else
						if(prim.get(0).equals("this")){
							b.makeAllBottom();
						}
						else
						if(prim.get(0).equals("allocation")){
							b.initHeapEntry(prim.get(1), prim.get(2));
							b.makeBottom(args);
							// b.makeBottom(x1);
						}
						// if(GlobalSymTab.userDefinedType(this.getVariableType(lhs)))
						b.stackBottom.add(lhs);
						break;
						case 3: // Identifier = this
						b.stackBottom.add(lhs);
						break;
						case 4: // Identifier = new Identifier()
						Set<String> temp = new HashSet<String>();
						temp.add(exp.get(1).toString());
						b.stack.put(lhs, temp);
						if(b.stackBottom.contains(lhs))
							b.stackBottom.remove(lhs);
						b.initHeapEntry(exp.get(1).toString(),exp.get(2).toString());
						break;
					}
				}
				else
				if(res.get(0).equals("fieldassgn"))
				{
					String id1 = res.get(1).toString();
					String id2 = res.get(2).toString();

					ArrayList<Object> exp = (ArrayList<Object>)res.get(3);

					int type = Integer.parseInt(exp.get(0).toString());
					switch(type){
						case 0: // Identifier.Identifier = Identifier or this.Identifier = Identifier
						String rhs = exp.get(1).toString();
						if(b.stackBottom.contains(rhs)||!this.variables.containsKey(rhs)){
							if(!id1.equals("this")){
								for(String ref : b.stack.get(id1)){
									b.heapBottom.add(ref + "|" + id2);
								}
							}
							else
							{
								b.makeAllBottom();
							}
						}
						else{
							if(b.stackBottom.contains(id1)){
								b.makeAllBottom();
							}
							else
							if(id1.equals("this")){ // weak update
								for(Map.Entry<String,Set<String>> entry : b.heap.entrySet()){
									entry.getValue().addAll(b.stack.get(rhs));
								}
							}
							else
							if(b.stack.get(id1).size()==1){ // strong update
								for(String ref : b.stack.get(id1)){
									b.heap.put(ref+"|"+id2, new HashSet<String>(b.stack.get(rhs)));
									if(b.heapBottom.contains(ref+"|"+id2))
										b.heapBottom.remove(ref+"|"+id2);
								}
							}
							else	// weak update
							{
								for(String ref : b.stack.get(id1)){
									b.heap.get(ref+"|"+id2).addAll(b.stack.get(rhs));
								}
							}
						}
						break;

						case 1: // this.Identifier = Identifier.Identifier
						if(b.stackBottom.contains(exp.get(1).toString()) || !this.variables.containsKey(exp.get(1).toString())){
							b.makeAllBottom();
						}
						else{
							boolean flag = false;
							Set<String> temp = new HashSet<String>();
							for(String ref:b.stack.get(exp.get(1).toString())){
								String rhs2 = ref+"|"+exp.get(2).toString();
								if(b.heapBottom.contains(rhs2)){
									// b.stackBottom.add(lhs);
									b.makeAllBottom();
									flag = true;
									break;
								}
								else{
									temp.addAll(b.heap.get(rhs2));
								}
							}
							if(!flag){
								for(Map.Entry<String,Set<String>> entry: b.heap.entrySet()){
									entry.getValue().addAll(temp);
								}
							}
						}
						break;

						case 2: // this.Identifier = PrimaryExpression.Identifier(ArgList?)
						// ArrayList<String> prim = (ArrayList<String>)exp.get(1);
						// ArrayList<String> args = (ArrayList<String>)exp.get(3);

						b.makeAllBottom();
						// because stack(rhs) = bottom, and stack(this) = bottom, so
						// every reference in the heap gets bottom added to it so it
						// becomes bottom
						break;
						case 3: // this.Identifier = this
						b.makeAllBottom();
						break;
						case 4: // this.Identifier = new Identifier()

						// weak update
						for(Map.Entry<String, Set<String>> entry : b.heap.entrySet()){
							entry.getValue().add(exp.get(1).toString());
						}

						b.initHeapEntry(exp.get(1).toString(),exp.get(2).toString());
						break;
					}		
				}

			}

			if(!this.detectChanges())
				break;
		}

		GlobalSymTab.currentFunc = null;
		GlobalSymTab.currentClass = null;

		// printing now

		// System.out.println("Results...");

		for(AliasQuery q : queries){

			// System.out.print(q.var1+" alias? "+q.var2 + " : ");

			Set<String> intersection = new HashSet<String>(q.block.stack.get(q.var1));
			intersection.retainAll(q.block.stack.get(q.var2));

			if(intersection.contains("null"))
				intersection.remove("null");

			if(q.block.stackBottom.contains(q.var1)||q.block.stackBottom.contains(q.var2)){
				System.out.println("Yes");
				// if(q.block.stackBottom.contains(q.var1))
				// 	System.out.println(q.var1 + " = bottom");
				// if(q.block.stackBottom.contains(q.var2))
				// 	System.out.println(q.var2 + " = bottom\n");

			}
			else{
				if(intersection.size()>0)
					System.out.println("Yes");
				else
					System.out.println("No");

				// System.out.print(q.var1+" = ");
				// for(String ref:q.block.stack.get(q.var1)){
				// 	System.out.print(ref + " ");
				// }
				// System.out.println("");

				// System.out.print(q.var2+" = ");
				// for(String ref:q.block.stack.get(q.var2)){
				// 	System.out.print(ref + " ");
				// }
				// System.out.println("\n");
			}

		}

		// for(BlockLine b:this.blocks){
		// 	System.out.println("Blocks:");
		// 	System.out.println("\tStack:");
		// 	for(Map.Entry<String, Set<String>> entry:b.stack.entrySet()){
		// 		if(b.stackBottom.contains(entry.getKey()))
		// 			System.out.println("\t\t"+entry.getKey() + " = bottom");
		// 		else
		// 			System.out.println("\t\t"+entry.getKey()+":"+entry.getValue());
		// 	}
		// 	System.out.println("\tHeap:");
		// 	for(Map.Entry<String, Set<String>> entry:b.heap.entrySet()){
		// 		if(!b.heapBottom.contains(entry.getKey()))
		// 			System.out.println("\t\t"+entry.getKey()+":"+entry.getValue());
		// 	}
		// 	for(String ref:b.heapBottom)
		// 		System.out.println("\t\t"+ref + " = bottom");
		// }

	}

}