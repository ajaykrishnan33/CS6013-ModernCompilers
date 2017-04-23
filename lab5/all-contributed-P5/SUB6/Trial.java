class Trial{
    public static void main(String[] a){
        b var1;
        int t;

        var1=new b();
        /*INLINE*/
        t=var1.tp();
        System.out.println(t);
    }
}

class arraysquare 
{
    public int sqr()
    {
        int sum;
        int j;

        int [] anArray;
        j=155;


        return j;
    }



}

class a extends arraysquare
{
    public int sqr()
    {
        int c;
        arraysquare tp1;
        c=9;

        tp1=new arraysquare();
        /*INLINE*/
        c=tp1.sqr();
        return c;
    }


}

class b
{
    public int tp()
    {
        arraysquare var1;
        int c;
        var1=new a();
        /*INLINE*/
        c=var1.sqr();
        return c;
    }
}
