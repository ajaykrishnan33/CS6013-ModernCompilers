package helper;

import syntaxtree.*;
import java.util.*;

public class FuncSymTab {

	public String func_name;
	public String class_name;

	public String return_type;

	public HashMap<String, String> variables = new HashMap<String, String>();
	public HashMap<String, String> new_variable_names = new HashMap<String, String>();
	public HashMap<String, String> reverse_variable_names = new HashMap<String, String>();
	public ArrayList<String> formal_params = new ArrayList<String>();

	public HashMap<String, Inline> inline = new HashMap<String, Inline>();

	public boolean inlined = false;

	public Node n;

	public FuncSymTab(String name, String return_type, String class_name, Node n){
		this.func_name = name;
		this.class_name = class_name;
		this.return_type = return_type;
		this.n = n;
	}

	public void addVariable(String name, String type){
		this.variables.put(name, type);
	}

	public void addFormalParameter(String name, String type){
		this.variables.put(name, type);
		this.formal_params.add(name);
	}

	public void renameAll(){		
		for(Map.Entry<String, String> entry: this.variables.entrySet()){
			// this.new_variable_names.put(entry.getKey(), class_name + "_"+ func_name+"_temp"+GlobalSymTab.count++);
			String new_name = entry.getKey()+GlobalSymTab.count++;
			this.new_variable_names.put(entry.getKey(), new_name);
			this.reverse_variable_names.put(new_name, entry.getKey());
		}
	}

	public String getLocalVariableName(String var){
		if(this.new_variable_names.containsKey(var))
			return this.new_variable_names.get(var);

		if(this.variables.containsKey(var)){
			return var;
		}

		return null;
	}

	public String getVariableName(String var){
		String ret = this.getLocalVariableName(var);
		if(ret!=null)
			return ret;

		return GlobalSymTab.classes.get(class_name).getVariableName(var);
	}

	public String getVariableType(String var){
		if(this.variables.containsKey(var))
			return this.variables.get(var);
		if(this.reverse_variable_names.containsKey(var)){
			return this.variables.get(reverse_variable_names.get(var));
		}
		return GlobalSymTab.classes.get(class_name).getVariableType(var);
	}

	public Inline addInline(String type, String name, String target){
		Inline in = new Inline(type, name, target);
		this.inline.put(type + "_" + name, in);
		return in;
	}

	public void inlineAll(){
		if(this.inlined)
			return;

		if(GlobalSymTab.inlining_funcs.contains(this))
			return;

		GlobalSymTab.inlining_funcs.push(this);

		String name, type;
		for(Map.Entry<String, Inline> entry: this.inline.entrySet()){
			Inline in = entry.getValue();
			name = in.func_name;
			type = in.class_name;

			FuncSymTab f = GlobalSymTab.inlinable(type, name);

			if(f!=null){

				in.ref = f.n;
				in.inlinable = true;

				in.f = f;

				f.inlineAll();
				this.inlineFunc(f);
				String classVar = this.func_name + "_" + f.class_name + "_temp" + GlobalSymTab.count++;
				this.variables.put(classVar, f.class_name);

				in.classVar = classVar;

				String retVar = this.func_name + "_" + f.class_name + "_temp" + GlobalSymTab.count++;
				this.variables.put(retVar, f.return_type);

				in.retVar = retVar;
			}
		}
		this.inlined = true;
		GlobalSymTab.inlining_funcs.pop();
	}

	public void inlineFunc(FuncSymTab f){
		HashMap<String,String> temp = new HashMap<String,String>();
		for(Map.Entry<String, String> entry: f.variables.entrySet()){
			temp.put(f.getLocalVariableName(entry.getKey()), entry.getValue());
		}
		for(Map.Entry<String, String> entry: temp.entrySet()){
			this.variables.put(entry.getKey(), entry.getValue());
			String new_name = this.class_name + "_" + entry.getKey() + GlobalSymTab.count++;
			this.new_variable_names.put(entry.getKey(), new_name);
			this.reverse_variable_names.put(new_name, entry.getKey());
		}
	}

	public void printDebug(){
		for(Map.Entry<String, String> entry: this.variables.entrySet()){
			System.out.println("\t\t" + entry.getKey() + "-->" +this.getLocalVariableName(entry.getKey()) + " : " + entry.getValue()); 
		}
	}

}
