class A2{
	public static void main(String[] arg)
	{
		int x;
		int y;
		int z;
		int i;
		int k;
		boolean a;
		boolean b;

		x =10;
		y = 20;
		a = x < y;
		k = 10;

		for(i=0;i<10;i = i + 1)
		{
			if(a)
				/*LOOPINVARIANTCODE?*/z = 2 + 3;
			else
				/*LOOPINVARIANTCODE?*/z = i + k;
			/*LOOPINVARIANTCODE?*/k = k - 1;
		}
		
	}
}