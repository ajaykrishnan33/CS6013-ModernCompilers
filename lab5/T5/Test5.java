class Test5{

	public static void main(String[] args){
		Child1 p;
		Parent1 r;
		int q;
		p = new Child1();
		r = new Parent1();
		q = 5;
		/*INLINE*/
		q = p.func1(q);
		/*INLINE*/
		q = r.func1(q);
	}

}

class Parent1{
	int x;
	public int func1(int a){
		int x;
		int y;
		y = 2;
		x = y*a;
		return x;
	}
}

class Child1{
	public int func1(int a){
		int x;
		int y;
		y = 2;
		x = y*a;
		y = 1;
		x = x + y;
		return x;
	}
}