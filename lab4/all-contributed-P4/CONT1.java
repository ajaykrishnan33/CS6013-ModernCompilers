class TC1 {
	public static void main(String[] args){
		int t1;
		int t2;
		int t3;
		boolean b;
		t1 = 0;
		t2 = 1;
		t3 = 4;
		b = true;
		while(b){
			/* LOOPINVARIANTCODE? */ t3 = t1 + t2;
			/* LOOPINVARIANTCODE? */ b = t2 < t1;
			t2 = 10;
			t1 = 30;
		}
		System.out.println(t3);
	}
}
