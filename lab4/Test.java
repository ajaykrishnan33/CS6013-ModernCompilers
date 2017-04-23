// No
// No
// Yes
// Yes
// Yes
class Test {
	public static void main (String [] args) {
	 	boolean b;
		int x;
		int e;
		boolean cond;
		int j;
		int[] y;
		Foo bar;
		e = 10;
		x = 0;
		y = new int[e];
		cond = x < 10;
		j = 4;
		bar = new Foo();
		while (cond) {
			/* LOOPINVARIANTCODE? */
			b = e < 10;
			
			/* LOOPINVARIANTCODE? */			
			bar.p = e;

			/* LOOPINVARIANTCODE? */
			e = 15;
			/* LOOPINVARIANTCODE? */
			e = 15;

			/* LOOPINVARIANTCODE? */
			y[j] = e;

			x = x + 1;
			j = j + 1;
			cond = x < 10;
		}
	}
}

class Foo{
	int p;
}