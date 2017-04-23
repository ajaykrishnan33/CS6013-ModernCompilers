
class TC4 {

    public static void main(String[] args) {
        C4 c;
        int x;
        EC4_1 ec4_1;
        c = new C4();
        x = 10;
        x = c.set(x);
        /* INLINE */
        x = c.foo();
        c = new EC4_1();
        /* INLINE */
        x = c.foo();
        ec4_1 = new EC4_1();
        /* INLINE */
        ec4_1.bar();
        System.out.println(x);
    }

}

class C4{
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

class EC4_1 extends C4{
    public int bar(){
        return x;
    }
}

class EC4_2 extends EC4_1{
    public int bar(){
        int ten;
        ten = 10;
        x = ten + x;
        return x;
    }
}

class EC4_3 extends C4{
    public int bar(){
        int ten;
        ten = 10;
        x = x - ten;
        return x;
    }
}
