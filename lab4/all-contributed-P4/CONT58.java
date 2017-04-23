class P3{ 
public static void main (String[] args){ 
	boolean  temp0;
	temp0 =new NotExp().method1();
	System.out.println(temp0);
}
}

class NotExp{ 
	public boolean  method1( ) { 
		int int_0;
		int int_1;boolean temp1;
		boolean bool0;int[] A;int[] B; int i;int temp2;int temp3;int temp4;int temp5;int temp6;int temp7;
		int_1 = 10;
		int_0 = 8;
		A = new int[int_1];
		B = new int[int_1];
		temp1 = false;
		/*INDEPENDENTITERS?*/
		for(i=0;i<9;i=i+1)
		{
			/*LOOPINVARIANTCODE?*/A[i] = int_1;
			/*LOOPINVARIANTCODE?*/temp2 = int_1 + 2;
			/*LOOPINVARIANTCODE?*/B[i] = temp2;
		}
		/*INDEPENDENTITERS?*/
		for(i=0;i<9;i=i+1)
		{
			/*LOOPINVARIANTCODE?*/int_1 = i+1;
			/*LOOPINVARIANTCODE?*/temp5 = A[i];
			/*LOOPINVARIANTCODE?*/temp3 = temp5 + 3;
			/*LOOPINVARIANTCODE?*/A[int_1] = temp3;
			/*LOOPINVARIANTCODE?*/temp6 = B[i];
			/*LOOPINVARIANTCODE?*/temp7 = A[int_1];
			/*LOOPINVARIANTCODE?*/temp4 = temp6 + temp7; 
			/*LOOPINVARIANTCODE?*/B[int_1] = temp4;
			/*LOOPINVARIANTCODE?*/temp1 = int_1 < int_0;
		}
		bool0 = !temp1;
		return bool0;
}
} 
