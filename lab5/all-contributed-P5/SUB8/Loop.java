class Loop
{
    public static void main(String[] a){
        int res;
        int sev;
        yloop yyy;
        yyy = new yloop();
        sev = 7;
        /* INLINE */ res = yyy.l1(sev);
        System.out.println(res);
    }
}


class yloop
{
    public int l1(int m)
    {
        int n;
        int count;
        boolean t1;
        boolean t2;
        int on;
        int tw;
        int fo;
        fo = 4;
        tw = 2;
        on = 1;
        t1 = tw<m;
        t2 = n<fo;
        while(t1){
            n = 1;
            while(t2){
                count = count +on;
                n= n+on;
                t2 = n<fo;
            }
            m=m-tw;
            t2 = tw<m;
        }
        return count;
    }
}
