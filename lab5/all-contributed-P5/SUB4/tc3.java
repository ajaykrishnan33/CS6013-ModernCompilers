class tc3{
    public static void main(String[] args) {
        int a;
        int b;
        int r;
        int s;
        int t;
        a=1;
        b=2;
        /*INLINE*/r=new tc1a().addThem(a,b);
        /*INLINE*/s=new tc1b().addThem(a,b);
        /*INLINE*/t=new tc1a().subtractThem(b,a);
        System.out.println(r);
        System.out.println(s);
        System.out.println(t);

    }
}
class tc1a{
    public int addThem(int m,int n)
    {
        int result;
        result=m+n;
        return result;
    }
    public int subtractThem(int m,int n)
    {
        int result;
        result=m-n;
        return result;
    }
}
class tc1b extends tc1a{
    public int addThem(int m2,int n2)
    {
        int result2;
        int x;
        x=1;
        result2=m2+n2;
        result2=result2+x;
        return result2;
    }
}
