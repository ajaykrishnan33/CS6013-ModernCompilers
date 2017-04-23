class tc2{
    public static void main(String[] args) {
        int a;
        int b;
        int r;
        int s;
        a=1;
        b=2;
        /*INLINE*/r=new tc1a().addThem(a,b);
        /*INLINE*/s=new tc1a().subtractThem(b,a);
        System.out.println(r);

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
