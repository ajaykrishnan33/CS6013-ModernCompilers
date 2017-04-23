class P5{ 
public static void main (String[] args){ 
	int  temp0;
	temp0 =new Braces().compute();
	System.out.println(temp0);
}
}

class Braces{ 
	int  a;int  b;int  c;int i;
	public int  compute( ) { 
		int int_0;int temp1;int temp2;int temp3;
		a=1;
		b=2;
		temp2=3;
		/*INDEPENDENTITERS?*/
		for(i=0;i<9;i=i+1) {
			/*LOOPINVARIANTCODE?*/int_0 = 4;
			/*LOOPINVARIANTCODE?*/temp3 = b+int_0;
			/*LOOPINVARIANTCODE?*/temp1 = temp3+i;
			/*LOOPINVARIANTCODE?*/temp2 = a+temp1;
		}
		c = temp2;
		return c; 
} 
} 
