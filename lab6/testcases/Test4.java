//no
//yes
//no
//yes
//yes
class Test4{
	public static void main(String[] args){
		int i;
		Test4Aux a;
		Test4Aux b;
		Test4Aux c;
		Test4Aux d;
		Test4Aux e;
		int one;
		int five;

		d = new Test4Aux();
		e = new Test4Aux();
		a = d;
		c = e;

		one = 1;
		five = 5;
		for(i=0;i<five;i = i + one){
			b = a;
			a = c;
			/* a alias? b */
			/* a alias? c */
			/* b alias? c */
			c = b;
		}

		/* a alias? d */
		/* c alias? e */

		one = 2;
	}
}

class Test4Aux{
	int x;
}