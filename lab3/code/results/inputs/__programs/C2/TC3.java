
class TC3 {

	public static void main(String[] arg){
		int a;
		int b;
		int ret;
		boolean b1;
		C2 c;
		a = 10;
		b = 20;
		c = new C2();
		b = c.set();
		b1 = b < a;
		if(b1){
			b = c.set();
			a = b - a;
		}else{
			c.ret = b;
			a = b - a;
		}
		ret = a + b;
		System.out.println(ret);
	}
}

class C2{
	int ret;
	public int set(){
		boolean b1;
		int a1;
		int a2;
		ret = 0;
		a1 = 10;
		a2 = 20;
		b1 = a1 < a2;
		if(b1)
			ret = a1 + a2;
		else
			ret = a2 - a1;
		return ret;
	}
}
