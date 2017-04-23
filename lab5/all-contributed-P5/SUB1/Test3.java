class Test3{

    public static void main(String[] args){
        Test3Aux p;
        int q;
        q = 5;
        p = new Test3Aux();
        q = p.func1(q);
    }

}

class Test3Aux{

    int x;

    public int func1(int n){
        boolean cond1;
        boolean cond2;
        int res;
        int temp;
        int val;
        val = 0;
        cond1 = n<val;
        cond1 = !cond1;
        cond2 = val<n;
        cond2 = !cond2;
        cond1 = cond1 & cond2;
        if(cond1){
            res = 1;
        }
        else{
            val = 1;
            temp = n-val;
            /*INLINE*/
            res = this.func1(temp);
        }
        return res;
    }

}
