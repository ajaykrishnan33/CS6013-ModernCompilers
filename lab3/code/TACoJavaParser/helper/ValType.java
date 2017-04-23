package helper;

import java.util.*;

public class ValType{
	public String var_name;
	public int val;
	public String type;
	public int status=0; // 0 for uninitialized, 1 for constant, 2 for non-constant

	public ValType(String var_name, String type){
		this.var_name = var_name;
		this.type = type;
	}

	public ValType(ValType v){
		this.var_name = v.var_name;
		this.val = v.val;
		this.type = v.type;
		this.status = v.status;
	}

	public void setVal(int val){
		this.val = val;
	}

	public void setVal(boolean val){
		if(val)
			this.val = 1;
		else
			this.val = 0;
	}

	public String getVal(){
		String _ret=null;
		if(this.status==1){
            if(this.type.equals("boolean")){
                if(this.val==0)
                    _ret = "false";
                else
                    _ret = "true";
            }
            else
            if(this.type.equals("int")){
                _ret = ""+this.val;
            }
        }
        return _ret;
	}

	public void meet(ValType v){
		int x = this.status;
		if(v.status==2 || this.status==2)
		{
			this.status = 2;
		}
		else
		if(v.status==1){
			if(this.status==1){
				if(this.val!=v.val)
					this.status = 2;
			}
			else
			{
				this.status = 1;
				this.val = v.val;
			}
		}
	}

}