
class Testcase5 {

	public static void main(String[] args) {
		int [] arr;
	    int sum;
    int i;
    int j;
    int len;
    int temp;
    int t9;
   
    int t2;
    int t3;
    int t4;
    

    t9=6;
    arr = new int[t9];

    sum=0;
    j = 20;
    
    len = arr.length;

    for(i=0;i<len; i = i+1)
    {
    	arr[i] = j;
    	//Yes
    	/*LOOPINVARIANTCODE?*/t2=20;
    	t3=j+t2;
    	j = t3;
	//No
    	/*LOOPINVARIANTCODE?*/temp = arr[i];
	t4=sum+temp;
        sum =t4;
        
	
    }
		
	}

}
