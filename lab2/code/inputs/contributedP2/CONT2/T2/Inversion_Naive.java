
class Inversion_Naive {
	public static void main (String[] args){
		System.out.println((new InMat()).calculate());
	}
}
class InMat{
	int []arr;
	public int calculate(){
		int i;
		int j;
		int ret_res;
		ret_res = 0;
		arr = new int[15];
		for(i = 0;i < (arr.length);i = i + 1){
			arr[i] = (((((this.divide(i, 2)) * 3) - i)) + 1) - (this.divide(arr.length, i));
		}
		for(i = 0;i < (arr.length);i = i + 1){
			System.out.println(arr[i]);
		}
		for(i = 0;i < (arr.length);i = i + 1){
			for(j = i + 1;j < (arr.length); j = j + 1){
				if((arr[j]) < (arr[i]))
					ret_res = ret_res + 1;
				else
					ret_res = ret_res;
			}
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
