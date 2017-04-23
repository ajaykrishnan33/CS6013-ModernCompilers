
class P3 {
   public static void main(String [] args) {
	   int t;
	   t = new C().C_func();
      System.out.println(t);
   }
}

class C {
	public int C_func() {
		int i;
		int j;
		int c;
		int v;
		int l;
		int[] arr;
		boolean d;
		boolean flag;
		boolean t;
		A a;
		i = 5;
		j = 0;
		c = 1;
		l = 1;
		i = i + i;
		arr = new int[i];
		flag = true;
		/* INDEPENDENTITERS? */
		for (j = 0; flag; j = j + 1) {
			i = j + 2;
			arr[i] = j;
			/* LOOPINVARIANTCODE? */
			l = l * 2;
			/* LOOPINVARIANTCODE? */
			c = arr.length;
			/* LOOPINVARIANTCODE? */
			c = c - 3;
			/* LOOPINVARIANTCODE? */
			flag = j < c;
		}
		return c;
	}
}
