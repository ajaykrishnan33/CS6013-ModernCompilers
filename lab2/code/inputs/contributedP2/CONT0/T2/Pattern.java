class Pattern{
    public static void main(String[] a){
	System.out.println(new Pat().Start(34));
    }
}


//This class contains the functions needed to
//print the pattern
class Pat{
    int number ;

    // Invoke methods to initialize, print and search
    // for elements on the array
    public int Start(int num){
	int aux01 ;
	int aux02 ;
	
	aux02=0;
	
	aux01=0;
	while(aux01<num){
	    System.out.println(aux01);
	    aux01=aux01+1;
	    }
	while(aux02<aux01){
	    System.out.println(aux01);
	    aux01=aux01-1;
	    }
	return 0;
    }
}	
