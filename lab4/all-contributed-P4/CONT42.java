class Indep2 {
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
        int t1;
        int t2;
        int t3;
        int t4;
        int t0;
        ten = 10;
        zero =0;
        magic = 17;
        xy = 8;
        tw = 2 * ten;
        t0 = tw + tw;
        ab = new int[t0];
        one = 1;
        cd = new int[one];
        cd[zero] = magic;
        for(i=0;i<t0;i=i+one) {
            ab[i]=magic;
        }
        i=i-one;
        ab[i]=xy;
        change = ab[xy];
        change = change + one;
        ab[xy] = change;
        change = ab.length;
        System.out.println(change);
        change = cd.length;
        System.out.println(change);
        System.out.println(xy);
        System.out.println(magic);
        /* INDEPEDENTITERS? */ for(i=2;i<5;i=i+one) { //Yes
            t4 = 2 * i;
            t2 = t4 + 1;
            t3 = 4 * i;
            t1 = t3 - 2;
            change=ab[t2];
            ab[t1] = change;
        }
        i=0;
        System.out.println(i); 
    }
}
