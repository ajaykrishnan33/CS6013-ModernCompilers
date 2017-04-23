class LoopInv1 {
    public static void main(String[] a ) {
        boolean ab;
        boolean cd;
        boolean ty;
        int ten;
        boolean rand;
        ab = true;
        cd = false;
        ty = ab & cd;
        ten = 10;
        while(ty){
            System.out.println(ten);
            /* LOOPINVARIANTCODE? */ty = !ty; //No
        }
        for(rand=false;!rand;cd=!cd){
            /* LOOPINVARIANTCODE? */rand=true; //Yes
        } 
    }
}
