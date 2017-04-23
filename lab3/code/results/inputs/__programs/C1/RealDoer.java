class RealDoer {
	public static void main(String[] args) {
		boolean temp11;
		int temp12;
		int temp10;
		int[] temp2;
		int temp3;
		BowDoer temp0;
		WoofDoer temp1;
		int temp6;
		int temp7;
		int temp4;
		int temp5;
		int temp8;
		int temp9;
		temp0 = new BowDoer();
		temp1 = new WoofDoer();
		temp2 = temp1.getArray();
		temp3 = 2;
		temp4 = 3;
		temp5 = temp3 * temp4;
		temp6 = 5;
		temp7 = 7;
		temp8 = temp6 * temp7;
		temp9 = temp5 + temp8;
		temp10 = 3;
		temp11 = true;
		temp12 = temp0.realComplicatedFunc(temp2, temp9 , temp10 , temp11 );
		System.out.println(temp12);

	}
}
class WoofDoer {
	WoofDoer doer;
	public int[] getArray ( ) {
		int temp13;
		int[] temp14;
		int[] x;
		int temp19;
		int i;
		int temp15;
		int temp16;
		boolean temp17;
		int temp18;
		temp13 = 100;
		temp14 = new int[temp13];
		x = temp14;
		temp15 = 0;
		i = temp15;
		temp16 = 100;
		temp17 = i < temp16;
		while (temp17) {
			x[i] = i;
			temp18 = 1;
			temp19 = i + temp18;
			i = temp19;
			temp16 = 100;
			temp17 = i < temp16;
		}


		return x;
	}
	public WoofDoer getSpecialWoofDoer ( ) {
		WoofDoer temp22;
		WoofDoer temp20;
		WoofDoer temp21;
		temp20 = this;
		temp21 = this;
		temp20.doer = temp21;

		temp22 = this;

		return temp22;
	}
	public int getValueBetween (int a, int b ) {
		int temp23;
		int temp24;
		int temp25;

		temp23 = b - a;
		temp24 = 2;
		temp25 = temp23 - temp24;

		return temp25;
	}
}
class BowDoer {
	public int realComplicatedFunc (int[] a, int b, int c, boolean d ) {
		int temp33;
		int temp34;
		int temp35;
		int temp36;
		int temp30;
		boolean temp31;
		int temp32;
		int sum;
		int temp37;
		WoofDoer wd;
		WoofDoer temp38;
		int temp39;
		int temp50;
		int temp44;
		int temp45;
		int temp46;
		int temp47;
		int temp40;
		int temp41;
		int temp42;
		int temp43;
		int i;
		WoofDoer temp26;
		int temp48;
		WoofDoer temp27;
		int temp49;
		int temp28;
		int temp29;
		temp26 = new WoofDoer();
		temp27 = temp26.getSpecialWoofDoer();
		wd = temp27;
		temp28 = 0;
		sum = temp28;
		temp29 = 0;
		i = temp29;
		temp30 = a.length;
		temp31 = i < temp30;
		while (temp31) {
			temp34 = a[i];
			temp35 = sum + temp34;
			sum = temp35;
			temp32 = 1;
			temp33 = i + temp32;
			i = temp33;
			temp30 = a.length;
			temp31 = i < temp30;
		}
		temp36 = sum + b;
		sum = temp36;
		temp37 = sum + c;
		sum = temp37;
		if (d) {
			temp38 = wd.getSpecialWoofDoer();
			temp39 = 0;
			temp40 = a.length;
			temp41 = temp38.getValueBetween(temp39, temp40 );
			a[temp41] = sum;
		} else {
			temp42 = a.length;
			temp43 = 7;
			temp44 = temp42 - temp43;
			temp45 = 1;
			temp46 = temp44 - temp45;
			temp47 = 5;
			temp48 = sum + temp47;
			a[temp46] = temp48;
		}

		temp49 = 3;
		temp50 = sum * temp49;

		return temp50;
	}
}
