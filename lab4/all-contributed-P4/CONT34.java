class test4 {
    public static void main(String[] args) {
        int r;
        int[] arr;
        r = 15;
        arr = new int[r];
        r = new test4a().foo(arr, r);

        System.out.println(r);
    }
}

class test4a {
    int f1;
    public int foo(int[] a, int b) {
        int x;
        int y;
	int z;
	int p;
	int q;
	int t;
	boolean temp1;
	x=5;
	y=a[x];
        for(x=0;x<10;x=x+1)
	{
		
		z=20;
		p=50-z;
		q=y-p;
		/* LOOPINVARIANTCODE? */
		//NO
		t=q+10;
		y=x;
	}
        return y;
    }
}

