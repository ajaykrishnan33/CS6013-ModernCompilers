class fibonacci
{
     public static void main(String[] a)
     {   
      System.out.println(new Fibo().getFibo(6));
     } 
    }  


    class Fibo
     { 
       
      public int getFibo(int n)
 {
 int retval;
int val1;
int val2;
        if(n<3)
	retval = 1;
	else
	{
	val1=n-1;
	val2=n-2;
	retval = (this.getFibo(val1))+(this.getFibo(val2)) ;
}
return retval;
}
}


