package helper;

import syntaxtree.*;

public class ArrayAccessStmt{
	public int side; // 0 --> LHS, 1 --> RHS
	public String arrName; // name of array 
	public String indexVariable; // variable used as array index
	// a*x + b, where x is the loop control variable
	public int a;
	public int b;

	public ArrayAccessStmt(String arrName, String indexVariable, String side){
		this.arrName = arrName;
		this.indexVariable = indexVariable;
		if(side.equals("LHS"))
			this.side = 0;
		else
			this.side = 1;
	}

}