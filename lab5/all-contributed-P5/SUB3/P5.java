

class P5 {
    public static void main(String [] args) {
        int t;
        t = new C().C_func();
        System.out.println(t);
    }
}

class C {
    public int C_func(int num) {
        int num_aux ;
        int temp;
        int t1;
        int one;
        boolean flag;
        one = 1;
        flag = num < one;
        if (flag){
            num_aux = 0 ;
        }
        else{
            t1 = num - one;
            /* INLINE */
            temp = this.C_func(t1);
            num_aux = num + temp ;
        }
        return num_aux ;
    }
}

