class WowDoer{
	public static void main(String[] args){
		System.out.println(new BoringDoer().init());
	}
}
class BoringDoer{
	boolean x;
	SuperDoer sd;
	public int init(){
		x = false;
		return this.doSomething();
	}
	public SuperDoer getSuperDoer(){
		if(!x){
			sd = new SuperDoer();
			x = true;
		}
		else
			System.out.println(700);
		return sd;
	}
	public int doSomething(){
		int p;
		int i;
		p = 5;
		i = 200;
		while(i<1500){
			(this.getSuperDoer()).value = i;
			System.out.println((this.getSuperDoer()).getValue());
			i = i + 200;
		}
		return i;
	}

}
class SuperDoer{
	int value;
	public int getValue(){
		return value;
	}
}