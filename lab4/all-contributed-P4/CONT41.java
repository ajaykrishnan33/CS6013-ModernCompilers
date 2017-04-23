class Indep1 {
    public static void main(String[] a ) {
        int ten;
        int one;
        int i;
        int zero;
        int[] ab;
        int m;
        int[] cd;
        int xy;
        int magic;
        int change;
        int tw;
        int t;
        ten = 10;
        zero =0;
        magic = 17;
        xy = 8;
        tw = 2 * ten;
        ab = new int[tw];
        one = 1;
        cd = new int[one];
        cd[zero] = magic;
        for(i=0;i<tw;i=i+one) {
            ab[i]=21;
        }
        /* INDEPEDENTITERS? */ for(i=0;i<ten;i=i+one) { //No
            t = 2 * i;
            ab[t]=magic;
            xy=ab[i];
        }
        System.out.println(i); 
    }
}
