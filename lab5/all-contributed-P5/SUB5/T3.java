class T3{
    public static void main(String[] a){
        SumNum f0; 
        SumNum fib; 
        int t0; 
        int t1;
        int f;
        f0=new SumNum();
        fib=new SumNum();
        t0=6; 
        /*INLINE*/t1=f0.getSum(t0);
        System.out.println(t1);
        /*INLINE*/f=fib.getFibo(t1);
    }
}



class SumNum{
    public int  getSum(int  n){
        int  retval;
        int  i;
        int t2;
        int t3;
        int t4;
        int t5;
        int t6;
        SumNum fib; 
        boolean b0;
        int t7;
        int f;
        t2=0;
        retval=t2;
        t3=0;
        i=t3;
        b0=i<n;
        while(b0){
            t4=retval+i;
            retval=t4;
            t5=1;
            t6=i+t5;
            i=t6;
            b0=i<n;
        }
        t7=retval+i; 
        retval=t7;
        fib=new SumNum();
        /*INLINE*/f=fib.getFibo(retval);

        return f;
    }

    public int  getFibo(int  n){
        int  retval;
        int  val1;
        int  val2;
        int t2;
        boolean b0;
        int t3;
        int t4;
        int t5;
        int t6;
        int t7;
        int t8;
        int t9;
        int t10;
        t2=3;
        b0=n<t2;
        if(b0){
            t3=1;
            retval=t3;
        }
        else
        {
            t4=1;
            t5=n-t4;
            val1=t5;
            t6=2;
            t7=n-t6;
            val2=t7;
            /*INLINE*/t8=this.getFibo(val1);
            /*INLINE*/t9=this.getFibo(val2);
            t10=t8+t9;
            retval=t10;
        }
        return retval;
    }
}	
