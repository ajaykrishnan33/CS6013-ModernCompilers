class P4{ 
public static void main (String[] args){ 
	int  temp0;
	temp0 =new Loop().method1();
	System.out.println(temp0);
}
}

class Loop { 
	int  a;int  b;boolean  x;boolean  y;
	int  i;
	public int  method1( ) { 
		int int_0;int int_1;int int_2;int int_3;
		int int_4;boolean temp3;int int_5;boolean bool0;boolean bool1;
		boolean temp7;int int_6;boolean bool2;boolean bool3;
		int_0 = 1;
		a = int_0;
		int_1 = 1;
		b = int_1;
		int_2 = 0;
		int_3 = 4;
		int_4 = 1;
		/*INDEPENDENTITERS?*/
		for ( i= int_2; i<int_3; i= i+int_4) 
			{/*LOOPINVARIANTCODE?*/temp3 =x&y;
				if ( temp3){ 
					/*LOOPINVARIANTCODE?*/int_5 = 1;
					/*LOOPINVARIANTCODE?*/a = a+int_5;
					/*LOOPINVARIANTCODE?*/bool0 = false;
					/*LOOPINVARIANTCODE?*/x = bool0;
					/*LOOPINVARIANTCODE?*/bool1 = false;
					/*LOOPINVARIANTCODE?*/y = bool1;
					}
					else
						{ 
							/*LOOPINVARIANTCODE?*/temp7 =a<b;
							while ( temp7) {
								int_6 = 1;
								b = b+int_6;
								bool2 = true;
								x = bool2;
								bool3 = true;
								y = bool3;
								temp7 =a<b;
								}
						}
			}
		return b; 
} 
} 
