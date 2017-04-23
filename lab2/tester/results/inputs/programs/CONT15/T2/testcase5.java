//Test case for Bracket expression
class testcase5 {
public static void main(String[] args) {
	System.out.println(new braces().compute());
}
}

class braces{
  	int a;int b;int c;
	public int compute()
	{
		c = (a-(b+4));
		return c;
	}
}
