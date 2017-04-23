
        
class P50 {
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
		int i;
		int j;
		int k;
		i = 0;
		j = 5;
		k = 4;
		num = 1;
		for (i = 0; i < j; i = i + num){
			num = j - k;
		}
		return num;
	}
}
	
