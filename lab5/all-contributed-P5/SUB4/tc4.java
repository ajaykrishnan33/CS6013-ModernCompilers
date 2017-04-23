class tc4{
    public static void main(String[] args) {
        int a;
        int b;
        tc4a r;
        tc4b s;
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
