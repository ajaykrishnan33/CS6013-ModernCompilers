class Table{
	public static void main(String[] args){
		System.out.println(new TTrev().printrev(5));
	}
}

class TT{
	public int print(int num){
		int i;
		int temp;		
		int[] arr;
		arr = new int[11];
		i=0;
		while(i<11){
			temp = num * i;
			arr[i] = temp;
			
			System.out.println(arr[i]);
			i = i + 1;
		}
		return 0;
	}
	
}

class TTrev extends TT{
	public int printrev(int num){
		int j;
		int temp2;
		int[] a;
		a = new int[11];
		j=10;
		while(!(j<0)){
			temp2 = num * j;
			a[j] = temp2;

			System.out.println(a[j]);
			j = j - 1;		
		}
		temp2 = new TT().print(num);
		return 0;
	}
}
