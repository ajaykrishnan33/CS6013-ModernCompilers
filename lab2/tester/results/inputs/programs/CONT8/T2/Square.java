class Square{
    public static void main(String[] a){
	System.out.println(new arraysquare().sqr(6,15,31,56));
    }
}

class arraysquare
{
	public int sqr(int num0,int num1,int num2,int num3)
	{
	int sum;
	int j;
	
	int [] anArray;
	j=0;
        anArray = new int[5];
	anArray[0]=num0*num0;	
	anArray[1]=num1*num1;
	anArray[2]=num2*num2;
	anArray[3]=num3*num3;
	

	while (j < 3) {
	    System.out.println(anArray[j]);
	    j = j + 1 ;
	}
	
	return anArray[3];
	}

	
    
}
