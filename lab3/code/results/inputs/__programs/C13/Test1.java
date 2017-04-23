
class Test1 {
	public static void main(String[] a) {
		int i; int j; int k; int s; boolean b;
		i=10;
		j=i+i;
		k=j+i;
		b = j<k;
		if(b) {
			j=40;
		} else {
			k=20; 
		}
		s = 0; s=s+i; s=s+j; s=s+k;
		System.out.println(s);
	}
}
