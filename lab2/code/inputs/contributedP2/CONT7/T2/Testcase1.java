class Testcase1{
	public static void main(String [] args_){
		System.out.println(new T1().Fun());
	}
	
}

class T1 extends Testcase1{
	int a;
	int b;
	int k;
	
	
	public boolean Fun() {
		this.a=3;
		this.b=6;
		for(k=0;k<a;k=k+1){
			if(k<a){
				System.out.println(a);
			}
			else{
				System.out.println(b);	
			}
			
			}
		return true;
	}
	
}