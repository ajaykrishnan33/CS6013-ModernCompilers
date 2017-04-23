package helper;

import java.util.*;


public class SymTab 
{
    public String block_name;
    public HashMap<String, String> variables = new HashMap<String,String>();
    public String parent;

    public boolean containsVariable(String id)
    {
        return variables.containsKey(id);
    }

    public void putVariable(String id, String type)
    {
        variables.put(id, type);
    }

    public boolean variableExists(String id, GlobalSymTab g)
    {
        if(variables.containsKey(id))
        {
            return true;
        }
        else
        if(parent!=null)
        {
            if(g.containsClass(parent))
            {
                return g.getClass(parent).variableExists(id, g);
            }
        }
        return false;
    }

    public String getVariableType(String id, GlobalSymTab g)
    {
        if(variables.containsKey(id))
        {
            return variables.get(id);
        }
        else
        if(parent!=null)
        {
            if(g.containsClass(parent))
            {
                return g.getClass(parent).getVariableType(id, g);
            }  
        }
        return null;
    }

}