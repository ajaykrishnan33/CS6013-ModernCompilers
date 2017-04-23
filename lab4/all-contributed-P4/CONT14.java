class P41
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
		int j;
		two = 2;
		one = 1;
		x = 0;
		y = 0;
		z = 0;
		l=20;
		A = new int[l];
		/*INDEPENDENTITERS?*/
		for(i=0;i<7;i=i+one)
		{
			for(j=0;j<7;j=j+one){
				x = 2*i;
				y = 3*j;
				tmp = A[x];
				A[y] = tmp;
				index = 19;			
				z = A[index];
			}
		}
		System.out.println(z);
	}
}