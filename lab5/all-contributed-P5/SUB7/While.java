class While
{
    public static void main(String[] a){
        int six;
        W w;
        int ret;
        six = 6;
        w = new W();
        /*INLINE*/
        ret = w.loop(six);
        System.out.println(ret);
    }
}


class W
{
    public int loop(int x)
    {
        int y;
        int z;
        int sum;
        int one;
        boolean  yes;
        one  = 1;
        y = 0;
        sum = 1;
        yes = y < x;

        while(yes)
        {
            for(z=one;z<x;z=z+one)
            {
                sum = sum * z;
            }
            y=y+one;
            yes = y < x;
        }
        return sum;
    }
}
