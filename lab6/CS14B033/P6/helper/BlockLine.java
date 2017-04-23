package helper;
import syntaxtree.*;
import java.util.*;
import java.io.*;

public class BlockLine {
	
	Node stmt;

	public ArrayList<BlockLine> predecessors = new ArrayList<BlockLine>();
	public ArrayList<BlockLine> successors = new ArrayList<BlockLine>();

	public HashMap<String, Set<String>> stack = new HashMap<String, Set<String>>();
	public HashMap<String, Set<String>> heap = new HashMap<String, Set<String>>();

	public Set<String> stackBottom = new HashSet<String>();
	public Set<String> heapBottom = new HashSet<String>();


	public HashMap<String, Set<String>> old_stack = new HashMap<String, Set<String>>();
	public HashMap<String, Set<String>> old_heap = new HashMap<String, Set<String>>();

	public Set<String> old_stackBottom = new HashSet<String>();
	public Set<String> old_heapBottom = new HashSet<String>();


	public BlockLine(Node n){
		this.stmt = n;
	}

	public void predecessorMeet(){
		for(Map.Entry<String,Set<String>> entry:this.stack.entrySet()){
			entry.getValue().clear();
		}
		for(Map.Entry<String,Set<String>> entry:this.heap.entrySet()){
			entry.getValue().clear();
		}
		this.stackBottom.clear();
		this.heapBottom.clear();

		for(BlockLine p:this.predecessors){

			// take union of the set of aliases of each variable, if not bottom.
			// if bottom, then set the variable as bottom in this block and break.
			for(Map.Entry<String, Set<String>> entry : p.stack.entrySet()){

				if(!p.stackBottom.contains(entry.getKey()) && !this.stackBottom.contains(entry.getKey()))
					this.stack.get(entry.getKey()).addAll(entry.getValue());
				else
					this.stackBottom.add(entry.getKey());
			}

			for(Map.Entry<String, Set<String>> entry : p.heap.entrySet()){
				if(!p.heapBottom.contains(entry.getKey()) && !this.heapBottom.contains(entry.getKey())){
					if(this.heap.containsKey(entry.getKey()))
						this.heap.get(entry.getKey()).addAll(entry.getValue());
					else
						this.heap.put(entry.getKey(), new HashSet<String>(entry.getValue()));
				}
				else
					this.heapBottom.add(entry.getKey());
			}

			for(String ref:p.heapBottom){
				this.heapBottom.add(ref);
			}
		}

	}

	public void initHeapEntry(String ref, String id){
		Set<String> temp = GlobalSymTab.getAllVariables(id);
		for(String v:temp){
			Set<String> x = new HashSet<String>();
			x.add("null");
			this.heap.put(ref+"|"+v, x);
		}
	}

	public void makeAllBottom(){
		for(Map.Entry<String, Set<String>> entry: this.heap.entrySet()){
			this.heapBottom.add(entry.getKey());
		}
	}

	private boolean _getAccessible(String ref, Set<String> set){ // returns false if bottom
		for(Map.Entry<String, Set<String>> entry : this.heap.entrySet()){
			String x = entry.getKey();
			if(x.equals("null"))
				continue;
			if(ref.equals(x.substring(0,x.indexOf('|')))){ // if encountered reference|field
				if(this.heapBottom.contains(x))
					return false;
				for(String y:entry.getValue()){
					if(!set.contains(y)){
						set.add(y);
						if(!this._getAccessible(y, set))
							return false;
					}
				}
			}
		}

		return true;
	}

	public void makeBottom(Set<String> varlist){
		if(varlist==null)
			return;
		Set<String> set = new HashSet<String>();
		boolean all_bottom = false;
		outer: for(String var:varlist){
			if(this.stackBottom.contains(var)){
				all_bottom = true;
				break outer;
			}
			else{
				for(String ref:this.stack.get(var)){
					if(!set.contains(ref)){
						set.add(ref);
						if(!this._getAccessible(ref, set)){
							all_bottom = true;
							break outer;
						}
					}
				}
			}
		}

		if(all_bottom)
			this.makeAllBottom();
		else{
			for(String ref:set){
				for(Map.Entry<String, Set<String>> entry : this.heap.entrySet()){
					String x = entry.getKey();
					if(x.equals("null"))
						continue;
					if(ref.equals(x.substring(0,x.indexOf('|')))){ // if encountered reference|field
						this.heapBottom.add(x);
					}
				}
			}
		}

	}

	public void makeBottom(ArrayList<String> varlist){
		if(varlist==null)
			return;
		Set<String> varset = new HashSet<String>();
		for(String var:varlist){
			varset.add(var);
		}
		this.makeBottom(varset);
	}

}