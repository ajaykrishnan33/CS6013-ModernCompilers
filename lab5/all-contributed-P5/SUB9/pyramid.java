class pyramid{
    public static void main(String[] a){

        //System.out.println(new py().start(6));pyra
        int t1;
        int t2;
        py pyra;
        t2 = 6;	
        /*INLINE*/ pyra = new py();
        /*INLINE*/ t1= pyra.start(t2);
        System.out.println(t1);
    }

}

class py{
    public int start(int n){
        int i;
        int j;
        int st;
        int s;
        s=1;
        for(i=s; i<n; i = i + s){
            for(j=s; j<i; j = j + s){
                System.out.println(j);

            }
        }
        return j;
    }
}
