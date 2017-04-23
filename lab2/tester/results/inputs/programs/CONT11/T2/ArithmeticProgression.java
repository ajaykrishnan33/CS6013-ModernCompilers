class ArithmeticProgression{
	public static void main(String[] args){
		System.out.println(new AP().start(10,2,10));	
	}
}


class AP{
	int[] arr;
	int len;

	public int start(int a,int d,int size){
		int i;
		int prev;
		int temp;
		arr = new int[size];
		len = size;
		i = 1;		
		arr[0] = a;
		while(i<len){
			prev = i - 1;
			temp = arr[prev];
			arr[i] = temp + d;
			i = i + 1; 
		}
		

		i = 0;
		while(i<len){
			System.out.println(arr[i]);		
			i = i + 1;	
		}
		return 0;
	}

}


