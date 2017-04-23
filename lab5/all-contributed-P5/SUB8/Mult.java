class Mult
{
    public static void main(String[] a) {
        mul tx;
        int two;
        int three;
        int six;
        int res1;
        int res2;
        int sev;
        tx  = new mul();
        two = 2;
        three = 3;
        six = 6;
        sev = 7;
        /* INLINE */ res1 = tx.multiply(two,three,six);
        /* INLINE */ res2 = tx.multiply(sev,three,six);
        System.out.println(res1);
        System.out.println(res2);
    }
}
class mul
{
    public int multiply(int m, int n, int p)
    {
        boolean t1;
        int t2;
        t1 = p<m;
        if(t1){
            t2 = m*n;

        }
        else{
            t2 = n*p;

        }
        return t2;
    }
}
