package helper;

import java.util.*;

public class MethodSymTab extends SymTab
{
    public String return_type;
    public HashMap<String, String> inner_variables = new HashMap<String, String>();
    public HashMap<String, String> parameter_variables = new HashMap<String, String>();

    public MethodSymTab(String block_name, String return_type, GlobalSymTab g)
    {
        this.block_name = block_name;
        this.return_type = return_type;
        this.parent = g.current_scope.block_name;
    }

    public void putVariable(String id, String type){
        inner_variables.put(id, type);
        super.putVariable(id, type);   
    }

    public void putParameterVariable(String id, String type){
        parameter_variables.put(id, type);
        super.putVariable(id, type);   
    }

    public boolean containsMethod(String id, GlobalSymTab g)
    {
        if(g.containsClass(parent))
        {
            return g.getClass(parent).containsMethod(id, g);
        }
        return false;
    }

    public MethodSymTab getMethod(String id, GlobalSymTab g)
    {
        if(g.containsClass(parent))
        {
            return g.getClass(parent).getMethod(id, g);
        }
        return null;
    }

    public void displayEverything(){
        System.out.println("\t"+block_name + " -- " + return_type);
        System.out.println("\t\tParameters");
        for(Map.Entry<String, String> entry: parameter_variables.entrySet()){
            System.out.println("\t\t" + entry.getKey() + " -- " + entry.getValue());
        }
        System.out.println("\t\tVariables");
        for(Map.Entry<String, String> entry: inner_variables.entrySet()){
            System.out.println("\t\t" + entry.getKey() + " -- " + entry.getValue());
        }
    }

}