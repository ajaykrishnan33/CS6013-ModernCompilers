class Divide
	{
    public static void main(String[] a){
	System.out.println(new D().div(10, 3));
	}
}

class D
{
	int ans;
	//ans = 0;
	public int div(int num, int divisor)
	{
		int s;
		if(!(this.equals(divisor,0)))
		{
			if(num<divisor)
				ans  = 0;
			else
			{
				if(!(this.equals(num-divisor,0)))
					ans = 1 + (this.div(num-divisor,divisor));
				else
					ans =  1;
			}
		}
		else
			ans =  0;	
		return ans;
	}

	public boolean equals(int x, int y)
	{
		int t;
		boolean yes;
		yes = false;

		t  = y+1;
		if(x<y) yes = false;
		else if(!(x<t)) yes = false;
		else yes = true;
		return yes;
	}
}
