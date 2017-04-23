class A4{
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
		int one;
		int temp1;
		int temp2;

		j = 20;
		one = 1;
		a1 = new int[j];
		a2 = new int[j];
		a3 = new int[j];
		a4 = new int[j];
		a5 = new int[j];
		a6 = new int[j];

		j = 9;
		/*INDEPENDENTITERS?*/for(i=0;i<10;i = i + 1)
		{
			a1[i] = 1;
			a2[i] = 2;
			a3[i] = 3;
			a4[i] = 4;
			a5[i] = 5;
			a6[i] = 6;
		}



		/*INDEPENDENTITERS?*/for(i=0;i<10;i = i + 1)
		{			
			temp2 = a1[j];
			a1[i] = temp2;
			j = j - one; 
		}

		j = 0;
		/*INDEPENDENTITERS?*/for(i=0;i<10;i = i + one)
		{
			temp1 = i + j;
			temp2 = a3[i];
			a2[temp1] = temp2;
			temp2 = a2[i];
			a4[temp1] = temp2;
			j = j - 1; 
		}


		/*INDEPENDENTITERS?*/for(i=0;i<10;i = i + one)
		{
			temp1 = a4[i];
			System.out.println(temp1);
		}

	}

}