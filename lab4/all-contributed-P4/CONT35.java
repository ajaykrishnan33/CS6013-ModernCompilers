class test5 {
    public static void main(String[] args) {
        int r;
        int[] arr;
        r = 15;
        arr = new int[r];
        r = new test5a().foo(arr, r);

        System.out.println(r);
    }
}

class test5a {
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
	p=70;
	y=a[x];
	z=1;
	/* INDEPENDENTITERS? */
	//NO
        for(x=0;x<10;x=x+1)
	{
		t=x-1;
		a[x]=t;
		p=50-z;
		q=y-p;
		
		temp1=x<2;
		if(temp1)
		{
			a[x]=x;
		}
		else
		{
			p=a[t];
		}
		/* LOOPINVARIANTCODE? */
		//YES
		t=q+10;
		
	}
        return p;
    }
}

