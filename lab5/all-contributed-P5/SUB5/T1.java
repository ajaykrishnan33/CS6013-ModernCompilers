class T1{
    public static void main(String [] args_){
        T12 x;
        boolean b;

        x=new T12();
        /*INLINE*/b=x.Fun();
        System.out.println(b);
    }

}

class T12 extends T1{


    public boolean Fun() {
        boolean b;
        int i;
        int k;
        int a;
        T12 x;
        boolean b1;

        x=new T12();

        k=5;
        a=6;
        i=7;



        b=k<a;
        if(b){
            System.out.println(a);
        }
        else{
            System.out.println(i);	
        }
        b1=i<k;
        if(b1){
            b1=x.Fun();
        }
        else{
            System.out.println(b1);
        }
        return b;
    }

}
