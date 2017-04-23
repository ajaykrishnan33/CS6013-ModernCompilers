class A1{
	public static void main(String[] arg)
	{
		int x;
		int y;
		int z;
		int i;

		z = 25;

		for(i=0;i<10;i=i+1)
		{
			/*LOOPINVARIANTCODE?*/y = z;
			/*LOOPINVARIANTCODE?*/z = z + 1;
		}
	}
}