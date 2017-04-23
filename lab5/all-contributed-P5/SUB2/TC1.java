class TC1 {
    public static void main(String[] args){
        C1 c;
        int y;
        c = new C1();
        y = 10;
        /* INLINE */
        y = c.get(y);
    }
}

class C1{
    public int get(int x){
        return x;
    }
}
