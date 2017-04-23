class Abc{
    public static void main(String[] a){
        Shape a;
        int b;
        int ten;
        a = new Shape();
        ten = 10;
        /*INLINE*/b =a.ComputeArea(a);
        System.out.println(b);
    }
}

class Shape {


    public int ComputeArea(int b)
    {
        int area;
        area = b * b;
        return area;
    }

}


