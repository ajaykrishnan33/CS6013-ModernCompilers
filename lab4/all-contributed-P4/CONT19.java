class T4{
	public static void main(String[] args) {
		int t;
		t=new T4a().func();
		System.out.println(t);
	}
}

class T4a{
	public int func()
	{
        int x;
        int t1;
        int t2;
        int t3;
        int t4;
        int[] arr;
        int s;
        int i;
        x=0;
        i=0;
        t1=0;
        t2=0;
        t3=0;
        t4=0;
        s=500;
        arr=new int[s];
    //No
	/* INDEPENDENTITERS? */ for (x = 1; x < 10; x = x + 1) {
    t3 = 2 * x;
    t4 = 4 * x;
    t2 = t3 - 1;
    t1 = t4 + 1;
    arr [t1] = 10; 
    i = arr[t2]; 
      }
      return i;
	} 
}
