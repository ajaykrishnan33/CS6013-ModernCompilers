class P2{ 
public static void main (String[] args){ 
	int int_0;int  temp0;
	int_0 = 7;
	temp0 =new Arr().array_chk(int_0);
	System.out.println(temp0);
}
}

class Arr{ 
	int[]  myIntarry;
	int  res;
	public int  array_chk( int val) { 
		int int_1;
		int int_2;
		int temp1;
		int int_3;int int_4;int int_5;int i;int temp2;
		
		int_1 = 19;
		int_2 = 1;
		temp1 =int_1+int_2;
		int_5 = 3;
		myIntarry = new int[temp1];
		/*INDEPENDENTITERS?*/
		for(i=0;i<9;i=i+1)
		{
			/*LOOPINVARIANTCODE?*/myIntarry[i] = i;
		}
		/*INDEPENDENTITERS?*/
		for(i=0;i<5;i=i+1)
		{
			/*LOOPINVARIANTCODE?*/int_3 = 2*i;
			/*LOOPINVARIANTCODE?*/int_4 = int_3 + int_5;
			/*LOOPINVARIANTCODE?*/temp2 = myIntarry[int_5];
			/*LOOPINVARIANTCODE?*/myIntarry[int_4] = temp2;
			/*LOOPINVARIANTCODE?*/res = myIntarry[int_4];
		}
		return res; 
} 
} 
