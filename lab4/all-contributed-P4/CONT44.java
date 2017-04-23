class LoopInv2 {
    public static void main(String[] a ) {
        int ab;
        int cd;
        int xy;
        int ten;
        int e1;
        int e2;
        int e3;
        ab = 5;
        cd = 5;
        ten = 10;
        for(xy=ab;xy<ten;xy=ab+cd){
            /* LOOPINVARIANTCODE? */ ab=5; //Yes
            /* LOOPINVARIANTCODE? */ e1 = ab + 8; // Yes
            /* LOOPINVARIANTCODE? */ e2 = e1 + xy; //No
            /* LOOPINVARIANTCODE? */ e3 = e2 + e1; //No
        } 
    }
}
