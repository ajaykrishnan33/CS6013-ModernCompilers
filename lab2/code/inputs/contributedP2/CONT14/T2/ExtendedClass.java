class ExtendedClass{
    public static void main(String[] a){
        System.out.println(new Shape().print());
    }
}

class Shape {

    int sides;

    public int print(){
        System.out.println(1);
        return 1;
    }

}

class Circle extends Shape {

   int radius;
 
}
