class A5{
	public static void main(String[] arg)
	{
		int[] a1;
		int[] a2;
		int[] a3;
		int[] a4;
		int[] a5;
		int[] a6;
		int i;
		int j;
		int temp;
		int temp2;
		int one;
		int two;
		
		one = 1;
		two = 2;
		j = 20;

		a1 = new int[j];
		a2 = new int[j];
		a3 = new int[j];
		a4 = new int[j];
		a5 = new int[j];
		a6 = new int[j];

		j = 19;
		/*INDEPENDENTITERS?*/for(i=one;i<j;i = i + one)
		{
			temp = two * i;
			temp2 = a2[temp];
			a1[i] = temp2;
			temp2 = a1[j];
			a3[j] = temp2;
			j = j - one;
		}




	}


}