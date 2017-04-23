class ExtendedClass {
public static void main(String[] a){
Shape temp0;
int temp1;
temp0 = new Shape();
temp1 = temp0.print();
System.out.println(temp1);

}
}
class Shape {
int sides;
public int print ( ){
int temp2;
int temp3;
temp2 = 1;
System.out.println(temp2);

temp3 = 1;

return temp3;
}
}
class Circle extends Shape {
int radius;
}
