class TC2 {
	public static void main(String[] args){
		int[] a;
		int b;
		int c;
		boolean t;
		boolean q;
		boolean r;
		int e;
		int i;
		int j;
		int k;
		int l;
		int p;
		int o;
		int re;
		o = 30;
		a = new int[o];
		b = 25;
		c = 5;
		i = 20;
		p = a.length;
		t = p < 1;
		l = 1;
		t = !t;
		q = i < p;
		/* INDEPENDENTITERS? */ for(re = 1; re < p;re = re + 1){
			/* LOOPINVARIANTCODE? */ o = b + c;
			a[l] = o; // S1
			j = i + l;
			/* LOOPINVARIANTCODE? */ k = j + i;
			i = j + k;
			t = l < p;
			q = i < p;
			r = !q;
			if(r){
				q = !q;
			}else{
				i = i - 5;
				j = j - 5;
				System.out.println(j);
			}
			p = a[l]; // S2
			System.out.println(i);
		}
		p = a[l];
		System.out.println(p);
		
	}
}