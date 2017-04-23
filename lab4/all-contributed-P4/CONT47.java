class Fib {
    public static void main(String[] a){
     int t1;
     int t3;
	int t4;
     Fibo t2;
     t2 = new Fibo();
	t4 = 50;
	t3 = t2.Computefib(t4);
     System.out.println(t3);
    } 
}

class Fibo {
    public int Computefib(int num){
    int z;
    int py;
    int c;
    int lo;            
    int hi; 
    int i;
	boolean t5;
	int t6;
    lo = 1;
    hi = 1;
    z = 0;
    System.out.println(lo);
	t5 = hi < num;
    while (t5) {
      System.out.println(hi);
      hi = lo + hi; 
      lo = hi - lo;
	t5 = hi < num; 
   }

	t6 = 1;
    for(i = 0; i < 5; i = i + 1){
       k = z + 81;
       /*LOOPINCARIANTCODE? */  py = i + z; //no
       /*LOOPINCARIANTCODE? */ c = py + 2; //no
       System.out.println(c);
}
	return t6;
}
	
}
