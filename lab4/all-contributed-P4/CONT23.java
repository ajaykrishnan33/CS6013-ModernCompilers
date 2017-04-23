class Testcase3 {
	public static void main(String [ ] args){
		int i;
		int j;
		int k;
		int []A;
		k=10;
		 A=new int[k];
		for(i=0;i<10;i=i+1){
			//Yes
			/*LOOPINVARIANTCODE?*/k=10+2;
			//NO
			/*LOOPINVARIANTCODE?*/A[i]=k;
		}
	}
}
