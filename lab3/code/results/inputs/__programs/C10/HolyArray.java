class HolyArray {
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
        ten = 10;
        zero =0;
        magic = 17;
        xy = 8; //Without this, gives "xy may not have been initialised error
        ab = new int[ten];
        one = 1;
        cd = new int[one];
        cd[zero] = magic;
        for(i=0;i<ten;i=i+one) {
            ab[i]=magic;
            xy=8;
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
        for(i=0;i<ten;i=i+one) {
            change=ab[i];
            System.out.println(change);
        }
        i=0;
        System.out.println(i); 
    }
}
