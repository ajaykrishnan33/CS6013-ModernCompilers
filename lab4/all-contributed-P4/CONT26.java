
class Testcase1 {

	public static void main(String [ ] args){
        int i;
        int j;
        int k;
        int temp;
        int []A;
        int []B;
        j=10;
        k=11;
        A=new int[k];
        B=new int[j];
        
        for(i=0;i<11;i=i+1){
        	//No
    		/*LOOPINVARIANTCODE?*/B[i]=i;
        }
        
        //No
        /*INDEPENDENTITERS?*/for(i=0;i<11;i=i+1){
        	temp=B[i];
        	temp=temp+2;
        	A[i]=temp;
        	temp=i+1;
        	k=i+9;
        	B[temp]=k;
        }
		
		

	}

}
