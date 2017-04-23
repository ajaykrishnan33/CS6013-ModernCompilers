class Print
{
	public static void main(String[] b){
	System.out.println(new PE().pqr(8));
	}
}
class P
{
	int sz;
	public int ABC(int n)
	{
		sz = n;
		System.out.println(n+1);
		System.out.println(n-1);
		System.out.println(n*2);
		// System.out.println(n&2);
		return 0;
	}
}

class PE extends P{
	public int pqr(int m)
	{
		int d;
		d = new P().ABC(m);
		System.out.println(m<2);
		//System.out.println(m.length);
		return 0;
	}
}
