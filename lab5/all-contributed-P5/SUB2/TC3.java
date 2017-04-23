
class TC3 {

    public static void main(String[] args) {
        C3 c;
        int x;
        c = new C3();
        x = 10;
        x = c.set(x);
        /* INLINE */
        x = c.foo();
        c = new EC3_1();
        /* INLINE */
        x = c.foo();
    }

}

class C3{
    int x;
    public int set(int y){
        x = y;
        y = 0;
        return y; 
    }
    public int foo(){
        return x;
    }
}

class EC3_1 extends C3{
    public int foo(){
        return x;
    }
}

class EC3_2 extends EC3_1{
    public int foo(){
        int ten;
        ten = 10;
        x = ten + x;
        return x;
    }
}

class EC3_3 extends C3{
    public int foo(){
        int ten;
        ten = 10;
        x = x - ten;
        return x;
    }
}
