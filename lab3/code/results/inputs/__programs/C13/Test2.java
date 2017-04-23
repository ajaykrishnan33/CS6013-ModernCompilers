
class Test2 {
	public static void main(String[] a) {
		int i; int j; int k; boolean b; int z;
		z=0; i=10; k=z; i=i+k;
		b = z<i;
		while(b) {
			k=k+i;
			j=1;
			i=i-j;
			b=z<i;
		}
		System.out.println(k);
	}
}
 
