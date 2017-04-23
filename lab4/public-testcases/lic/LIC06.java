// No
// Yes
class LIC06 {
	public static void main (String [] args) {
		int e;
		int t1;
		int t2;
		int t3;
		int t4;
		int x;
		e = 5;
		t4 = 0;
		for (x = 0; x < 10; x = x + 1) {
			t4 = t4 + 1;
			t3 = 3;
			t1 = t3 - t4;
			t4 = 1;
			t2 = t3 * t4;
			/* LOOPINVARIANTCODE? */
			e = t1 + t2;
			/* LOOPINVARIANTCODE? */
			e = 5;
		}
	}
}
