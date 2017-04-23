

class P4 {
    public static void main(String [] args) {
        int t;
        t = new C().C_func();
        System.out.println(t);
    }
}

class C {
    public int C_func() {
        boolean flag;
        int i;
        int one;
        one = 1;
        flag = true;
        i = 0;
        while (flag) {
            /* INLINE */
            flag = new D().D_func(flag,i);
            i = i + one;
        }
        return i;
    }
}

class D{
    public boolean D_func(boolean flag,int i) {
        int j;
        boolean k;
        boolean ret;
        j = 5;
        k = i < j;
        if (flag) {
            ret = flag;
        }else {
            flag = !flag;
            ret = flag;
        }
        return ret;
    }
}
