package helper;

import java.util.*;

public class ClassSymTab extends SymTab
{
    HashMap<String, MethodSymTab> methods = new HashMap<String, MethodSymTab>();

    public ClassSymTab(String block_name)
    {
        this.block_name = block_name;
    }

    public ClassSymTab(String block_name, String parent)
    {
        this.block_name = block_name;
        this.parent = parent;
    }

    public void putMethod(String id, String return_type, GlobalSymTab g)
    {
        MethodSymTab mst = new MethodSymTab(id, return_type, g);
        g.current_scope = mst;
        methods.put(id, mst);
    }

    public boolean containsMethod(String id, GlobalSymTab g)
    {
        if(methods.containsKey(id))
        {
            return true;
        }   
        else
        if(parent!=null)
        {
            if(g.containsClass(parent))
            {
                return g.getClass(parent).containsMethod(id, g);
            }  
        }
        return false;  
    }

    public MethodSymTab getMethod(String id, GlobalSymTab g)
    {
        if(methods.containsKey(id))
        {
            return methods.get(id);
        }   
        else
        if(parent!=null)
        {
            if(g.containsClass(parent))
            {
                return g.getClass(parent).getMethod(id, g);
            }  
        }  
        return null;
    }

    public void displayEverything(){
        System.out.print("class " + block_name);
        if(parent!=null){
            System.out.println(" extends " + parent);
        }
        else{
            System.out.print("\n");
        }

        System.out.println("\tVariables");
        for(Map.Entry<String, String> entry: variables.entrySet()){
            System.out.println("\t" + entry.getKey() + " -- " + entry.getValue());
        }
        System.out.println("\tMethods");
        for(Map.Entry<String, MethodSymTab> entry: methods.entrySet()){
            entry.getValue().displayEverything();
        }
    }

}