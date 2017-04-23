class pyramid{
 public static void main(String[] a){
 
 System.out.println(new py().start(6));

    }

}

class py{
    public int start(int n){
      int i;
      int j;
      for(i=1; i<n; i = i + 1){
         for(j=1; j<i; j = j + 1){
            System.out.println(j);
			}
		}
	return 0;
	}
}
