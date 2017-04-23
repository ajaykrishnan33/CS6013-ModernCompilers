class P2
{
	public static void main(String [] args)
	{
		int x;
		int y;
		int z;
		int i;
		int tmp;
		int a;
		int b;
		int l;
		int[] A;
		a = 1;
		b = 0;
		l=20;
		A = new int[l];
		A[b]=b;
		A[a]=a;
		/*INDEPENDENTITERS?*/
		for(i=2;i<20;i=i+a)
		{
			tmp = i-1;
			x = A[tmp];
			tmp = i-2;
			y = A[tmp];
			/*LOOPINVARIANTCODE?*/
			z = x + y;
			A[i] = z;
		}
		tmp = 19;
		z  = A[tmp];
		System.out.println(z);
	} 
}
