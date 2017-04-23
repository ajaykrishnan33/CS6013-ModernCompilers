class P1
{
	public static void main(String [] args)
	{
		int x;
		int y;
		int i;
		int l;
		int o;
		o = 1;
		x=1;
		y=2;
		l = 10;
		for(i=0;i<l;i=i+o)
		{
			/*LOOPINVARIANTCODE?*/
			x=1;
			/*LOOPINVARIANTCODE?*/
			y=x+1;
		}
		System.out.println(x);
		System.out.println(y);
	} 
}
