
class Fib_memo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((new fib2()).get(317811));
	}
}

class fib2 {
	int [] fib_array;
	int fib_index;
	public int get(int a){
		int init_ret;
		int calc_ret;
		init_ret = this.initialize();
		calc_ret = this.calc();
		fib_index = this.find(a);
		return fib_index;
	}
	public int initialize(){
		int i;
		fib_array = new int[48];
		fib_index = 0;
		for(i = 0;i < (fib_array.length);i = i + 1)
			fib_array[i] = 0;
		fib_array[0] = 0;
		fib_array[1] = 1;
		return 1;
	}
	public int calc(){
		int i;
		for(i = 2;i < (fib_array.length);i = i + 1){
			fib_array[i] = (fib_array[(i - 1)]) + (fib_array[(i - 2)]);
		}
		return 1;
	}
	public int find(int n){
		int i;
		int ret_val;
		ret_val = 0 - 1;
		for(i = 0;i < (fib_array.length);i = i + 1){
			if(!((fib_array[i]) < n) & !(n < (fib_array[i])))
				ret_val = i;
			else{
				if((fib_array[i]) < 0)
					System.out.println(((fib_array[i]) * (0 - 1)));
				else
					System.out.println((fib_array[i]));
			}
				
		}
		return ret_val;
	}
}
