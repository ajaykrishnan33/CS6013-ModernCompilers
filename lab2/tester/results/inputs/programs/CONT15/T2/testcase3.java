//Test for Not Expression
class testcase3 {
public static void main(String[] args) {
	System.out.println(new notExp().method1());
}
}

class notExp {
	public boolean method1() {
		return !(1 < 2);
	}
}
