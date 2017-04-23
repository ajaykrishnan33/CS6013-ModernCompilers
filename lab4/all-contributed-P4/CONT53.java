class A3{
	public static void main(String[] arg)
	{
		int a1;
		int a2;
		int a3;
		int a4;
		int a5;
		int a6;
		int i;
		int j;


		a1 = 1;
		a2 = 2;
		a3 = 3;
		a4 = 4;
		a5 = 5;
		a6 = 6;

		for(i=0;i<10;i = i + 1)
		{
			/*LOOPINVARIANTCODE?*/a1 = a2 + a3;
			/*LOOPINVARIANTCODE?*/a4 = a5 + a6;
			/*LOOPINVARIANTCODE?*/a5 = a4;
			/*LOOPINVARIANTCODE?*/a2 = a1;
			 
		}



	}
}