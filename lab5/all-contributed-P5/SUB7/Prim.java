class Prim{
    public static void main(String[] a){
        P p;
        int ten;
        int z;
        ten  = 10;
        p = new P();
        /*INLINE*/
        z = p.add(ten);
        System.out.println(z);
    }
}

// Perform addition of squares of first 10 numbers

class P {

    public int add(int num)
    {
        int x;
        int sum;
        int n0;
        int one;
        one =1;
        sum = 0;
        for(x = sum; x <num; x=x+one)
        {
            /*INLINE*/
            n0 = this.getSquare(x);
            sum = sum + n0 ;
        }
        return sum;
    }

    public int getSquare(int q)
    {	
        boolean yes;
        boolean no;
        int t; 
        int one;
        yes = true;

        one =1;
        t = one;
        while(yes)
        {
            no = t<q;
            if(no)
                t = t+one;
            else
            {
                t = t +one;
                yes = false;
            }

            t = t+one;	 	
        }
        return q;
    }

}
