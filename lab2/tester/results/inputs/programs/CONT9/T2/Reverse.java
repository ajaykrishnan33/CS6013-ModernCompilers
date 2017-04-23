class Reverse{
    public static void main(String[] b){
	System.out.println(new R().init(10));
    }
}


class R
{
	int sz;
	int [] a;

	public int rev(int e)
		{
			int d ;
			int f;
			int g;
			int h;
			f = 0;
			while(f<5)
			{	
				h = (e-f)-1;
				d = a[f];
				a[f] = a[h];
				a[h] = d;
				f =f+1;
			}
			g = this.print();
			return 0;
		}

	public int init(int size)
	{
		int c;
		int h;
		int i;
		sz = size;

		a = new int[size]; 

		for(c = 0; c < size;c=c+1)
		{
			a[c]  = c;
		}
		h = this.print();
		i = this.rev(sz);
		return 999;
	}

	public int print()
	{
		int j;
		j = 0;
		while(j<sz)
		{
			System.out.println(a[j]);
			j= j+1;
		}
		return 0;
	}
}
