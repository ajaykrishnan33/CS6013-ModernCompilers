class Fibonacci{  
    public static void main(String[] a)  
    {  
        Fib a;
        int b;
        int f;
        a = new Fib();
        f = 15;
        /*INLINE*/b = a.PrintFib(f);
        System.out.println(b);
    }
}

class Fib{

    public int PrintFib(int n) {
        int x;
        int y;
        int one;
        int two;
        int c;
        int d;
        boolean a;
        boolean b;
        one = 1;
        two = 2;
        a = n<one;
        b = n<two;
        if(a) 
            x=1;        
        else 
        {
            c = n - one;
            d = n - two;
            x = this.PrintFib(c);
            y = this.PrintFib(d);
            x = x+y; 
        }

        if(b)
            x=1;
        else { }
        return x;
    }
} 


