class Trial
{
	 public static void main(String[] a){
        System.out.println(new First().start(15));
    }
}


class First
{
	public int start(int x)
	{
		int y;
		int z;
		int sum;
		y = 0;
		sum = 1;
		for(y=1;y<x;y=y+2)
		{
			for(z=1;z<x;z=z+2)
			{
				sum = sum + z;
			}
			
		}
		return sum;
	}
}
