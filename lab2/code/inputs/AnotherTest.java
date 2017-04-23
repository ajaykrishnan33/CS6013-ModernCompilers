class AnotherTest{
	public static void main(String[] args){
		System.out.println(new Foobar().init());
	}
}
class Foobar{
	int x;
	public int init(){
		this.dothis().tp(setx());
		return 0;
	}
	public Foobar dothis(){
		System.out.println("dothis: " + x);
		x = 5;
		return this;
	}
	public int setx(){
		System.out.println("setx: " + x);
		x = 10;
		return 1;
	}
	public int tp(int p){
		return 0;
	}
}