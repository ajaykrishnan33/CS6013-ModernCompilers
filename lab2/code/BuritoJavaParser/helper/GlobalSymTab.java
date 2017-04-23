package helper;

import java.util.*;

public class GlobalSymTab
{
    HashMap<String, ClassSymTab> classes = new HashMap<String, ClassSymTab>();

    public SymTab current_scope;

    public boolean containsClass(String key)
    {
        return classes.containsKey(key);
    }

    public ClassSymTab getClass(String key)
    {
        return classes.get(key);
    }

    public void putClass(String class_name)
    {
        ClassSymTab st = new ClassSymTab(class_name);
        this.current_scope = st;
        classes.put(class_name, st);
    }

    public void putClass(String class_name, String extends_class)
    {
        ClassSymTab st = new ClassSymTab(class_name, extends_class);
        this.current_scope = st;
        classes.put(class_name, st);
    }

    public void displayEverything(){
    	for(Map.Entry<String, ClassSymTab> entry : classes.entrySet()){
    		entry.getValue().displayEverything();
    	}
    }

}