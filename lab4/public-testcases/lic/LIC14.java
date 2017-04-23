// Yes
// No
// No
class LIC14 {
	public static void main (String [] args) {
		int e1;
		int e;
		int x;
		boolean b1;
		b1 = true;
		if (b1) {
			e1 = 10;
		} else {
			e1 = 5;
		}

		for (x = 0; x < 10; x = x + 1) {
			e1 = 4;
			/* LOOPINVARIANTCODE? */
			e = e1;
			/* LOOPINVARIANTCODE? */
			e = x;
			/* LOOPINVARIANTCODE? */
			e = x;
		}
	}
}
