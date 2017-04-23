
class P40 {
   public static void main(String [] args) {
	   int t;
	   t = new C().C_func();
      System.out.println(t);
   }
}

class C {
	public int C_func() {
		int[] a;
		int[] b;
		int num;
		int num1;
		int v;
		int l;
		int a1;
		int b1;
		int p;
		v= 0;
		l = 0;
		num = 1;
		l = l + num;
		l = l + num;
		num1 = num + num;
		a = new int[num];
		a[v] = v;
		b = new int[num1];
		p = a[v];
		b[v] = p;
		a[v] = l;
		a1 = b[v];
		b1 = a[v];
		p = a1 + b1;
		b[num] = p;
		p = b[num];
		p = p + num1;
		return p;
	}
}
