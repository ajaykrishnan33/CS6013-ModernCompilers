

class P2 {
   public static void main(String [] args) {
	  int t;
	  t = new C().C_func();
      System.out.println(t);
   }
}

class C {
	public int C_func() {
		B b;
		int i;
		int j;
		int k;
		i = 5;
		b = new B();
		/* INDEPENDENTITERS? */
		for (j = 0; j < i; j = j + 1) {
			k = this.C_2(b,i);
		}
		return i;
	}
	public int C_2(A obj,int i) {
		int t;
		t = obj.A_func(i);
		return t;
	}
}

class B extends A{
	public int B_func(int num) {
		int j;
		j= 5;
		num = num +j;
		return num;
	}
}

class A {
	
    public int A_func(int num){
    	int k;
    	k = 10;
    	num = num + k;
    	return k;
    }
}
