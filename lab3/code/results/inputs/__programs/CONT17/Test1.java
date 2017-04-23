class Test1{
	public static void main(String[] args){
		int i;
		int j;
		int k;
		int p;
		int x;
		boolean b;
		b = true;
		k = 5;
		p = 1;
		j = 5;
		for(i=0;i<k;i=i+p){
			b = j < i;
			if(b){
				j = 3;
			}
			else{
				j = 4;
			}
		}
		System.out.println(j);
	}
}
