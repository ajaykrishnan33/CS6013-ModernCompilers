class Loop
{
	 public static void main(String[] a){
        System.out.println(new yloop().l1(7));
    }
}


class yloop
{
	public int l1(int m)
	{
		int n;
		int count;
		count = 0;
		while(2<m){
		    n = 1;
		    while(n<4){
		      count = count +1;
		      n= n+1;
		    }
		    m=m-2;
		}
		return count;
	}
}
