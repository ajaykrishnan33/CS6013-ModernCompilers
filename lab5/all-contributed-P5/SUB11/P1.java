class P1{ 
    public static void main (String[] args){ 
        int  temp0;
        temp0 =new Braces().compute();
        System.out.println(temp0);
    }
}


class Braces1 {
    int z;
    public int compute1() {
        z = 10;
        return z;
    }
}

class Braces{ 
    int  c;Braces1 x;
    public int  compute( ) { 
        x = new Braces1();
        /* INLINE */
        c = x.compute1();
        return c; 
    } 
}



