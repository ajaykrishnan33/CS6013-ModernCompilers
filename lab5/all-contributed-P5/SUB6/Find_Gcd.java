class Find_Gcd{
    public static void main(String[] a){

        int x;
        int y;
        int z;
        Gcd m;
        x=10;
        y=15;

        m=new Gcd();
        /*INLINE*/
        z=m.findgcd(x,y);

        System.out.println(z);
    }
}

class Gcd
{
    public int findgcd(int n1,int n2)
    {
        boolean a;
        /*INLINE*/
        a=this.Compare(n1,n2);

        while(a)
        {
            if(a)
                n1 = n1-n2;
            else
                n2 = n2-n1;
        }
        return n1;
    }

    public boolean Compare(int num1 , int num2){
        boolean retval ;
        int aux02 ;

        retval = false ;
        aux02 = num2 ;

        return retval ;
    }

}
