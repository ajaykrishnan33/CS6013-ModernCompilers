class Reverse{
    public static void main(String[] b){
        int _init;
        int ten;
        R r;
        r = new R();
        ten = 10;
        _init = r.init(ten);
        System.out.println(_init);
    }
}


class R
{
    int sz;
    int [] a;

    public int rev(int e)
    {
        int d ;
        int f;
        int g;
        boolean yes;
        int h;
        int five;
        int one;
        int temp;
        one = 1;
        f = 0;
        five  = 5;
        yes = f<five;
        while(yes)
        {	
            h = e - f;
            h = h - one;
            d = a[f];
            temp  = a[h];
            a[f] = temp;
            a[h] = d;
            f =f+one;
            yes = f<five;
        }
        g = this.print();
        return five;
    }

    public int init(int size)
    {
        int c;
        int h;
        int i;
        int zero;
        int one;
        zero = 0 ;
        one = 1;
        sz = size;

        a = new int[size]; 

        for(c =  zero; c < size;c=c+one)
        {
            a[c]  = c;
        }
        /*INLINE*/
        h = this.print();
        /*INLINE*/
        i = this.rev(sz);
        return h;
    }

    public int print()
    {
        int j;
        int val;
        int one;
        boolean yes;
        j = 0;
        one = 1;
        yes = j<sz;
        while(yes)
        {

            val = a[j];
            System.out.println(val);
            j= j+one;
            yes = j<sz;
        }
        return j;
    }
}
