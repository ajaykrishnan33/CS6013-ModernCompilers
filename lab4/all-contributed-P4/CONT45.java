class LoopInv3 {
    public static void main(String[] a ) {
        int ab;
        int cd;
        int xy;
        int ten;
        int e1;
        int e2;
        int e3;
        int t;
        boolean b1;
        ab = 5;
        cd = 5;
        ten = 10;
        for(xy=ab;xy<ten;xy=xy + 1){
            ab=0;
            e1 = ab + 8;
            b1 = xy<6;
            if(b1){
                t = 3;
            } else {
                t = 0;
            }
            /* LOOPINVARIANTCODE? */ e2 = e1 + t; //No
            /* LOOPINVARIANTCODE? */ e3 = e2 + e1; //No
        } 
    }
}
