package helper;

import java.util.*;
import syntaxtree.*;

public class BlockLine{
	public ArrayList<BlockLine> predecessors = new ArrayList<BlockLine>();
	public ArrayList<BlockLine> successors = new ArrayList<BlockLine>();

	public HashMap<LoopAssignmentStmt, Boolean> inVals = new HashMap<LoopAssignmentStmt, Boolean>();
	public HashMap<LoopAssignmentStmt, Boolean> outVals = new HashMap<LoopAssignmentStmt, Boolean>();
	public LoopAssignmentStmt las; // if null, then GEN = null and KILL = null => PRSV = all => out = in
	// if not null, then GEN = {las.var}, PRSV = all other statements without var on LHS
	// in = U out(pred); out = gen U (in intersect prsv)
	public void propagate(){
		for(Map.Entry<LoopAssignmentStmt, Boolean> entry:inVals.entrySet()){
			LoopAssignmentStmt l = entry.getKey();
			boolean val = entry.getValue();
			if(las!=null && l.var.equals(las.var))
				outVals.put(l, false);
			else
				outVals.put(l, val);
		}
		if(las!=null){
			outVals.put(las, true);
		}
	}

	public int rdCount(String var){
		int count = 0;
		for(Map.Entry<LoopAssignmentStmt, Boolean> entry:inVals.entrySet()){
			LoopAssignmentStmt l = entry.getKey();
			boolean val = entry.getValue();
			if(val && l.var.equals(var)){
				count++;
			}
		}
		return count;
	}

}