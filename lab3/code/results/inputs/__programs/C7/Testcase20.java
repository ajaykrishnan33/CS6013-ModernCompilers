
class Testcase20 {

	public static void main(String [] args){
		int t1;
		int t2;
		int t3;
		
		t1=100;
		t2=8;
		t3=new Test2().Getremainder(t1, t2);
		System.out.println(t3);
	}
}

class Test2 extends Testcase20{
	
	
	
	public int Getremainder(int i, int j){
		int n;
		int product;
		int t5;
		int t6;
		int t7;
		boolean t8;
		boolean t9;
		boolean t10;
		int t11;
		int t12;
		int t13;
		int t14;
		int t15;
		int t16;
		int t17;
		t5=0;
		t8=j<t5;
		
		if(t8){
			t13=1;
			j=j-t13;
		}
		else{
			t6=0;
			t9=i<t6;
			if(t9){
				t14=1;
				i=i-t14;
			}
			else{
				
			}
		}
		n = 1;
		product = 0;
		t11=1;
		t7=i+t11;
		t10=product<t7;
		while (t10)
		    {
				t12=j*n;
		        product =t12;
		        t17=1;
		        i=i+t17;
		        t7=i+t11;
		        t10=product<t7;
		    }
		 
		    t15=product-j;
		    
		    t16=i-t15;
		
		
		return t16;
		
	}
}