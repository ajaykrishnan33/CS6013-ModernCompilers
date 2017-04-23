class Test4{

    public static void main(String[] args){
        Parent p;
        int q;
        p = new Child();
        q = 5;
        /*INLINE*/
        q = p.func1(q);
    }

}

class Parent{
    int x;
    public int func1(int a){
        int x;
        int y;
        y = 2;
        x = y*a;
        return x;
    }
}

class Child extends Parent{
    public int func1(int a){
        int x;
        int y;
        y = 2;
        x = y*a;
        y = 1;
        x = x + y;
        return x;
    }
}
