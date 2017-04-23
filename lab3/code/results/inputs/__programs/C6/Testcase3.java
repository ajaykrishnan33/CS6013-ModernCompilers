class Testcase3 {

	public static void main(String[] args) {
		int temp1;
		int temp2;
		int temp3;	
		temp1=4;
		temp2=48;
		temp3=new Divide().dividefunction(temp1,temp2);
		System.out.println(temp3);
	}
}
class Divide
{
	int count;
	public int dividefunction(int n1,int n2)
	{  int temp4;
		int temp5;
		boolean temp6;
		temp6=n1<n2;
		while(temp6)
		{
			n2=n2-n1;
			//n2 = temp4;
			temp5=1;
			count=count+temp5;
			temp6=n1<n2;
		}
		return count;
	}

}
