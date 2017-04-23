
class P1 {
	public static void main(String[] args) {
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
    	int k;
    	int n;
    	int t;
    	int a;
    	int b;
    	int c;
    	int[] arr;
    	n = 10;
    	arr = new int[n];
    	k = arr.length;
    	b = 2;
    	c = 3;
    	/* INDEPENDENTITERS? */
    	for (j = 0; j < k; j = j + 1) {
			arr[j] = 0;   
		}
    	for (j = 0; j < k; j = j + 1) {
    		t = arr[j];
    		a = j + 1;
			arr[a] = t;
			/* LOOPINVARIANTCODE? */
			a = b * c;
			arr[j] = a;
		}
    	return num;
    }
}
