class Loopy5
{
	public static void main(String[] args) {
		int a;
		Loopy5Helper lh;
		int arg1;
		boolean arg2;
		lh = new Loopy5Helper(); 
		arg1 =  88;
		arg2 = true;
		a = lh.func1(arg1,arg2);
		System.out.println(a);

	}
}

class Loopy5Helper
{
	int x;
	boolean y;

	public int func1(int p, boolean q)
	{
		int i;
		int j;
		int [] arr;
		int size;
		int ch;
		int indx1;
		int indx2;
		x = 67 -15;
		y = true;
		ch =2;
		p =  119 * 3;
		q = p < x;
		size = 100;
		arr = new int[size];
		if(q)
		{
			/*INDEPENDENTITERS?*/for (i = 0;y;i=i+21)//Yes
			{
				indx1 = i + 5;
				indx1  =  indx1 - 3;
				indx2 = i * 2;
				indx2 = indx2 + 1;
				arr[indx1] = x;
				ch = arr[indx2];
				y = false;
			}
		}
		else
		{
			/*INDEPENDENTITERS?*/for (i = 0;y;i=i+11) //No
			{
				indx1 = i + 6;
				indx1  =  indx1 - 3;
				indx2 = i + 5;
				indx2 = indx2 - 1;
				arr[indx1] = x;
				ch = arr[indx2];
				y = false;
			}

		}
		return ch;
	}

}