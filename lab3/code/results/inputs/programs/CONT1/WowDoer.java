class WowDoer {
	public static void main(String[] args) {
		BoringDoer temp0;
		int temp1;
		temp0 = new BoringDoer();
		temp1 = temp0.init();
		System.out.println(temp1);

	}
}
class BoringDoer {
	SuperDoer sd;
	boolean x;
	public int init ( ) {
		int temp4;
		boolean temp2;
		BoringDoer temp3;
		temp2 = false;
		x = temp2;

		temp3 = this;
		temp4 = temp3.doSomething();

		return temp4;
	}
	public SuperDoer getSuperDoer ( ) {
		SuperDoer temp6;
		boolean temp7;
		boolean temp5;
		int temp8;
		temp5 = !x;
		if (temp5) {
			temp6 = new SuperDoer();
			sd = temp6;
			temp7 = true;
			x = temp7;
		} else {
			temp8 = 700;
			System.out.println(temp8);
		}


		return sd;
	}
	public int doSomething ( ) {
		int temp11;
		boolean temp12;
		BoringDoer temp13;
		SuperDoer temp14;
		int temp10;
		int temp19;
		int i;
		BoringDoer temp15;
		SuperDoer temp16;
		int temp17;
		int temp18;
		int p;
		int temp9;
		temp9 = 5;
		p = temp9;
		temp10 = 200;
		i = temp10;
		temp11 = 1500;
		temp12 = i < temp11;
		while (temp12) {
			temp13 = this;
			temp14 = temp13.getSuperDoer();
			temp14.value = i;
			temp15 = this;
			temp16 = temp15.getSuperDoer();
			temp17 = temp16.getValue();
			System.out.println(temp17);
			temp18 = 200;
			temp19 = i + temp18;
			i = temp19;
			temp11 = 1500;
			temp12 = i < temp11;
		}


		return i;
	}
}
class SuperDoer {
	int value;
	public int getValue ( ) {


		return value;
	}
}
