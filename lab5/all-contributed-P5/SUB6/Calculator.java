class Calculator{
    public static void main(String[] a){
        int x;
        int y;
        int z;
        My_Calculation m;
        x=40;
        y=37;

        m=new My_Calculation();
        z=m.Start(x,y);
        System.out.println(z);
    }
}


class Calculation {
    int z;

    public int addition(int x, int y) {
        z = x + y;
        System.out.println(z);
        return z;
    }

    public int Subtraction(int x, int y) {
        z = x - y;
        System.out.println(z);
        return z;
    }
}

class My_Calculation extends Calculation {
    public int multiplication(int x, int y) {
        z = x * y;
        //System.out.println(z);
        return z;
    }

    public int Start(int a, int b)
    {
        int x;

        /*INLINE*/
        x=new Calculation().addition(a, b);
        /*INLINE*/
        x=new Calculation().Subtraction(a, b);
        /*INLINE*/
        x=this.multiplication(a, b);
        return x;
    }
}
