class Loopy4
{
	public static void main(String[] args) {

		Loopy4Helper lh;
		int arg1;
		boolean arg2;
		int c;
		arg1 = 5;
		arg2 = true;
		lh = new Loopy4Helper();
		c = lh.func1(arg1, arg2);
		System.out.println(c);
	}
}

class Loopy4Helper
{
	int p;
	boolean q;
	LoopyHelper2 lh2;
	public int func1(int x, boolean y)
	{
		int i;
		int j;
		int [] arr;
		int ch;
		p = 8 * 6;
		x = 17 - 9;
		ch = 2;
		lh2 = new LoopyHelper2();
		arr = new int[x];
		for(i=0;i<8;i=1+i)
		{
			p = p + i;
			x = p - 1; 
			/*LOOPINVARIANTCODE?*/arr[i] = p;//Yes
			/*LOOPINVARIANTCODE?*/q = p < x;//Yes
			/*LOOPINVARIANTCODE?*/y = q & q;//Yes
			/*LOOPINVARIANTCODE?*/lh2.tmp = x;//Yes 
			System.out.println(x);
		}

		p = 5 * 9;
		x = ch * 11;
		for(j=0;j<8;j=1+j)
		{
			p = p + i;
			x = p - 1; 
			/*LOOPINVARIANTCODE?*/arr[j] = x;//Yes
			/*LOOPINVARIANTCODE?*/q = p < x;//Yes
			/*LOOPINVARIANTCODE?*/y = q & q;//Yes
			/*LOOPINVARIANTCODE?*/lh2.tmp = p;//Yes
			System.out.println(p);
		}

		return ch;
	}
}

class LoopyHelper2
{
	int tmp;
}