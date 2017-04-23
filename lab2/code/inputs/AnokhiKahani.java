class AnokhiKahani{
	public static void main(String[] args){
		System.out.println(new MeraBeta().chalu());
	}
}
class MeraBeta{
	ParentDoer merabaap;
	public int chalu(){
		int i;
		int p;
		merabaap = new ParentDoer().chalu();
		if(merabaap.khush()){
			System.out.println(420);
		}
		else{
			System.out.println(666);
		}
		for(i=0;i<(merabaap.getKhushiLimit());i=i+1){
			p = this.pranaam();
		}
		return 9211;
	}
	public int pranaam(){
		boolean tohkya;
		int p;
		int mila;
		int gaya;
		mila = 420;
		gaya = 0;
		p = merabaap.pranaamReceive();
		tohkya = merabaap.khush();
		if(!((!tohkya)&((2+3)<10))){
			System.out.println(mila);
		}
		else
			System.out.println(gaya);
		return 420;	
	}
}
class ParentDoer{
	ParentDoer mai;
	boolean aashirwaad;
	int pranaamCount;
	int khushiLimit;
	public ParentDoer chalu(){
		this.mai = this;
		this.aashirwaad = false;
		this.pranaamCount = 0;
		this.khushiLimit = 50;
		return mai;
	}
	public int pranaamReceive(){
		pranaamCount = pranaamCount + 1;
		if((!(pranaamCount<khushiLimit)) & (!(khushiLimit<pranaamCount))){
			this.aashirwaad = true;
			pranaamCount = 0;
		}
		else
			this.aashirwaad = false;
		return 15;
	}
	public boolean khush(){		
		return aashirwaad;
	}
	public int getKhushiLimit(){		
		return khushiLimit;
	}
}