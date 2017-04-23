
class P1 {
    public static void main(String [] args) {
        int t;
        int j;
        j = 20;
        t = new A().A_func(j);
        System.out.println(t);
    }
}

class A {
    int i;
    public int A_func(int num){
        int j;
        boolean k;
        boolean flag;
        boolean f1;
        int n;
        int j1;
        int one;
        int zero;
        n = 0;
        k = false;
        one = 1;
        zero = 0;
        j1 = 5;
        k = j1 < num;
        if (k) {
            j = 10; 
        }
        else {
            j = 15;
        }
        k = true;
        /* INLINE */
        this.A1_func(num, k);
        k = false;
        j1 = 2;
        f1 = true;
        for (i = 0; i < j; i = i + j1) {
            flag = k & f1;
            flag = !flag;
            while(flag)
            {
                k = !k;
                n = n + one;
            }

        }
        System.out.println(n);

        return n;
    }

    public int A1_func(int num, boolean flag) {
        int n;
        n = num;
        if (flag) {
            n = n + num;
        }else {
            n = num;
        }
        System.out.println(n);
        return num;
    }
}
