class Testcase1 {
	public static void main (String [] args) {
		int temp1;
		int temp2;
		temp2=20;
		temp1=new B1().f1(temp2); 
		System.out.println(temp1);
	}
}	
	class B1 extends Testcase1
	{
		int sum;
		int i;
		

		public int f1(int y)
		{	int temp3;
			int temp4;
			int temp5;
			int temp6;
			int temp7;
			sum=0;
			temp4=40;
			for(i=sum;y<temp4;i=y)
				{temp6=sum+i;
				//No
				/*LOOPINVARIANTCODE?*/sum = temp6;
				temp7=1;
				temp5 = y+temp7;
				y=temp5;
				}
			return sum;
		}
		
	}
