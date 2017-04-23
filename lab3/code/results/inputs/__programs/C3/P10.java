class P10 {
   public static void main(String [] args) {
	  int temp;
	  int t;
	  temp = 20;
	  t = new A().A_func(temp);
      System.out.println(t);
   }
}

class A {
	int i;
    public int A_func(int num){
    	int j;
    	boolean k;
    	int n;
    	n = 0;
    	j = 2;
    	k = false;
        k = n < j;
        if (k) {
			num = 20;
		}
        else {
			num = 10;
		}
        return num;
    }
}
