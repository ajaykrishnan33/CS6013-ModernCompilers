class in8 {
	public static void main(String[] args) {
		Array2 a1;
		int a2;
		a1 = new Array2();
		a2 = a1.sum();
		System.out.println(a2);
	}
}

class Array2 {
	int[] a;

	public int sum() {
		int s;
		int p;
		int q;
		int r;
		int i;
		int x;
		int j;

		int a3;
		int[] a4;
		int a5;
		int a6;
		int a7;
		int a8;
		int a9;
		int a10;
		int a11;
		int a12;
		int a13;
		int a14;
		int a15;
		int a16;
		int a17;
		boolean a18;
		int a19;
		int a20;
		int a21;
		int a22;
		int a23;
		boolean a24;
		int a25;
		int a26;
		int a27;
		int a28;
		int a29;
		int a30;
		a3 = 5;
		a4 = new int[a3];
		a = a4;
		a5 = 0;
		s = a5;
		a6 = 0;
		a7 = 1;
		a[a6] = a7;
		a8 = 1;
		a9 = 1;
		a[a8] = a9;
		a10 = 2;
		a11 = 1;
		a[a10] = a11;
		a12 = 3;
		a13 = 1;
		a[a12] = a13;
		a14 = 4;
		a15 = 1;
		a[a14] = a15;
		a16 = 0;
		i = a16;
		a17 = 5;
		a18 = i < a17;
		a19 = 1;
		a20 = i + a19;
		i = a20;
		for (i = a16; a18; i = a20) {
			{
				a21 = 1;
				a22 = i + a21;
				j = a22;
				a23 = 5;
				a24 = j < a23;
				a25 = 1;
				a26 = j + a25;
				j = a26;
				for (j = a22; a24; j = a26) {
					{
						a27 = a[i];
						p = a27;
						a28 = a[j];
						q = a28;
						a29 = p * q;
						r = a29;
						a30 = s + r;
						s = a30;

					}
					a25 = 1;
					a26 = j + a25;
					j = a26;
					a23 = 5;
					a24 = j < a23;
				}

			}
			a19 = 1;
			a20 = i + a19;
			i = a20;
			a17 = 5;
			a18 = i < a17;
		}

		return s;
	}

}
