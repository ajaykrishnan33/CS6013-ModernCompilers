class DumbDoer {
	public static void main(String[] args) {
		int temp2;
		Foobar temp0;
		int temp1;
		temp0 = new Foobar();
		temp1 = 10;
		temp2 = temp0.init(temp1);
		System.out.println(temp2);

	}
}
class Foobar {
	int[] arr;
	public int init (int x ) {
		int temp11;
		int temp12;
		int temp13;
		int temp14;
		int temp10;
		int i;
		int j;
		int sum;
		int temp3;
		int temp6;
		int temp7;
		boolean temp4;
		int temp5;
		boolean temp8;
		int temp9;
		temp3 = 1;
		i = temp3;
		temp4 = i < x;
		while (temp4) {
			temp7 = 0;
			sum = temp7;
			j = i;
			temp8 = j < x;
			while (temp8) {
				temp11 = 10;
				temp12 = sum * temp11;
				temp13 = temp12 + j;
				sum = temp13;
				temp9 = 1;
				temp10 = j + temp9;
				j = temp10;
				temp8 = j < x;
			}
			System.out.println(sum);
			temp5 = 1;
			temp6 = i + temp5;
			i = temp6;
			temp4 = i < x;
		}

		temp14 = 0;

		return temp14;
	}
}
