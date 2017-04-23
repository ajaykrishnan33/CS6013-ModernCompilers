class Prim {
	public static void main(String[] a) {
		System.out.println(new Port().add(10));
	}
}

// Perform addition of squares of first 10 numbers

class Port {

	public int add(int num) {
		int x;
		int sum;
		int n0;
		sum = 0;
		for (x = 0; x < num; x = x + 1) {
			n0 = this.getSquare(x);
			sum = sum + n0 ;
		}
		return sum;
	}

	public int getSquare(int q) {
		boolean yes;
		int t;
		yes = true;
		t = 1;
		while (yes) {
			if (t < q)
				t = t + 1;
			else {
				t = t + 1;
				yes = false;
			}

			t = t + 1;
		}
		return q;
	}

}
