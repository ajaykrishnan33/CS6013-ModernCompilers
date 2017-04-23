class Test4{

	public static void main(String[] args){
		Child p;
		int q;
		p = new Child();
		q = 5;
		/*INLINE*/
		q = p.func1(q);
		/*INLINE*/
		q = p.func3(q);
	}

}

class Parent{
	int m;
	public int func1(int a){
		int m;
		int y;
		y = 2;
		m = y*a;
		return m;
	}
	public int func3(int a){
		int m;
		int y;
		y = 2;
		m = y*a;
		y = 1;
		m = m + y;
		return m;
	}
}

class Child extends Parent{
	public int func1(int a){
		int m;
		int y;
		y = 2;
		m = y*a;
		y = 1;
		m = m + y;
		return m;
	}
	public int func2(int a){
		int m;
		int y;
		y = 2;
		m = y*a;
		y = 1;
		m = m + y;
		return m;
	}
}

class Wild extends Child{
	public int func3(int a){
		int m;
		int y;
		y = 2;
		m = y*a;
		y = 1;
		m = m + y;
		return m;
	}
}