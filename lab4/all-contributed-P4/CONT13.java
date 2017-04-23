class P3
{
	public static void main(String [] args)
	{
		int x;
		int y;
		int z;
		int one;
		int two;
		int i;
		int[] A;
		int l;
		int tmp;
		int index;
		two = 2;
		one = 1;
		x = 0;
		y = 0;
		z = 0;
		l=20;
		A = new int[l];
		/*INDEPENDENTITERS?*/
		for(i=0;i<10;i=i+one)
		{
			/*LOOPINVARIANTCODE?*/	
			x = 5;
			/*LOOPINVARIANTCODE?*/			
			y = x+1;
			tmp = A[y];
			A[i] = tmp;
			/*LOOPINVARIANTCODE?*/
			index = 19;			
			/*LOOPINVARIANTCODE?*/
			z = A[index];
		}
	}
}
