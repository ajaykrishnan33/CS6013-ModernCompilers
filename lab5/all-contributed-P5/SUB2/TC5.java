
class TC5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int y1;
        int z2;
        int z3;
        int z4;
        C5 c;
        c = new C5();
        y1 = 10;
        /* INLINE */
        y1 = c.setX(y1);
        z2 = 20;
        z3 = 1203;
        /* INLINE */
        z4 = c.setRemaining(z2, z3);
        /* INLINE */
        z4 = c.foo(y1, z2, z3);
        System.out.println(z4);
    }

}

class C5{
    int x;
    int y;
    int z;

    public int setX(int x1){
        x = x1;
        return x;
    }
    public int setRemaining(int y1, int z1){
        int z3;
        y = y1;
        z = z1;
        z3 = y + z;
        return z3;
    }
    public int foo(int s, int s2, int s3){
        int y1;
        int z2;
        int z3;
        y1 = s;
        z2 = y1 + s2;
        z3 = y1 + s3;
        System.out.println(z2);
        return z3;
    }
}
