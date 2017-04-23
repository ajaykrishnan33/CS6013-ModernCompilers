class T2{
	public static void main(String[] args) {
		int t;
        int v;
        v=3;
		t=new T2a().func(v);
		System.out.println(t);
        t=new T2a().func2();
        System.out.println(t);
	}
}

class T2a{
	public int func(int n)
	{
		int x;
    int e1;
         int e2;
    int e3;
    e3 =  4;
    e2=0;
    e1=0;
    	for (x = 0; x < 5; x = x + 1) 
    	{
        e1 = e3 + 3;
        /* LOOPINVARIANTCODE? */ e2 = e3 * e1;
        /* LOOPINVARIANTCODE? */ e2 = e3 * x;
        /* LOOPINVARIANTCODE? */ e2 = e3 * n;
       }
       return e2;
	} 
     public int func2()
    {
        int i;
        int j;
    int[] arr;
    int s;
    int l;
    int t1;
    int t2;
    t1=0;
    t2=1;
    l=0;
    s=10;
    arr=new int[s];
    for (j=0;j<10 ;j=j+1 ) {
        arr[j]=j;
    }
       //No
       /* INDEPENDENTITERS? */ for (i = 0; i < 6; i = i + 1) 
        {
           arr[i]=3;
           t1=10-t2;
           t2=t2+1;
           l=arr[t1];
       }
       return l;
    } 
}