class Collatz{
    public static void main(String[] a){
	System.out.println(new ColNum().Start(34));
    }
}


//This class contains the functions needed to
//print the colatz sequence for the given number
class ColNum{
    int number ;

    // Invoke methods to initialize, print and search
    // for elements on the array
    public int Start(int num){
	int aux01 ;
	int aux02 ;
	
	number=num;
	aux02 = this.Next(number);
	System.out.println(aux02);
	if(aux02<2){
	    aux02=0;
	    }
	else{
	    aux02=this.Start(aux02);
	    }
	return aux02;  
    }
    
    public int Next(int num){
	    int count01 ;
	    int count02 ;
	    int aux03 ;

	    count01 = 0 ;
	    count02 = 0 ;
	    aux03 = num - 1 ;
	    while (count02 < aux03) {
	        count01 = count01 + 1 ;
	        count02 = count02 + 2 ;
	        }
	    if(count02<num){
	        aux03=num*3;
	        aux03=aux03+1;
	    }
	    else{
	        aux03 = count01 ;
	    }
	    return aux03;	
    }
}	
