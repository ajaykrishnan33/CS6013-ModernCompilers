

class P3 {
    public static void main(String [] args) {
        int t;
        t = new C().C_func();
        System.out.println(t);
    }
}

class C {
    public int C_func() {
        int i;
        A a;
        int i1;
        int i2;
        int ret;
        int zero;
        zero = 0;
        i = 5;
        a = new A();
        i1 = new A().A_func(i,zero);
        i = i + i;
        /* INLINE */
        i2 = new A().A_func(i, zero);
        ret = a.A_func(i1,i2);
        return ret;
    }
}

class A {

    public int A_func(int num,int j){
        num = num + j;
        return num;
    }
}
