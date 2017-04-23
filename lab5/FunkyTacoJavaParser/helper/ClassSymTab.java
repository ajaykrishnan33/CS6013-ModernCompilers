package helper;

import syntaxtree.*;
import java.util.*;

public class ClassSymTab {

	public String name;
	public String parent;
	public ArrayList<String> children = new ArrayList<String>();

	public HashMap<String, String> variables = new HashMap<String, String>();
	public HashMap<String, FuncSymTab> functions = new HashMap<String, FuncSymTab>();

	public HashMap<String, String> new_variable_names = new HashMap<String, String>();
	public HashMap<String, String> reverse_variable_names = new HashMap<String, String>();

	public ClassSymTab(String name, String parent) {
		this.name = name;
		this.parent = parent;
		GlobalSymTab.classes.get(parent).children.add(name);
	}

	public ClassSymTab(String name) {
		this.name = name;
	}

	public FuncSymTab addFunction(String name, String return_type, Node n) {
		if (functions.containsKey(name))
			return functions.get(name);

		FuncSymTab fst = new FuncSymTab(name, return_type, this.name, n);
		this.functions.put(name, fst);
		return fst;
	}

	public void addVariable(String name, String type) {
		this.variables.put(name, type);
	}

	public void renameAll(){
		for(Map.Entry<String, String> entry: this.variables.entrySet()){
			// this.new_variable_names.put(entry.getKey(), name+"_temp"+GlobalSymTab.count++);
			String new_name =  entry.getKey()+GlobalSymTab.count++;
			this.new_variable_names.put(entry.getKey(), new_name);
			this.reverse_variable_names.put(new_name, entry.getKey());
		}
		for(Map.Entry<String, FuncSymTab> entry: this.functions.entrySet()){
			entry.getValue().renameAll();
		}
	}

	public void inlineAll(){
		for(Map.Entry<String, FuncSymTab> entry: this.functions.entrySet()){
			entry.getValue().inlineAll();
		}
	}

	public String getVariableName(String var){
		if(this.new_variable_names.containsKey(var))
			return this.new_variable_names.get(var);
			
		if(this.variables.containsKey(var))
			return var;

		if(this.parent!=null){
			return GlobalSymTab.classes.get(this.parent).getVariableName(var);
		}

		return null;
	}

	public String getVariableType(String var){
		if(this.variables.containsKey(var))
			return this.variables.get(var);
		if(this.reverse_variable_names.containsKey(var))
			return this.variables.get(reverse_variable_names.get(var));
		if(this.parent!=null)
			return GlobalSymTab.classes.get(this.parent).getVariableType(var);
		return null;
	}

	public FuncSymTab getFunction(String name){
		if(this.functions.containsKey(name))
			return this.functions.get(name);

		if(this.parent!=null){
			return GlobalSymTab.classes.get(this.parent).getFunction(name);
		}

		return null;
	}

	public void printDebug(){
		for(Map.Entry<String, String> entry: this.variables.entrySet()){
			System.out.println("\t" + entry.getKey() + " : " + entry.getValue());
		}
		for(Map.Entry<String, FuncSymTab> entry: this.functions.entrySet()){
			System.out.println("\t" + entry.getKey() + "():");
			entry.getValue().printDebug();
		}
	}

}