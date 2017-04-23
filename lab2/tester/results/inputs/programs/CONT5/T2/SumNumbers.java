class SumNumbers
{
     public static void main(String[] a)
     {   
      System.out.println(new SumNum().getSum(6));
     } 
    }  


    class SumNum
     { 
       
      public int getSum(int n)
 {
 int retval;
 int i;
retval=0;
i=0;
  while(i<n)
{
  retval=retval+i;
 i=i+1;  
  }
retval=retval+i;
return retval;
}
}
