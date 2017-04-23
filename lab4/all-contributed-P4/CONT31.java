class test1 {
    public static void main(String[] args) {
        int r;
        int[] arr;
        r = 15;
        arr = new int[r];
        r = new test1a().foo(arr, r);
        r = new test1b().foo(arr, r);
        System.out.println(r);
    }
}

class test1a {
    int f1;
    public int foo(int[] a, int b) {
        int x;
        int y;
	boolean temp1;
	/* INDEPENDENTITERS? */
	//YES
        for(x=0;x<10;x=x+1)
	{
		a[x]=x;
		temp1=1<x;
		f1=x-1;
		if(temp1)
			{y=a[f1];}
		else {}
	}
        return x;
    }
}

class test1b extends test1a {
    int f2;
    public int foo(int[] a, int b) {
        int x;
        int y;
	boolean temp1;
	/* INDEPENDENTITERS? */
	//NO
        for(x=0;x<10;x=x+1)
	{
		a[x]=x;
		
	}
        return x;
    }
}

