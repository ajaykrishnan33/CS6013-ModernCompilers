class TC5 {
	public static void main(String[] args) {
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int p;
		int[] a;
		l = 30;
		a = new int[l];
		l = 0;
		j = 10;
		m = 20;
		n = 10;
		k = 20;
		/* INDEPENDENTITERS? */ for(i = 1;i < 10;i = i + 1){
			m = i + 1;
			a[i] = m; // S1
			for(j = 1;j < 10;j = j + 1){
				/* LOOPINVARIANTCODE? */ k = l + m;
				n = k + l;
				p = a.length;
				p = p - j;
				a[p] = n; // S2
				p = a[p];
//				System.out.println(p);
			}
			/* LOOPINVARIANTCODE? */ m = m + k;
			System.out.println(m);
		}
	}

}
