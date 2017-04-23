class Print
{
    public static void main(String[] b){
        PE p;
        int x;
        int eight;
        eight = 8;
        p = new PE();
        x = p.pqr(eight); 
        System.out.println(x);
    }
}
class P
{
    int sz;
    public int ABC(int n)
    {
        int one;
        int two;
        boolean yes;
        one  = 1;
        two = 2;
        sz = n;
        n = n+one;
        System.out.println(n);
        n = n-one;
        System.out.println(n);
        n  = n * two;
        System.out.println(n);
        return one;
    }
}

class PE extends P{
    public int pqr(int m)
    {
        int d;
        P p;
        p =  new P();
        /*INLINE*/
        d = p.ABC(m);
        p.sz = d;
        System.out.println(m);
        return d;
    }
}
