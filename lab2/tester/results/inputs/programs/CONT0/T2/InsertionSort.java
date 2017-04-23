class InsertionSort{
    public static void main(String[] a){
	System.out.println(new IS().Start(10));
    }
}

//This class contains an array and associated methods
//to perform insertion sort
class IS{
    
    int[] number ;
    int size ;

    //Initializes the array, sorts and prints
    public int Start(int sz){
	int aux01 ;
	System.out.println(sz);
	aux01 = this.Init(sz);
	System.out.println(aux01);
	aux01 = this.Sort();
	System.out.println(aux01);
	aux01 = this.Print();
	System.out.println(aux01);
	return 0 ;
    }
    
    // Initialize array of integers
    public int Init(int sz){
	int i;
	int aux01;
	int aux02;
	int aux03;
	size = sz ;
	number = new int[sz] ;
	
	i=0;
	
	while(i<sz){
	aux01=i*4;
	aux02=sz-i;
	aux03=aux02*2;
	number[i]=aux01+aux03;
	i=i+1;
	}
	
	return 0 ;	
    }

    
    // Sort array of integers using InsertionSort method
    public int Sort(){
	int i;
	int j;
	int t;
	int aux1;
	int aux2;
	int key;
	i = 0;
	while (i<(size-1)){
	    j = i+1;
	    key=i;
	    while (j < size){
	        aux1=number[j];
	        aux2=number[key];
            if(aux1<aux2){
                key=j;
                }
            else{
            }
            j=j+1;
            }
        t=number[key];
        number[key]=number[i];
        number[i]=t;
        i=i+1;
        }
    return 0;
	}
	
	//print the array
	public int Print(){
	    int i;
	    i=0;
	    while(i<size){
	        System.out.println(number[i]);
            i=i+1;
	        }
	    return 0;
	    }
	    
}
