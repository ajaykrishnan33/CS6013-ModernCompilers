package helper;

import java.util.*;
import syntaxtree.*;

public class BlockL {
	public int lineno;
	public String var_name=null;
	public Expression exp=null;
	public Identifier id=null;
	public ArrayList<Integer> predecessors = new ArrayList<Integer>();
	public ArrayList<Integer> successors = new ArrayList<Integer>();
	public HashMap<String,ValType> inValMap = new HashMap<String,ValType>();
	public HashMap<String,ValType> outValMap = new HashMap<String,ValType>();
	boolean first = true;

	public BlockL(int lineno){
		this.lineno = lineno;
	}

	public void setExp(Expression exp){
		this.exp = exp;
	}

	public void setId(Identifier id){
		this.id = id;
	}

	public void setExp(String var_name, Expression exp){
		this.var_name = var_name;
		this.exp = exp;
	}

	public void addPredecessor(int x){
		this.predecessors.add(x);
	}

	public void addSuccessor(int x){
		this.successors.add(x);
	}

	public void initializeValMap(ArrayList<ValType> vars){
		for(int i=0;i<vars.size();i++){
			this.inValMap.put(vars.get(i).var_name, new ValType(vars.get(i)));
			this.outValMap.put(vars.get(i).var_name, new ValType(vars.get(i)));
		}
	}

	public HashMap<String, ValType> copyValMap(){
		HashMap<String, ValType> hm = new HashMap<String, ValType>();
		for(Map.Entry<String,ValType> entry:this.outValMap.entrySet()){
			hm.put(entry.getKey(), new ValType(entry.getValue()));
		}
		return hm;
	}

	public boolean hasChanged(HashMap<String, ValType> old){
		for(Map.Entry<String,ValType> entry:this.outValMap.entrySet()){
			ValType v1 = old.get(entry.getKey());
			ValType v2 = entry.getValue();
			if((v1.status!=v2.status)||(v1.val!=v2.val)){
				return true;
			}
		}
		boolean temp = this.first;
		this.first = false;
		return temp;
	}

	public void copyInToOutValMap(){
		for(Map.Entry<String,ValType> entry:this.inValMap.entrySet()){
			this.outValMap.put(entry.getKey(), new ValType(entry.getValue()));
		}
	}

	public void copyInToOutValMap(String except){
		for(Map.Entry<String,ValType> entry:this.inValMap.entrySet()){
			if(entry.getKey().equals(except))
				continue;
			this.outValMap.put(entry.getKey(), new ValType(entry.getValue()));
		}
	}

	public String getVal(String id){
		if(this.inValMap.containsKey(id)){
			ValType v = this.inValMap.get(id);
			return v.getVal();
		}
		return null;
	}

}