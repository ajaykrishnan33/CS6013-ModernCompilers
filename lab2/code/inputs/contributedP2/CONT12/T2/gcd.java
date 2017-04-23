class gcd{
public static void main(String[] a){
System.out.println(new SGCD().start(15,5));
}
}

class SGCD{
   public int start(int n, int m){
   //boolean bs01;

   while(!(this.compare(n,m)))
    {
      if(n < m)
	m = m - n;
       else
	n = n - m;
	}
   return n;
}

public boolean compare(int n , int m){
boolean value;
int aux02;

value=false;
aux02 = m + 1;
if(n < m) value = false;
else if(!(n < aux02)) value = false;
else value = true;
return value;
}
}

   
