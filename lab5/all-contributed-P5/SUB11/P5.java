class P5{ 
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
    int  c;Colgate x;
    public int  compute( ) { 
        x = new Colgate();
        /* INLINE */
        c = x.zipee();
        return c; 
    } 
}

class CloseUp{
    int a;
    public int zipee() {
        a = 4;
        return a;
    }
}

class Colgate extends CloseUp{
    int b;boolean temp;int z1;int z2;
    public int zipee() {
        z1 = 98;z2 = 95;
        temp = z1 < z2;
        if(temp)
            b = 18;
        else
            b = 90;
        return b;
    }
}



