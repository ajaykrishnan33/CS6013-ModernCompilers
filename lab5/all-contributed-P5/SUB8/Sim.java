class Sim
{
    public static void main(String[] abc) {
        int res;
        int one;
        cond yy;
        yy = new cond();
        one = 1;
        /* INLINE */ res = yy.tx(one);
        System.out.println(res);
    }
}
class cond
{
    public int tx(int z){
        int g;
        boolean t1;
        int on;
        on = 1;
        t1 = z < on;
        if(t1){
            g = 0;
        } else g=1;
        return g;
    }

}
