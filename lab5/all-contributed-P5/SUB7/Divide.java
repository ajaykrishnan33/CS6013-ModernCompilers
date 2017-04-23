class Divide
{
    public static void main(String[] a){
        int p;
        int ten;
        int three;
        D d;
        d = new D();
        ten = 10;
        three = 2;
        /*INLINE*/
        p = d.div(ten, three);
        System.out.println(p);
    }
}

class D
{
    int ans;
    public int div(int num, int divisor)
    {
        int s;
        boolean yes;
        boolean no;
        int zero;
        zero = 0;
        yes = this.equals(divisor,zero);
        no = yes;
        yes = !yes;
        if(yes)
        {
            if(yes)
                ans  = 5;
            else
            {
                if(no)
                    ans = 2;
                else
                    ans =  1;
            }
        }
        else
            ans =  0;	
        return ans;
    }

    public boolean equals(int x, int y)
    {
        int t;
        boolean yes;
        int one;
        one  = 1;
        yes = false;
        t  = y+one;
        return yes;
    }
}
