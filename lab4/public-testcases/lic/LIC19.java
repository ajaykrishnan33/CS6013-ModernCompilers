// No
// Yes
// Yes
class LIC19 {
	public static void main (String [] args) {
	 	boolean b;
		int x;
		int e;
		e = 10;
		for (x = 0; x < 10; x = x + 1) {
			/* LOOPINVARIANTCODE? */
			b = e < 10;
			/* LOOPINVARIANTCODE? */
			e = 15;
			/* LOOPINVARIANTCODE? */
			e = 15;
		}
	}
}
