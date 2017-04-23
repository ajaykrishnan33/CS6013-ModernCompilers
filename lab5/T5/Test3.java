class Test3{

	public static void main(String[] args){
		Test3Aux p;
		int q;
		int r;
		q = 5;
		p = new Test3Aux();
		p.func1();
		/*INLINE*/
		q = p.func2(q);
		System.out.println(q);
		/*INLINE*/
		r = p.func3();
		System.out.println(r);
	}

}

class Test3Aux{

	int x;

	// public int func1(int n){
	// 	boolean cond1;
	// 	boolean cond2;
	// 	int res;
	// 	int temp;
	// 	int val;
	// 	val = 0;
	// 	cond1 = n<val;
	// 	cond1 = !cond1;
	// 	cond2 = val<n;
	// 	cond2 = !cond2;
	// 	cond1 = cond1 & cond2;
	// 	if(cond1){
	// 		res = 1;
	// 	}
	// 	else{
	// 		val = 1;
	// 		temp = n-val;
	// 		/*INLINE*/
	// 		res = this.func1(temp);
	// 	}
	// 	return res;
	// }

	public int func1(){
		x = 5;
		return x;
	}

	public int func2(int n){
		x = x + n;
		return n;
	}

	public int func3(){
		return x;
	}

}
