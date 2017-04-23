class Average{
	public static void main(String[] args){
		System.out.println(new Av().start(10));	
	}
}


class Av{
	int[] arr;
	int len;
	
	public int start(int size){
		int average;		
		size = size + 1;
		average = this.Init(size);
		size = size - 1;
		average = this.Div(average,size);
		return average;			
	}
	
	public int Init(int s){
		int i;
		int avg;
		int temp;
		arr = new int[s];
		avg = 0;
		for(i= 0;i < s;i=i+1){
			arr[i] = i;
			temp = arr[i];
			avg = avg + temp;		
		}	
		return avg;
	}

	public int Div(int number1, int number2){
		int temp;
		int rem;
		boolean ch;
		if(number1<number2)
			rem = 0;
		else{
			rem = 0;
			for(temp = number2;temp<number1;temp = temp + number2)
				rem = rem + 1;
			
			
		}	
		return rem;
	}

}
