package helper;
import java.util.*;
import java.io.*;
import syntaxtree.*;
import visitor.AliasAnalyser;

public class GlobalSymTab {

	public static HashMap<String, ClassSymTab> classes = new HashMap<String, ClassSymTab>(); 
	public static ClassSymTab currentClass;
	public static FuncSymTab currentFunc;

	public static ArrayList<String> class_list = new ArrayList<String>();

	public static ClassSymTab addClass(String name){
		if(classes.containsKey(name))
			return classes.get(name);
		ClassSymTab clst = new ClassSymTab(name);
		classes.put(name, clst);
		class_list.add(name);
		return clst;
	}

	public static ClassSymTab addClass(String name, String parent){
		if(classes.containsKey(name))
			return classes.get(name);
		ClassSymTab clst = new ClassSymTab(name, parent);
		classes.put(name, clst);
		class_list.add(name);
		return clst;
	}

	public static boolean userDefinedType(String var){
		if(var.equals("int")||var.equals("int[]")||var.equals("boolean"))
			return false;
		return true;
	}

	private static int reference_count = 0;
	public static String nextReference(){
		return "R"+reference_count++;
	}

	public static Set<String> getAllVariables(String id){
		ClassSymTab clst = classes.get(id);
		return clst.getAllVariables();
	}

	public static void Analyse(AliasAnalyser x){
		for(String class_name:class_list){
			for(String func_name: classes.get(class_name).function_list){
				classes.get(class_name).functions.get(func_name).Analyse(x);
			}
		}
	}

} 