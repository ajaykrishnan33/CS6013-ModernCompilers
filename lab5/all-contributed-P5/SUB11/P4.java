class P4{ 
    public static void main (String[] args){ 
        int  temp0;
        temp0 =new Braces().compute();
        System.out.println(temp0);
    }
}


class Braces1 {
    int z;boolean temp;int z1;int z2;
    public int compute1() {
        z1 = 10;z2 = 5;
        temp = z1 < z2;
        if(temp)
            z = 10;
        else
            z = 23;
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



