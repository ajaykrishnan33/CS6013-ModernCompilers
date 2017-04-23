class T1{
	public static void main(String[] args) {
		int t;
		t=new T1a().func();
		System.out.println(t);
		t=new T1a().func2();
		System.out.println(t);
		
	}
}

class T1a{
	public int func()
	{
		int x;
    int e1;
         int e2;
    int e3;
    e3 =  4;
    e2=0;
    e1=0;
    	for (x = 0; x < 20; x = x + 1) 
    	{
        e1 = e3 + 3;
        //Yes
        /* LOOPINVARIANTCODE? */ e2 = e3 * e1;
        //No
        /* LOOPINVARIANTCODE? */ e2 = e3 * x;
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
    int t3;
    t1=0;
    t2=1;
    t3=0;
    l=0;
    s=10;
    arr=new int[s];
    for (j=0;j<10 ;j=j+1 ) {
        arr[j]=j;
    }
       //Yes
       /* INDEPENDENTITERS? */ for (i = 0; i < 5; i = i + 1) 
        {
        	t1=	2*i;
          arr[t1]=10;
          t3=10-t2;
          t2=t2+2;
          l=arr[t3];
       }
       return l;
    } 
}