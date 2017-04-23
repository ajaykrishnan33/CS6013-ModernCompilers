class test2 {
    public static void main(String[] args) {
        int r;
        int[] arr;
        r = 15;
        arr = new int[r];
        r = new test2a().foo(arr, r);
        System.out.println(r);
    }
}

class test2a {
    int f1;
    public int foo(int[] a, int b) {
        int x;
        int y;
	boolean temp1;
	int[] arr;
	x=15;
	y=20;
	 arr = new int[x];
	/* INDEPENDENTITERS? */
	//NO
        for(x=0;x<5;x=x+1)
	{
		a[x]=x;
		temp1=1<x;
		f1=2*x;
		f1=f1+1;
		if(temp1)
			{y=arr[f1];}
		else {}
	}
        return y;
    }
}

