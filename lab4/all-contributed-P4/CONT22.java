class Testcase2 {
	public static void main(String [ ] args){
		int i;
        int j;
        int k;
        int []A;
        int []B;
        int []C;
        int []D;
        int temp;
        int temp2;
        j=0;
        k=100;
        A=new int[k];
        B=new int[k];
        C=new int[k];
        D=new int[k];
        for(i=0;i<100;i=i+1){
        	temp=i*10;
        	A[i]=temp;
        	temp=i+20;
        	B[i]=temp;
        	//No
		/*LOOPINVARIANTCODE?*/temp=3;
        	C[i]=temp;
        	//No
		/*LOOPINVARIANTCODE?*/D[i]=30;
        }
        
        //No
        /*INDEPENDENTITERS?*/for (i=0; i<100; i=i+1) {
    	  temp = A[i];
    	  temp2= B[i];
    	  temp=temp+temp2;
    	  A[i]=temp; 
    	  j=i+1;
    	  temp = C[i];
    	  temp2= D[i];
    	  temp=temp+temp2;
           B[j] = temp;     
       }
	}
}
