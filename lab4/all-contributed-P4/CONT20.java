class T5{
	public static void main(String[] args) {
		int t;
        int v;
        t=new T5a().func();
        System.out.println(t);
        v=3;
        t=new T5a().func2(v);
        System.out.println(t);
	}
}

class T5a{
	public int func()
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
            t1= 2*i;
          arr[t1]=10;
          t3=10-t2;
          t2=t2+2;
          l=arr[t3];
       }
       return l;
    } 
    public int func2(int n)
    {
        int m;
    int o;
         int p;
    int q;
    q =  4;
    p=0;
    o=0;
        for (m = 0; m < 5; m = m + 1) 
        {
        o = q + 3;
        //Yes
        /* LOOPINVARIANTCODE? */ p = q * o;
        //No
        /* LOOPINVARIANTCODE? */ p = q * m;
       //Yes
        /* LOOPINVARIANTCODE? */ p = q * n;
       
       }
       return p;
    } 
}