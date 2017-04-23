class gcd{
public static void main(String[] a){
//System.out.println(new SGCD().start(15,5));
  	int t1;
	int t2;
	int t3;
        sgcd ext;
	t2 = 15;
	t3= 5;	
	ext = new py();
	t1= ext.start(t2,t3);
	System.out.println(t1);
}
}

class sgcd{
   public int start(int n, int m){
   //boolean bs01;
 	boolean pl;
 	int mn;
	int i;
	int z;
	boolean t4;
	z = 0;
	pl = this.compare(n,m);
	//mn = !pl;
   while(pl)
    {
      t4 = n < m;
      if(t4)
	m = m - n;
       else
	n = n - m;
	}
   for( i = 0; i < 5; i = i + 1){
       k = z + 8; 
     /*LOOPINCARIANTCODE? */  py = k + z;  // yes
     /*LOOPINCARIANTCODE? */  c = py + 2;  // yes
       //System.out.println(c);
}
   return n;
}

public boolean compare(int n , int m){
boolean value;
int aux02;
boolean t5;
int t6;
boolean t7;
boolean t8;
value=false;
t6 = 1;
aux02 = m + t6;
t5 = n< m;
t8 = n < aux02;
t7 = !t8;
if(t5) value = false;
else if(t8) value = false;
else value = true;
return value;
}
}

   
