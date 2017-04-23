class Palindrome{
	public static void main(String[] args){
		System.out.println(new Palin().check(1210));
	}
}


class Palin{
	
	public int check(int num){
		int temp;
		int rev;
		int temp1;
		int temp2;
		int rem;
		int ret;
		boolean ch;

		temp = num;
		rev = 0;
		while(!(temp < 10)){
			temp1 = temp;
			while(!(temp1<10)){
				temp1 = temp1 - 10;		
			}
			rev = rev * 10;
			rev = rev + temp1;
			
			rem = 0;
			temp1 = 0;
			temp2 = temp;
			while(temp1 < temp2){
				rem = rem + 1;
				temp1 = temp1 + 10;			
			}
			temp = rem - 1;
		}
		rev = rev * 10;
		rev = rev + temp;
		ch = this.Compare(rev,num);
		if(ch){
			ret = 1;		
		}
		else
			ret = 0;
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
