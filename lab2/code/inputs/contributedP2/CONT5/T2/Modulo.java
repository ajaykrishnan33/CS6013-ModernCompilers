class Modulo{
	public static void main(String[] a){
		System.out.println(new Mod().find(32,3));	
	}
}


class Mod{
	public int find(int num1,int num2){
		int rem;
		int temp;
		boolean flag;
		int ret;
		/*for(temp = num2;temp<num1;temp = temp + num2){
		}*/
		temp = num2;
		while(temp < num1){
			temp = temp + num2;		
		}
		rem = temp - num2;
		rem = num1 - rem;
		flag = this.compare(rem,num2);
		if(flag)
			ret = 0;
		else
			ret = rem;
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
