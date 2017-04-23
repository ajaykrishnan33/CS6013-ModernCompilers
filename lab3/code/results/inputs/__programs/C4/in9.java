class in9 {
	public static void main(String[] args) {
		ABC a1;
		int a3;
		int a2;
		a1 = new ABC();
		a3 = 7;
		a2 = a1.mult(a3);
		System.out.println(a2);
	}
}

class ABC extends XYZ {
	ABC a1;
	int a3;
	int a2;
	int a;
	int b;
	int c;

	public int mult(int val) {
		int ret;
		int v;

		int a4;
		int a5;
		int a6;
		ABC a7;
		int a8;
		ABC a9;
		int a11;
		int a10;
		int a12;
		boolean a13;
		int a14;
		int a15;
		int a16;
		int a17;
		int a18;
		int a19;
		int a20;
		int a21;
		int a22;
		int a23;
		int a24;
		int a25;
		int a26;
		int a27;
		int a28;
		int a29;
		int a30;
		a4 = 9;
		a = a4;
		a5 = 7;
		b = a5;
		a6 = 2;
		c = a6;
		a7 = this;
		a8 = 0;
		a7.x = a8;
		a9 = this;
		a11 = 2;
		a10 = a9.add(a11, val);
		v = a10;
		a12 = 10;
		a13 = val < a12;
		if (a13) {
			a14 = 2;
			a15 = a14 * val;
			a16 = a15;
			a17 = p * q;
			a18 = a17;
			a19 = a16 * a18;
			a20 = a19;
			a21 = a20 * r;
			a22 = a21;
			a23 = a22 + v;
			ret = a23;
		} else {
			{
				a24 = val * p;
				a25 = a24;
				a26 = q * r;
				a27 = a26;
				a28 = a25 * a27;
				ret = a28;
				a29 = ret + ret;
				ret = a29;
				a30 = ret + v;
				ret = a30;

			}
		}

		return ret;
	}

}

class XYZ extends PQR {
	int a4;
	int a5;
	int a6;
	ABC a7;
	int a8;
	ABC a9;
	int a11;
	int a10;
	int a12;
	boolean a13;
	int a14;
	int a15;
	int a16;
	int a17;
	int a18;
	int a19;
	int a20;
	int a21;
	int a22;
	int a23;
	int a24;
	int a25;
	int a26;
	int a27;
	int a28;
	int a29;
	int a30;
	int x;
	int y;
	int z;

}

class PQR {
	int p;
	int q;
	int r;

	public int add(int dm, int val) {
		int ret;

		PQR a31;
		int a32;
		PQR a33;
		int a34;
		PQR a35;
		int a36;
		int a37;
		boolean a38;
		int a39;
		int a40;
		boolean a41;
		int a42;
		int a43;
		a31 = this;
		a32 = 1;
		a31.p = a32;
		a33 = this;
		a34 = 2;
		a33.q = a34;
		a35 = this;
		a36 = 9;
		a35.r = a36;
		a37 = 2;
		a38 = dm < a37;
		if (a38) {
			a39 = p + val;
			ret = a39;
		} else {
			a40 = 3;
			a41 = dm < a40;
			if (a41) {
				a42 = q + val;
				ret = a42;
			} else {
				a43 = r + val;
				ret = a43;
			}
		}

		return ret;
	}

	public int mult(int val) {
		int ret;

		int a44;
		boolean a45;
		int a46;
		int a47;
		int a48;
		int a49;
		int a50;
		int a51;
		int a52;
		int a53;
		int a54;
		int a55;
		int a56;
		int a57;
		int a58;
		int a59;
		a44 = 10;
		a45 = val < a44;
		if (a45) {
			a46 = 2;
			a47 = a46 * val;
			a48 = a47;
			a49 = p * q;
			a50 = a49;
			a51 = a48 * a50;
			a52 = a51;
			a53 = a52 * r;
			ret = a53;
		} else {
			{
				a54 = val * p;
				a55 = a54;
				a56 = q * r;
				a57 = a56;
				a58 = a55 * a57;
				ret = a58;
				a59 = ret + ret;
				ret = a59;

			}
		}

		return ret;
	}

}
