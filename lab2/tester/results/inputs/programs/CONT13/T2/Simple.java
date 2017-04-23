class Simple {
	public static void main(String[] s) {
		System.out.println( new A().g() );
	}
}

class A {
	public boolean f() {
		int a; int i; int j; int k;
		a=10; i=1; j=2; k=4;
		return (!false)&(((new int[(a*a)+i])[5])<a);
	}
	
	public int g() {
		int[] v; int i;
		v = new int[2];
		i = 1; v[1]=1;
		if ((new A()).f()) i=0;
		else {{}{}{{}}}
		return v[((v.length)-(i+1))];
	}
}