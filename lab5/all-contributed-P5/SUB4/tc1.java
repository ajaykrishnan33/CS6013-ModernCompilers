class tc1{
    public static void main(String[] args) {
        int a;
        int b;
        int r;
        a=1;
        b=2;
        /*INLINE*/r=new tc1a().addThem(a,b);
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
}
