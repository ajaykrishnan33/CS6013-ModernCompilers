package helper;

import java.util.*;

public class GlobalSymTab {

	public static HashMap<String, ClassSymTab> classes = new HashMap<String, ClassSymTab>();
	public static int count = 0;

	public static Deque<FuncSymTab> inlining_funcs = new ArrayDeque<FuncSymTab>();
	public static Deque<Inline> inlining = new ArrayDeque<Inline>();

	public static HashMap<String, Boolean> temporaries = new HashMap<String, Boolean>();
	public static HashMap<String, String> tempMap =  new HashMap<String, String>();
	
	public static ClassSymTab addClass(String name, String parent) {
		if(classes.containsKey(name))
			return classes.get(name);
		ClassSymTab clst = new ClassSymTab(name, parent);
		classes.put(name, clst);
		return clst;
	}

	public static ClassSymTab addClass(String name) {
		if(classes.containsKey(name))
			return classes.get(name);
		ClassSymTab clst = new ClassSymTab(name);
		classes.put(name, clst);
		return clst;
	}

	public static void renameAll(){
		for(Map.Entry<String, ClassSymTab> entry: classes.entrySet()){
			entry.getValue().renameAll();
		}
	}

	private static boolean hasChildFunc(String type, String func){
		ClassSymTab p = classes.get(type);
		if(p.functions.containsKey(func))
			return true;
		boolean flag = false;
		for(String child: p.children){
			if(hasChildFunc(child, func))
				return true;
		}
		return false;
	}

	public static FuncSymTab inlinable(String type, String func){
		ClassSymTab clst = classes.get(type);

		for(String child: clst.children){
			if(hasChildFunc(child, func))
				return null;
		}
		// if inlinable
		while(true){
			if(clst.functions.containsKey(func))
				return clst.functions.get(func);
			if(clst.parent==null)
				break;
			clst = classes.get(clst.parent);
		}

		return null;
	}

	public static void inlineAll(){
		for(Map.Entry<String, ClassSymTab> entry: classes.entrySet()){
			entry.getValue().inlineAll();
		}
	}

	public static String getVariableSource(FuncSymTab currentFunc, String var){
		boolean flag = false;
		String x = null;

		// IF LOCAL VARIABLE
		for(Inline in : inlining){
			if(!flag){
				x = in.f.getLocalVariableName(var);
				if(x!=null){
					flag = true;
				}	
			}
			else{
				x = in.f.getLocalVariableName(x);
			}
		}
		if(x!=null){
			x = currentFunc.getLocalVariableName(x);
			return x;
		}
		else
		{
			x = currentFunc.getLocalVariableName(var);
			if(x!=null)
				return x;
		}

		flag = false;
		String y = null;
		// IF CLASS VARIABLE
		for(Inline in : inlining){
			if(!flag){
				x = in.f.getVariableName(var);
				if(x!=null){
					y = in.classVar;
					flag = true;
					break;
				}
			}
			else
			{
				y = in.f.getVariableName(y);
			}
		}
		if(x!=null){
			y = currentFunc.getVariableName(y);
			x = y+"."+x;
			return x;
		}
		else
		{
			x = currentFunc.getVariableName(var);
			if(x!=null){
				return x;
			}
		}

		// IF NEITHER
		return null;
	}

	public static String resolveThis(FuncSymTab currentFunc){
		Inline currIn = inlining.pop();
		if(inlining.size()>=1){
			Inline prev = inlining.getFirst();
			String ret = getVariableSource(currentFunc, prev.classVar);
			inlining.push(currIn);
			return ret;
		}
		else
		{
			inlining.push(currIn);
			return "this";
		}
	}

	public static void createTemporaries(){
		System.out.println("int int_temp1 ;");
		System.out.println("int int_temp2 ;");
		System.out.println("int int_temp3 ;");
		System.out.println("int int_temp4 ;");
		//
		System.out.println("boolean boolean_temp1 ;");
		System.out.println("boolean boolean_temp2 ;");
		System.out.println("boolean boolean_temp3 ;");
		System.out.println("boolean boolean_temp4 ;");
		//
		System.out.println("int[] intarr_temp1 ;");
		System.out.println("int[] intarr_temp2 ;");
		System.out.println("int[] intarr_temp3 ;");
		System.out.println("int[] intarr_temp4 ;");
		//
		temporaries.put("int_temp1", false);
		temporaries.put("int_temp2", false);
		temporaries.put("int_temp3", false);
		temporaries.put("int_temp4", false);
		temporaries.put("boolean_temp1", false);
		temporaries.put("boolean_temp2", false);
		temporaries.put("boolean_temp3", false);
		temporaries.put("boolean_temp4", false);
		temporaries.put("intarr_temp1", false);
		temporaries.put("intarr_temp2", false);
		temporaries.put("intarr_temp3", false);
		temporaries.put("intarr_temp4", false);
		for(Map.Entry<String, ClassSymTab> entry : classes.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getKey()+"_temp1 ;");
			System.out.println(entry.getKey() + " " + entry.getKey()+"_temp2 ;");
			System.out.println(entry.getKey() + " " + entry.getKey()+"_temp3 ;");
			System.out.println(entry.getKey() + " " + entry.getKey()+"_temp4 ;");
			temporaries.put(entry.getKey()+"_temp1", false);
			temporaries.put(entry.getKey()+"_temp2", false);
			temporaries.put(entry.getKey()+"_temp3", false);
			temporaries.put(entry.getKey()+"_temp4", false);
		}

	}

	public static String getUnusedTemporary(String name, String type){
		int ct = 1;
		while(ct<=4){
			if(!temporaries.get(type+"_temp"+ct)){
				temporaries.put(type+"_temp"+ct, true);
				if(name!=null)
					tempMap.put(name, type+"_temp"+ct);
				return type+"_temp"+ct;
			}
			ct++;	
		}
		return null;
	}

	public static boolean getSpecificTemporary(String name){
		if(temporaries.containsKey(name)){
			if(!temporaries.get(name)){
				temporaries.put(name, true);
				return true;
			}
		}
		return false;
	}

	public static void freeTemporary(String name){
		if(temporaries.containsKey(name)){
			temporaries.put(name, false);
			tempMap.values().remove(name);
		}
	}

	public static void printTemporaryState(){
		for(Map.Entry<String, Boolean> entry: temporaries.entrySet()){
			System.err.println(entry.getKey()+" : "+entry.getValue());
		}
	}

	public static void printDebug(){
		for(Map.Entry<String, ClassSymTab> entry: classes.entrySet()){
			System.out.println(entry.getKey()+":");
			entry.getValue().printDebug();
		}
	}
}