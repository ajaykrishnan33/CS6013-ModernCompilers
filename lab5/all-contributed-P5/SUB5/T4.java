class T4{public static void main(String[] arg)
    {
        int[] a;
        int i;
        int j;
        int one;
        int ten;
        int zero;
        arry x;
        arry1 y;
        x = new arry();
        y= new arry1();
        one = 1;
        ten = 10;
        zero = 0;
        a=new int[ten];
        for(i=zero;i<ten;i= i + one)
        {
            j = i + one;
            a[i] = j;
        }
        /*INLINE*/one = x.reverseArry(a);
        /*INLINE*/zero=y.reverseArry(a);

    }
}

class arry{
    public int reverseArry(int[] a)
    {
        int i;
        int j;
        int zero;
        int ten;
        int one;

        zero = 0;
        ten = 10;
        one =1;
        j=0;

        for(i=zero;i<ten;i= i + one)
        {
            j = ten - i;
            a[j] = i;
        }

        return j;
    }
}

class arry1 extends arry{
    public  int rr(int a)
    {
        int i;
        int j;
        int zero;
        int ten;
        int one;
        zero = 0;
        ten = 10;
        one =1;
        j=0;
        j=a+ten;

        return j;
    }
}

