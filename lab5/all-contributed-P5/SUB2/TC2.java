class TC2 {
    public static void main(String[] args){
        C2 c;
        int y;
        c = new C2();
        y = 10;
        /* INLINE */
        y = c.get(y);
    }
}

class C2{
    public int get(int x){
        int y;
        boolean b;
        int one;
        one = 1;
        b = x < one;
        if(b)
            y = x;
        else{
            x = x - one;
            y = this.get(x);
        }
        return y;
    }
}
