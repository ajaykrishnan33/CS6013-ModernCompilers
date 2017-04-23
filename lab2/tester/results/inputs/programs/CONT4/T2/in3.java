class in3
{
public static void main(String[] args)
{
System.out.println(new Condition().isEqual());
}
}
class Condition
{
int x;
int y;
public int isEqual()
{
int ret;
boolean b1;
boolean b2;

x=6;
y=9;

b1=x<y;
b2=y<x;
if(b1)
	{
		System.out.println(1);
		ret= 1;
	}
else
{
if(b2)
	{
		System.out.println(1);
		ret= 1;
	}
else
	{
		System.out.println(0);
		ret= 0;	
	}
}
return ret;
}
}