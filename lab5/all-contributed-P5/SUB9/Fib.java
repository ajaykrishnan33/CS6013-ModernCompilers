class Fib {
    public static void main(String[] a){
        int t1;
        int t3;
        int t4;
        Fibo t2;
        /*INLINE*/ t2 = new Fibo();
        t4 = 50;
        /*INLINE*/ t3 = t2.Computefib(t4);
        System.out.println(t3);
    } 
}

class Fibo {
    public int Computefib(int num){

        int lo;            
        int hi; 
        boolean t5;
        int t6;
        lo = 1;
        hi = 1;
        System.out.println(lo);
        t5 = hi < num;
        while (t5) {
            System.out.println(hi);
            hi = lo + hi; 
            lo = hi - lo;
            t5 = hi < num; 
        }

        t6 = 1;
        return t6;
    }

}
