// No 
// No
// Yes
class INDI14 {
	public static void main (String [] args) {
		int x;
		int e;
		int t1;
		int t2;
		int t3;
		int t4;
		int one;
		int two;
		int three;
		int four;
		int size;
		int [] arrA;
		int [] arrB;
		size = 1000;
		e = 10;
		arrA = new int [size];
		arrB = new int [size];
		/* INDEPENDENTITERS? */
		for (x = 1; x < 2; x = x + 1) {
			one = 2 * x;
			one = one + 6;
			two = 6 * x;
			two = two + 11;
			three = 3 * x;
			three = three + 4;
			four = 12 * x;
			four = four - 3;
			t1 = one;
			t2 = two;
			t3 = three;
			t4 = four;

			arrA[t1] = e;
			arrA[t2] = e;
			arrA[t3] = e;
			e = arrA[t4];
		}
		/* INDEPENDENTITERS? */
		for (x = 1; x < 2; x = x + 1) {
			one = 2 * x;
			one = one + 6;
			two = 6 * x;
			two = two + 11;
			three = 3 * x;
			three = three + 4;
			four = 12 * x;
			four = four - 3;
			t1 = one;
			t2 = two;
			t3 = four;
			t4 = three;

			arrA[t1] = e;
			arrA[t2] = e;
			arrA[t3] = e;
			e = arrA[t4];
		}
		/* INDEPENDENTITERS? */
		for (x = 0; x < 10; x = x + 1) {
		}
	}
}
