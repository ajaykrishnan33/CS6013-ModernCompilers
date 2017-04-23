class T3{
	public static void main(String[] args) {
		int t;
		t=new T3a().func1();
		System.out.println(t);
        t=new T3a().func2();
        System.out.println(t);
	}
}

class T3a{
	public int func1()
	{
		int a;
    int b;
         int c;
    int d;
    d =  4;
    c=0;
    b=0;
    	for (a = 0; a < 20; a = a + 1) 
    	{
        b = d + 3;
        //Yes
        /* LOOPINVARIANTCODE? */ c = d * b;
        //No
        /* LOOPINVARIANTCODE? */ c = d * a;
       }
       return c;
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
       //Yes
       /* INDEPENDENTITERS? */ for (i = 0; i < 5; i = i + 1) 
        {
           arr[i]=3;
           t1=10-t2;
           t2=t2+1;
           l=arr[t1];
       }
       return l;
    } 
}