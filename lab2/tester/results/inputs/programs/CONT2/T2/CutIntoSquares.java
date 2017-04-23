class CutIntoSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((new Rec()).cut(16, 50));
	}

}

class Rec{
	public int cut(int a, int b){
		int ret_res;
		int temp1;
		ret_res = 0;
		if(!(a < b)){
			a = a + b;
			b = a - b;
			a = a - b;
		}else{
			System.out.println(a);
			System.out.println(b);
		}
		while(!((a - 1) < 0)){
			ret_res = ret_res + (this.divide(b, a));
			temp1 = b - (a * (this.divide(b, a)));
			b = a;
			a = temp1;
		}
		return ret_res;
	}
	public int divide(int num, int denom){
		int quo;
		int rem;
		quo = 0;
		rem = 0;
		if(!(num < 0) & !(0 < num))
			quo = 0;
		else if(!(denom < 0) & !(0 < denom))
			quo = (0 - 1);
		else {
			rem = num - denom;
			while(!(rem < 0)){
				quo = quo + 1;
				rem = rem - denom;
			}
		}
		return quo;
	}
}