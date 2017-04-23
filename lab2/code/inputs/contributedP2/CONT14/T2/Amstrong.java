class Amstrong {
	public static void main(String[] a){
        System.out.println(new ANumber().Compute(153));
    }
}


class ANumber{


  public int Compute(int n){
	 int c;
	 int a;
	 int b;
	 int temp; 
	 c=0;   
	 while(0<n)  
    		{
    		b=this.DivByTen(n);
    		a=n-b;    
    		n=b;  
    		b=a*a;
    		b=a*b;
    		c=c+b;  
    		}
        b=n-c;  
    	if((!(b<0)) & (!(0<b)))  
    		a=0;   
    	else  
    		a=1;
   	return a;  
   	}
  public int DivByTen(int n){
  
  	int x;
  	int y;
  	y=0;
  	x=10;
  	while(x<n)
  		{ 
  		y = y+1;
  		x = x+10;
  		}
  	return y;
  	}
  	
 }  










