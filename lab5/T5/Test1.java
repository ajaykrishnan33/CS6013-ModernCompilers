class Test1{

	public static void main(String[] args){
		Test1Aux p;
		int q;
		int r;
		q = 5;
		r = 7;
		p = new Test1Aux();
		/*INLINE*/
		q = p.func2(q,r);
		System.out.println(q);
	}

}

class Test1Aux{

	int x;

	public int func1(int a, int b){
		int prod;
		// x = a + b;
		prod = a*b;
		return prod;
	}

	public int func2(int a, int b){
		int x;
		/*INLINE*/
		x = this.func1(a, b);
		return a;
	}

}
