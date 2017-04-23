class Loopy2
{
	public static void main(String[] args) {
		int x;
		Loopy2Helper l2h;
		l2h  = new Loopy2Helper();
		x = 10;
		x = l2h.function1();
		System.out.println(x);

	}
}

class Loopy2Helper
{
	int y;
	int z;
	boolean cond;

	public int function1()
	{
		int loc1;
		int loc2;
		boolean locCond3;
		y = 10;
		z = 1100;
		locCond3  = y < z;
		for(loc1 = 1;locCond3; loc1 = loc1 + 1)
		{
		System.out.println(cond);	
			if(cond)
				loc2 = loc1 + y;
			else
				loc2 = z -loc1;
		/*LOOPINVARIANTCODE?*/z = loc2 + y;//Yes
		/*LOOPINVARIANTCODE?*/y = z - 20;//Yes
		/*LOOPINVARIANTCODE?*/locCond3  = z < y;//Yes
		}
		return z;
	}


}
