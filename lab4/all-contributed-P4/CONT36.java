class Loopy1
{
	public static void main(String[] args) {
		int i;
		int x;
		int t3;
		int t4;
		int t1;
		int t2;
		int t5;
		int t6;
		int y;
		int size;
		int [] arr;
		size = 10;
		arr = new int[size];
		/*INDEPENDENTITERS?*/ for (x = 1; x < 10; x = x + 1) //Yes
			{
			t1 = 1 * 5;
			t2 = 2 + 2;
			t3 = 3 - 2;
			t4 = 4 + 5;
			t5 = 5 - 1;
			t6 = 6 * 1;
			arr[t1] = 1;
			arr[t2] = 2;
			arr[t3] = 3;
			arr[t4] = 4;
			arr[t5] = 5;
			arr[t6] = 6;
			System.out.println(x); 
		}

		/*INDEPENDENTITERS?*/ for (y = 1; y < 10; y = y + 1) //Yes
		{
			t1 = 1 * 5;
			t2 = 2 + 2;
			t3 = 3 - 2;
			t4 = 4 + 5;
			t5 = 5 - 1;
			t6 = 6 * 1;
			arr[y] = 1;
			arr[t2] = 2;
			arr[y] = 3;
			arr[t4] = 4;
			arr[t5] = 5;
			arr[y] = 6;
		}

	}
}