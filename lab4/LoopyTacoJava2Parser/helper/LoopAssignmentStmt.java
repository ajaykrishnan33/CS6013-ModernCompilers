package helper;

import syntaxtree.*;

public class LoopAssignmentStmt{
	public int type; // 0--> AssignmentStatement, 1-->ArrayAssignmentStmt, 2-->FieldAssignmentStmt
	public String var; // variable on LHS
	// public int val;
	// public boolean validVal = false;
	public boolean loopInvariant = false;
	public Node rhs; // node on rhs
	public boolean annotated = false;
	public ArrayAccessStmt aas;
	public boolean indexRelated = false; // true if needed in computation of array index
	// a*x + b, where x is the loop control variable, applicable only if indexRelated==true
	public int a;
	public int b;

	public BlockLine block;

	public boolean insideLoop = true;

	public LoopAssignmentStmt(String id){
		this.var = id;
		this.type = 0;
	}

	public LoopAssignmentStmt(String id, int type){
		this.var = id; 
		this.type = type;
	}

	public LoopAssignmentStmt(String id, int type, Node n){
		this.var = id; 
		this.type = type;
		this.rhs = n;
	}
}