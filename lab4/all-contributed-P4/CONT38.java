class Loopy3
{
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		boolean d;
		boolean e;
		boolean f;
		f = true;
		e = false;
		a = 2 * 15;
		b = 189 - 9;
		d = a < b;
		while(d)
		{	
			a = b - 2;
			b = a + 2;
			e = e & f;
			if(e)
				c = a + b;
			else
				c = b - a;

			/*LOOPINVARIANTCODE?*/f = c < b;//Yes
			/*LOOPINVARIANTCODE?*/a = c - b;//Yes
			/*LOOPINVARIANTCODE?*/b = c * b;//Yes
			d = false;
		} 
		System.out.println(b);
	}
}

