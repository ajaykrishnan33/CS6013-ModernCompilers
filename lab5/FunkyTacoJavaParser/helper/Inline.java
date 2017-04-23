package helper;

import syntaxtree.*;
import java.util.*;

public class Inline {
	public String class_name;
	public String func_name;

	public boolean inlinable = false;

	public String classVar;
	public String retVar;

	public String target;

	public Node ref;

	public FuncSymTab f;

	public Inline(String class_name, String func_name, String target){
		this.class_name = class_name;
		this.func_name = func_name;
		this.target = target;
	}

}