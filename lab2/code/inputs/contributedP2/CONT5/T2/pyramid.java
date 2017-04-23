class pyramid
{
     public static void main(String[] a)
     {   
      System.out.println(new Pyra().makePyra(6));
     } 
    }  


    class Pyra
     { 
       
      public int makePyra(int n)
 {
int nlimit;
int i;
int j;
int limit;
i=1;
j=1;
nlimit=n+1;
while(i<nlimit)
{
j=1;
limit=i+1;
while(j<limit)
{
System.out.println(j);
j=j+1;
}
i=(i+1);
}       
return 0;
}
}
