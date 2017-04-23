
class P30 {
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
		boolean d;
		boolean flag;
		boolean t;
		A a;
		i = 5;
		j = 0;
		c = 1;
		l = 1;
		flag = j < i;
		while(flag){
			j = c + j;
			flag = j < i;
			v = j - l;
			d = v < l;
			if (d) {
				c = 1;
			}
			else {
				c = 2;
			}
		}
		return c;
	}
}
