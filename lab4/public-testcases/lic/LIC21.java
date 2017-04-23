// No
// Yes
// Yes
class LIC21 {
	public static void main (String [] args) {
		int x;
		int e;
		int e1;
		boolean flag;
		for (x = 0; x < 10; x = x + 1) {
			e1 = 10;
			flag = true;
			while (flag) {
				e1 = 3;
				flag = false;
			}
			/* LOOPINVARIANTCODE? */
			e = e1 + 3;
			/* LOOPINVARIANTCODE? */
			e = 5;
			/* LOOPINVARIANTCODE? */
			e = 5;
		}
	}
}
