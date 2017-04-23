//Test case for all loops (Expression => Identifier)
class testcase4 {
public static void main(String[] args) {
	System.out.println(new loop().method1());
}
}

class loop {
	int a;int b;boolean x;boolean y;int i;
	public int method1() {
	a=1;b=1;
	for (i = 0; i < 4; i = i+1)
		if(x&y) 
			{a = a+1;x = false; y = false;}
		else
			while(a<b)
                            { b = b+1; x = true; y = true; }
	return b;
}
}
                             
