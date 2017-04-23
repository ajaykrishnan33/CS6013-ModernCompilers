class While
{
	 public static void main(String[] a){
        System.out.println(new W().loop(6));
    }
}


class W
{
	public int loop(int x)
	{
		int y;
		int z;
		int sum;
		y = 0;
		sum = 1;
		while(y<x)
		{
			for(z=1;z<x;z=z+1)
			{
				sum = sum * z;
			}
			y=y+1;
		}
		return sum;
	}
}