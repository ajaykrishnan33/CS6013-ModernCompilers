class Amstrong {
    public static void main(String[] a){
        ANumber a;
        int b;
        int x;
        a = new ANumber();
        x = 153;
        /*INLINE*/b = a.Compute(x);
        System.out.println(b);
    }
}


class ANumber{


    public int Compute(int n){
        int c;
        int a;
        int b;
        int temp; 
        boolean x;
        boolean y;
        c=0;  
        x = c < n;
        while(x)  
        {
            b=this.DivByTen(n);
            a=n-b;    
            n=b;  
            b=a*a;
            b=a*b;
            c=c+b;  
        }
        b=n-c;  
        y = !b;
        if(y)  
            a=0;   
        else  
            a=1;
        return a;  
    }
    public int DivByTen(int n){

        int x;
        int y;
        int one;
        int ten;
        boolean a;
        y=0;
        x=10;
        one = 1;
        ten = 10;
        a = x<n;
        while(a)
        { 
            y = y+one;
            x = x+ten;
        }
        return y;
    }

}  










