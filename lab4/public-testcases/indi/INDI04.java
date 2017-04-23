// Yes
// No
// No
class INDI04 {
	public static void main (String [] args) {
		int x;
		int e;
		int t1;
		int t2;
		int t3;
		int t4;
		int size;
		int [] arr;
		size = 100;
		arr = new int [size];
		/* INDEPENDENTITERS? */
		for (x = 0; x < 10; x = x + 1) {
			t3 = 2 * x;
			t4 = 4 * x;
			t1 = t3 + 4;
			t2 = t4 + 11;
			arr[t1] = 5;
			e = arr[t2];
		}
		/* INDEPENDENTITERS? */
		for (x = 0; x < 10; x = x + 1) {
			t2 = x;
			arr[t2] = 5;
			e = arr[t2];
		}
		/* INDEPENDENTITERS? */
		for (x = 0; x < 10; x = x + 1) {
			t2 = x;
			arr[t2] = 5;
			e = arr[t2];
		}
	}
}
