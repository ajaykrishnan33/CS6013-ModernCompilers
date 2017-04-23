/**
 * 
 */

/**
 * @author ermichan006
 *
 */
class test_case1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((new Class1()).method3(22, 18));
	}

}

class Class1{
	public int method1(int a, int b, int c, int d){
		int ret_val;
		if(!(!(!(a < b) & !(b < a)) & !(c < d)))
			ret_val = a + (d - c);
		else 
			ret_val = this.method2(b,d,c);
		return ret_val;
	}
	public int method2(int b, int c, int d){
		int ret_val2;
		if(!(c < b))
			ret_val2 = this.method1(c - b, b + c, d, c);
		else
			ret_val2 = (b - d) + c;
		return ret_val2;
	}
	public int method3(int c, int d){
		int []a;
		int i;
		int start_i;
		a = new int[c + d];
		i = 0;
		if((!((this.method2(0,c,d)) < 0)) & (((this.method2(0,c,d)) < (c + d))))
			start_i = this.method2(0,c,d);
		else
			if(((this.method2(0,c,d)) < (c + d))){
				start_i = this.method2(0,c,d);
			}
			else {
				if(!((this.method1(1,c,0,d)) < 0) & (((this.method1(1,c,0,d)) < (c + d))))
					start_i = this.method1(1,c,0,d);
				else if((this.method1(1,c,0,d)) < (c + d))
					start_i = this.method1(1,c,0,d);
				else
					start_i = 0;
			}
		while(i < start_i){
			a[i] = (i + 1) * (start_i + 1);
			i = i + 1;
		}
		for(i = start_i + 1;i < (c + d);i = i + 1){
			a[i] = start_i + (i * ((c + d) - (c * 2)));
			if(((a[i]) < 0) & (!((c + d) < (2 * i))))
				System.out.println(a[i]);
			else
				System.out.println(((c + d) - (2 * i)));
		}
		return ((a[((c + d) - 1)]) + ((c + d) - 1));
	}
}
