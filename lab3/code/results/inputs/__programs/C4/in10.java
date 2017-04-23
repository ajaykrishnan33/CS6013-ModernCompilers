class in10 {
	public static void main(String[] args) {
		Demo a1;
		int a3;
		int a4;
		int a5;
		int a2;
		a1 = new Demo();
		a3 = 3;
		a4 = 4;
		a5 = 5;
		a2 = a1.compute(a3, a4, a5);
		System.out.println(a2);
	}
}

class Demo {
	int x;
	int y;
	int z;
	int m;
	int n;

	public int compute(int x, int y, int z) {
		int v;
		int ret;

		Demo a6;
		int a7;
		int a8;
		boolean a9;
		int a10;
		int a11;
		boolean a12;
		int a13;
		int a14;
		boolean a15;
		boolean a16;
		boolean a17;
		int a18;
		int a19;
		int a20;
		boolean a21;
		boolean a22;
		boolean a23;
		boolean a24;
		boolean a25;
		boolean a26;
		boolean a27;
		boolean a28;
		int a29;
		int a30;
		int a31;
		int a32;
		boolean a33;
		int a34;
		int a35;
		int a36;
		a6 = this;
		a7 = a6.assign(x, y, z);
		v = a7;
		ret = v;
		a8 = 3;
		a9 = x < a8;
		if (a9) {
			a10 = ret * x;
			ret = a10;
		} else {
			{
			}
		}
		a11 = 90;
		a12 = y < a11;
		if (a12) {
			a13 = ret + y;
			ret = a13;
		} else {
			a14 = 50;
			a15 = z < a14;
			a16 = a15;
			a17 = !a16;
			if (a17) {
				a18 = ret - y;
				ret = a18;
			} else {
				a19 = 4;
				a20 = ret - a19;
				ret = a20;
			}
		}
		a21 = v < m;
		a22 = a21;
		a23 = !a22;
		a24 = a23;
		a25 = m < v;
		a26 = a25;
		a27 = !a26;
		a28 = a24 & a27;
		if (a28) {
			a29 = 1;
			a30 = ret + a29;
			ret = a30;
		} else {
			a31 = 1;
			a32 = ret * a31;
			ret = a32;
		}
		a33 = true;
		if (a33) {
			a34 = ret * ret;
			ret = a34;
		} else {
			a35 = 2;
			a36 = ret & a35;
			ret = a36;
		}

		return ret;
	}

	public int assign(int p, int q, int r) {
		int ret;

		Demo a37;
		Demo a38;
		Demo a39;
		Demo a40;
		int a41;
		Demo a42;
		int a43;
		a37 = this;
		a37.x = p;
		a38 = this;
		a38.y = q;
		a39 = this;
		a39.z = r;
		a40 = this;
		a41 = p * q;
		a40.m = a41;
		a42 = this;
		a43 = p + q;
		a42.n = a43;
		ret = m;

		return ret;
	}

}
