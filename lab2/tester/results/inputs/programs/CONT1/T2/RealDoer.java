class RealDoer{
	public static void main(String[] args){
		System.out.println(new BowDoer().realComplicatedFunc(new WoofDoer().getArray(), (2*3)+(5*7), 3, true));
	}
}
class WoofDoer{
	WoofDoer doer;
	public int[] getArray(){
		int[] x;
		int i;
		x = new int[100];
		for(i=0;i<100;i=i+1){
			x[i]=i;
		}
		return x;
	}
	public WoofDoer getSpecialWoofDoer(){
		this.doer = this;
		return this;
	}
	public int getValueBetween(int a, int b){
		return (b-a)-2;
	}
}
class BowDoer{
	public int realComplicatedFunc(int[] a, int b, int c, boolean d){
		int i;
		int sum;
		WoofDoer wd;
		wd = new WoofDoer().getSpecialWoofDoer();
		sum=0;
		for(i=0;i<(a.length);i=i+1){
			sum = sum + (a[i]);
		}
		sum = sum + b;
		sum = sum + c;
		if(d)
			a[(wd.getSpecialWoofDoer()).getValueBetween(0, a.length)] = sum;
		else
			a[((a.length)-7)-1] = sum+5;
		return (sum)*((3));
	}
}