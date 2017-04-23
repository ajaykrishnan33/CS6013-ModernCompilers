class Testcase4 {
	public static void main (String [] args) {
		int temp1;
		int temp2;
		temp2=20;
		temp1=new Test().f1(temp2); 
		System.out.println(temp1);
	}
}	
	class Test extends Testcase4
	{
		int sum;
		int i;
		

		public int f1(int y)
		{	
			int temp4;
			
			int temp6;
			
			int []A;
			sum=0;
			temp4=40;
			A=new int [temp4];
			//Yes
	        /*INDEPENDENTITERS?*/for(i=sum;y<temp4;i=i+1){
				temp6=sum+i;
				sum = temp6;
				A[i]=sum;
				
				}
			return sum;
		}
		
	}
