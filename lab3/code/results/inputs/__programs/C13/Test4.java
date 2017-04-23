
class Test4 {
	public static void main(String[] a) {
		boolean b1; boolean b2; boolean b3; boolean b4;boolean b;
		int o; int z; int i; int t; 
		
		o=1; z=0; t=20;
		
		b1=true; b2=!b1;
		b3 = b1&b2;
		b4 = o<z;
		b1 = !b3;
		b = !b4;
		b = b1&b;
		
		if(b) {
			i=0; b1=i<t;
			while(b1) {
				System.out.println(o);
				System.out.println(i);
				i=i+o;
				b1=i<t;
			}
		} else {
			System.out.println(z);
		}
		
	}
}
 
