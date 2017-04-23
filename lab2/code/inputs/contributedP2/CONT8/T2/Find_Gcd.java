class Find_Gcd{
    public static void main(String[] a){
        System.out.println(new Gcd().findgcd(10,15));
    }
}

class Gcd
    {
        public int findgcd(int n1,int n2)
        {
            
             
            while(this.Compare(n1,n2))
            {
                if(n2 < n1)
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
	aux02 = num2 + 1 ;
	if (num1 < num2) retval = false ;
	else if (!(num1 < aux02)) retval = false ;
	else retval = true ;
	return retval ;
    }

    }
