class Test2{

	public static void main(String[] args){
		Test2Aux p;
		int q;
		int r;
		q = 5;
		r = 7;
		p = new Test2Aux();
		/*INLINE*/
		q = p.func2(q,r);
	}

}

class Test2Aux{

	int x;

	public int func1(int a, int b){
		int prod;
		x = a + b;
		prod = a*b;
		return prod;
	}

	public int func2(int a, int b){
		int q;
		/*INLINE*/
		q = this.func1(a, b);
		return q;
	}

}
