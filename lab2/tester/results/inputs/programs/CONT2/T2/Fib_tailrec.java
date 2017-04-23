
class Fib_tailrec {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((new Fib()).get(317811));
	}
}

class Fib{
	public int get(int a){
		return this.fib(0,1,a, 2);
	}
	public int fib(int a, int b, int n, int r){
		int ret_res;
		{
			if(!((a + b) < n) & !(n < (a + b))){
				ret_res = r;
			}
			else 
				if(!((a + b) < n)){
					ret_res = 0;
				}
				else{
					ret_res = this.fib(b, a + b, n, r + 1);
				}
		}
		return ret_res;
	}
}
