class Divide{
	public static void main(String[] args){
		System.out.println(new Div().check(31,3));
	}
}


class Div{
	public int check(int number1, int number2){
		int temp;
		boolean ch;
		int ret;
		if(number1<number2)
			ret = 0;
		else{
			//for(temp = number2;temp<number1;temp = temp + number2);
			temp = number2;
			while(temp < number1){
				temp = temp + number2;
			}
			ch = this.Compare(temp,number1);
			if(ch)
			{
				ret = 1;			
			}			
			else
				ret = 0;
		}	
		return ret;
		
	}
	
	public boolean Compare(int num1 , int num2){
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
