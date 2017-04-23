
        
class P5 {
   public static void main(String [] args) {
	   int t;
	   int l;
	   l = 5;
	   t = new C().C_func(l);
      System.out.println(t);
   }
}

class C {
	public int C_func(int num) {
		
		int[] arr;
		int x;
		int y;
		int z;
		int l;
		int i;
		int j;
		int a;
		int b;
		int c;
		l = 10;
		arr = new int[l];
		x = 5;
		y = 2;
		arr[y] = x;
		z = arr[y];
		l = arr.length;
		/* INDEPENDENTITERS? */ 
		for (j = 0; j < l; j = j + 1) {
			/* INDEPENDENTITERS? */
			for (i = 0; i < l; i = i + 1) {
				/* LOOPINVARIANTCODE? */
				a = b*c;
				arr[i] = a;
				x = arr[j];
			}
			arr[j] = y; 
		}
		return num;
	}
}
	
