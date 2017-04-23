class test3 {
    public static void main(String[] args) {
        int r;
        int[] arr;
        r = 15;
        arr = new int[r];
        r = new test3a().foo(arr, r);

        System.out.println(r);
    }
}

class test3a {
    int f1;
    public int foo(int[] a, int b) {
        int x;
        int y;
	int z;
	int p;
	int q;
	int t;
	boolean temp1;
	p=15;
        for(x=0;x<10;x=x+1)
	{
		y=10;
		z=20;
		p=y-z;
		y=p-z;
		q=y-p;
		/* LOOPINVARIANTCODE? */
		//YES
		t=q+10;
		temp1=1<x;
		f1=x-1;
		
		if(temp1)
			{
				/* LOOPINVARIANTCODE? */
				//NO
				p=t;
			}
		else {
			/* LOOPINVARIANTCODE? */
			//NO
			p=b;
			}
		b=x;
	}
        return p;
    }
}

