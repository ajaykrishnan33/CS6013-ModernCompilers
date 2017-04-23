class MaxLMN
{
     public static void main(String[] a)
     {   
      System.out.println(new ArrayOp().getmax());
     } 
    }  


    class ArrayOp
     { 
       
      public int getmax()
 {
int max;
int[] numbers;
int i;
int j;
numbers=new int[5];
max=0;
i=0;
numbers[0]=3;
numbers[1]=6;
numbers[2]=1;
numbers[3]=4;
numbers[4]=3;
while(i<5)
{
j=numbers[i];
 if(j<max)
	max=j;
 else
	max=max;
i=i+1;
}
return max;
}
}
