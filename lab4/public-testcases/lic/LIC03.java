// No
// Yes
// Yes
class LIC03 {
	public static void main (String [] args) {
		int e;
		int x;
		e = 5;
		for (x = 0; x < 10; x = x + 1) {
			/* LOOPINVARIANTCODE? */
			e = x;
			/* LOOPINVARIANTCODE? */
			e = 5;
			/* LOOPINVARIANTCODE? */
			e = 5;
		}
	}
}
