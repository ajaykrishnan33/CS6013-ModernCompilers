class P2{ 
    public static void main (String[] args){ 
        int  temp0;
        temp0 =new Braces().compute1();
        System.out.println(temp0);
    }
}


class Braces1 {
    int z; Braces x;
    public int compute1() {
        x = new Braces();
        /* INLINE */
        z = x.compute();
        return z;
    }
}

class Braces extends Braces1{ 
    int  c;
    public int  compute( ) {
        c = 20;
        return c; 
    } 
}



