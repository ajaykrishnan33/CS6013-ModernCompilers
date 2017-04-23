class tc5{
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int e;
        tc4a r;
        tc4b s;
        a=1;
        b=2;
        /*INLINE*/c=new tc1a().addThem(a,b);
        /*INLINE*/d=new tc1b().addThem(a,b);
        /*INLINE*/e=new tc1a().subtractThem(b,a);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        r=new tc4a();
        /*INLINE*/r.print1();
        s=new tc4b();
        /*INLINE*/s.print1();
        /*INLINE*/s.print2();
    }
}
class tc4a{
    public int print1()
    {
        int one;
        one=1;
        System.out.println(one);
        return one;
    }

}
class tc4b extends tc4a
{
    public int print2()
    {
        int two;
        two=2;
        System.out.println(two);
        return two;
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
