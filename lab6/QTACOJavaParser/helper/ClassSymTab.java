package helper;
import java.util.*;
import java.io.*;

public class ClassSymTab {

	public String name;
	public String parent;
	public HashMap<String, FuncSymTab> functions = new HashMap<String, FuncSymTab>();
	public HashMap<String, String> variables = new HashMap<String, String>();

	public ArrayList<String> function_list = new ArrayList<String>();

	public ClassSymTab(String name){
		this.name = name;
	}

	public ClassSymTab(String name, String parent){
		this.name = name;
		this.parent = parent;
	}

	public void addVariable(String var_name, String type){
		this.variables.put(var_name, type);
	}

	public FuncSymTab addFunction(String func_name, String return_type){
		if(functions.containsKey(name))
			return functions.get(name);
		FuncSymTab fst = new FuncSymTab(func_name, this.name, return_type);
		functions.put(name, fst);
		function_list.add(name);
		return fst;
	}

	public String getVariableType(String var){
		if(this.variables.containsKey(var))
			return this.variables.get(var);

		if(this.parent==null)
			return null;

		return GlobalSymTab.classes.get(this.parent).getVariableType(var);
	}

	public Set<String> getAllVariables(){
		Set<String> res = new HashSet<String>();
		for(Map.Entry<String,String> entry:variables.entrySet()){
			res.add(entry.getKey());
		}

		if(this.parent!=null){
			ClassSymTab c = GlobalSymTab.classes.get(parent);
			res.addAll(c.getAllVariables());
		}

		return res;
	}

}