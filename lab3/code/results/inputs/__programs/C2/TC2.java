
class TC2 {

	public static void main(String[] arg){
		C1 c;
		int a;
		int b;
		boolean b1;
		
		a = 10;
		b = 10;
		b1 = a < b;
		b1 = !b1;
		c = new C1();
		if(b1){
			a = c.set();
		}else{
			b = 20;
		}
		System.out.println(a);
	}
}
class C1{
	int ret;
	public int set(){
		int a;
		ret = 0;
		a = 10;
		ret = ret + a;
		return ret;
	}
}