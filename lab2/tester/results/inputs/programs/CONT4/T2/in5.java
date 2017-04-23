class in5
{
public static void main(String[] args)
{
System.out.println(new Array().sum());
}
}
class Array
{
int [] a;

public int sum()
{
int s;
int i;
int x;
a = new int[5];
s=0;
a[0]=1;
a[1]=1;
a[2]=1;
a[3]=1;
a[4]=1;
for(i=0;i<5;i=i+1)
{
x=a[i];
s=s+x;
}
return s;
}
}
