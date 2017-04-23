class ArrayReverse{
    public static void main(String[] x){
        AR a;
        int b;
        int ten;
        a = new AR();
        ten =10;
        /*INLINE*/b = a.PrintRev(ten);
        System.out.println(b);
    }
}
class AR{
    int[] n;
    public int PrintRev(int a){
        int i;
        int j;
        int k; 
        boolean x;
        int one;
        n = new int[a];
        one =1;
        for(i=0;i<a;i=i+one){	
            j=a-i;
            j=j-one;
            n[j]=i;
        }
        i=0;
        x = i<a;
        while(x){
            k = n[i];
            System.out.println(k);
            i=i+one;
        }
        return one;
    }
}





