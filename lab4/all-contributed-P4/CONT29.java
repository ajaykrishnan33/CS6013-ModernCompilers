class P4{public static void main(String[] arg)
	{
		int[] a;
		int i;
		int j;
		int one;
		int ten;
		int zero;
		arry x;
		x = new arry(); 
		one = 1;
		ten = 10;
		zero = 0;
		a=new int[ten];
		for(i=zero;i<ten;i= i + one)
		{
			//No
			/*LOOPINVARIANTCODE?*/j = i + one;
			a[i] = j;
		}
		one = x.reverseArry(a);

	}
}

class arry{
	public int reverseArry(int[] a)
	{
		int i;
		int j;
		int zero;
		int ten;
		int one;
		zero = 0;
		ten = 10;
		one =1;
		//Yes
		/*INDEPENDENTITERS?*/for(i=zero;i<ten;i= i + one)
		{
			j = ten - i;
			a[j] = i;
		}
		return zero;
	}
}
