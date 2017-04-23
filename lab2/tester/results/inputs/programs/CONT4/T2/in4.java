class in4
{
public static void main(String[] args)
{
System.out.println(new Loop().isEqual(6));
}
}
class Loop
{
public int isEqual(int n)
{
int fact;
fact=1;
while(0<n)
	{
	fact=fact*n;
	n=n-1;
	}
return fact;
}	
}
