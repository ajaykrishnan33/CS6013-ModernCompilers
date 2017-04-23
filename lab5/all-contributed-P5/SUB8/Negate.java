class Negate
{
    public static void main(String[] abc) {
        int res;
        neg tn;
        boolean t6;
        tn = new neg();
        t6 = true;
        /* INLINE */ res = tn.t2(t6);
        System.out.println(res);
    }
}
class neg
{
    public boolean t1(boolean u, boolean v){
        boolean rf;
        rf = u & v;
        rf = !rf;
        return rf;
    }
    public int t2(boolean a){
        boolean b;
        boolean c;
        boolean t7;
        boolean t8;
        boolean t9;
        boolean t0;
        boolean ju;
        int i;
        i = 0;
        b = false;
        c = true;
        t8 = !b;
        t7 = c & t8;
        t9 = a & t7;
        /* INLINE */ t0 = this.t1(t8,a);
        ju = !t0;
        if(ju){
            if(t9){
                i = 1;
            } else i =2;
        } else i = 0;
        return i;
    }

}
