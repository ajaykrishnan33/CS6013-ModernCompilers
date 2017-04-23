
class TC1 {
	public static void main(String[] arg){
		int a;
		int b;
		boolean b1;
		
		a = 10;
		b = 10;
		b1 = a < b;
		b1 = !b1;
		if(b1){
			System.out.println(a);
		}else{
			System.out.println(b);
		}
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
	}
}
