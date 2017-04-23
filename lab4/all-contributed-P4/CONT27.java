class Testcase2 {
	public static void main(String [ ] args){
		int i;
        int j;
        int k;
        int []A;
        int temp;
        j=10;
        k=11;
        A=new int[k];
        for(i=0;i<12;i=i+1){
        	//Yes
        	/*LOOPINVARIANTCODE?*/j=j+k;
        	//No
        	/*LOOPINVARIANTCODE?*/temp=j+i;
        	//No
        	/*LOOPINVARIANTCODE?*/A[i]=temp;
        	
        }
	}
}
