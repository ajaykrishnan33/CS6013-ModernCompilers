class Constantine {
    public static void main(String[] a ) {
        Conquerif trial;
        int ab;
        int cd;
        trial = new Conquerif();
        ab = 5;
        cd = trial.nar(ab);
        System.out.println(cd); 
    }
}
class Conquerif { 
    public int nar( int num ) {
        int num_aux;
        int mn;
        boolean pq;
        boolean pm;
        int a0;
        int a1;
        int a2;
        int a3;
        int a4;
        int a5;
        a0=0;
        mn = 1;
        a1 =1;
        a2 = a1;
        pq = a0 < mn;
        if(pq){
            a1 = 1;
            num_aux=a1;
        } else {
            a1=0;
            a2 = 1;
            a3 = num-a2;
            a4 = this.nar(a3);
            a5 = num*a4;
            num_aux=a5; 
       }
       pm = a1 < a2;
       if(pm){
            a2 = 9;
            a1 = 8;
       } else {
            pq = false;
       }
       return num_aux; 
   } 
}
