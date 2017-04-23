class Fib {
    public static void main(String[] a){
     System.out.println(new Fibo().Computefib(50));
    } 
}

class Fibo {
    public int Computefib(int num){

    int lo;            
    int hi; 
    lo = 1;
    hi = 1;
    System.out.println(lo);
    while (hi < num) {
      System.out.println(hi);
      hi = lo + hi; 
      lo = hi - lo; 
   }
	return 1;
}
	
}
