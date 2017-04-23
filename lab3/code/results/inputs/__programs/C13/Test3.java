
class Test3 {
	public static void main(String[] a) {
		int i; int j; int k; boolean b1; boolean b2; int z; int t1; int t2;
		z=0; i=10; k=z; i=i+k; t1=9; t2=11;
		b1=i<t2; b2=t1<i; b1=b1&b2;
		if(b1) {
			k = i+z;
			z = i+k;
		} else {
			z = i+i;
			k = z;
		}
		
		t1=21; t2=19;
		b1=z<t1; b2=t2<z; b1=b1&b2;
		
		if(b1) {
			i=k*k;
			j=z*z;
		}
		else {
			i=z*z;
			j=k*k;
		}
		
		System.out.println(i);
		System.out.println(j);
		
	}
}
 
