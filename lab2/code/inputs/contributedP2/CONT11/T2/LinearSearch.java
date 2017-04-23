class LinearSearch{
	public static void main(String[] args){
		System.out.println(new RLS().search(5));
	}
}

class LS{
	public int Init(int[] a,int len){
		int i;
		
		int temp2;
		i = 0;
		while(i<len){
			a[i] = i * 2;
			temp2 = a[i];
			a[i] = temp2 + 3;
			i = i + 1;
		}
		return 0;	
	}
}

class RLS extends LS{
	public int search(int elem){
		int[] arr;
		int size;
		int temp;
		int i;		
		arr = new int[10];
		size = 10;
		temp = new LS().Init(arr,size);
		//System.out.println(arr[0]);
		i = 0;
		while(i<size){
			System.out.println(arr[i]);
			i = i + 1;		
		}
		temp = this.reccall(arr,0,10,elem);
		return temp;		
	}
	
	public int reccall(int[] ar,int i,int ln,int element){
		boolean ch;
		int val;
		int ret;
		val = 0;
		ch = this.compare(ar[i],element);
		if(!(i<ln))
			ret = 0;			
		
		else if(ch)
			ret = 1;
		else{
			i = i + 1;
			val = this.reccall(ar,i,ln,element);
			ret = val;		
		}
		return ret;
				
	}


	public boolean compare(int num1 , int num2){
		boolean retval ;
		int aux02 ;

		retval = false ;
		aux02 = num2 + 1 ;
		if (num1 < num2) retval = false ;
		else if (!(num1 < aux02)) retval = false ;
		else retval = true ;
		return retval ;
    	}
}
