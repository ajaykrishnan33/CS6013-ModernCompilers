class MainDoer {
	public static void main(String[] args) {
		int temp6;
		int temp4;
		int temp5;
		int[] temp2;
		int[] temp3;
		AuxDoer temp0;
		AuxDoer temp1;
		temp0 = new AuxDoer();
		temp1 = new AuxDoer();
		temp2 = temp1.getArray();
		temp3 = temp0.printArray(temp2);
		temp4 = temp3.length;
		temp5 = 26;
		temp6 = temp4 + temp5;
		System.out.println(temp6);

	}
}
class AuxDoer extends SupAuxDoer {
	public int[] printArray (int[] arr ) {
		int temp11;
		int temp7;
		int temp8;
		boolean temp9;
		int temp10;
		int[] y;
		int i;
		y = arr;
		temp7 = 0;
		i = temp7;
		temp8 = arr.length;
		temp9 = i < temp8;
		while (temp9) {
			System.out.println(i);
			temp10 = 1;
			temp11 = i + temp10;
			i = temp11;
			temp8 = arr.length;
			temp9 = i < temp8;
		}


		return arr;
	}
	public int[] getArray ( ) {
		int temp12;
		int[] temp13;
		int temp14;
		int[] x;
		int i;
		int temp15;
		boolean temp16;
		int temp17;
		int temp18;
		temp12 = 100;
		temp13 = new int[temp12];
		x = temp13;
		temp14 = 0;
		i = temp14;
		temp15 = 100;
		temp16 = i < temp15;
		while (temp16) {
			x[i] = i;
			temp17 = 1;
			temp18 = i + temp17;
			i = temp18;
			temp15 = 100;
			temp16 = i < temp15;
		}


		return x;
	}
}
class SupAuxDoer {
}
