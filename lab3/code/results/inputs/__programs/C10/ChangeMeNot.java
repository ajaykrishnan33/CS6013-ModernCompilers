class ChangeMeNot {
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
            ty = !ty;
        }
        for(rand=false;!rand;cd=!cd){
            rand=true;
        }
        for(rand=rand;!rand;ab=!ab){
            ten =0;
        }
        cd=!cd;
        if(cd){
            System.out.println(ten);
            System.out.println(ty);
            System.out.println(ab);
            System.out.println(cd); 
        } else {
            System.out.println(ty);
            System.out.println(ab);
            System.out.println(cd);
            System.out.println(ten);
        } 
    }
}
