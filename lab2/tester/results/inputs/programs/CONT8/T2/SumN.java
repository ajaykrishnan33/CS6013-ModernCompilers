class SumN{
    public static void main(String[] a){
	System.out.println(new Naturalnos().sumR(6));
    }
}

class Naturalnos
{
	public int sumR(int num)
	{
	int sum;
	int ret;
	int a;
	ret=0;
	if(this.Compare(num,1))
	 ret=1 ;
 
	else 
	{
	a=this.sumR(num-1);
	sum=num + a;
	ret=sum;
	}
	return ret;
 
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
