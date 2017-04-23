class FibonacciLol{
    public static void main(String[] a){
	System.out.println(new Fib().Start(10));
    }
}

//This class contains an array and associated methods
//to create a fibonacci sequence up to the required fibonacci number
class Fib{
    
    int[] number ;
    int size ;

    //Populates the array and prints
    public int Start(int sz){
	int aux01 ;
	System.out.println(sz);
	aux01 = this.Populate(sz);
	System.out.println(aux01);
	aux01 = this.Print();
	System.out.println(aux01);
	return 0 ;
    }
    
    public int Populate(int sz){
        int aux0;
        int aux1;
        int aux2;
        int aux3;
        
        number = new int[sz];
        size = sz;
        
        aux0=0;
        aux1=0;
                
        while(aux0<size){
            number[aux0] = aux1;
            if(aux0<1){
                aux1=1;
            }
            else{
                aux2 = aux0-1;
                aux3 = number[aux2];
                aux1=aux1+aux3;
            }
            aux0=aux0+1;
        }
        return 0;
    }
    
    public int Print(){
        int aux;
        aux=0;
        while(aux<size){
            System.out.println(number[aux]);
            aux=aux+1;
        }
        return 0;
    }
    
}
