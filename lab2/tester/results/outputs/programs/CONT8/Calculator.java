class Calculator {
public static void main(String[] a){
int temp2;
int temp3;
My_Calculation temp0;
int temp1;
temp0 = new My_Calculation();
temp1 = 40;
temp2 = 37;
temp3 = temp0.Start(temp1,temp2 );
System.out.println(temp3);

}
}
class Calculation {
int z;
public int addition (int x, int y ){
int temp4;
int temp5;
temp4 = x + y;
z = temp4;
System.out.println(z);

temp5 = 0;

return temp5;
}
public int Subtraction (int x, int y ){
int temp6;
int temp7;
temp6 = x - y;
z = temp6;
System.out.println(z);

temp7 = 0;

return temp7;
}
}
class My_Calculation extends Calculation {
public int multiplication (int x, int y ){
int temp8;
temp8 = x * y;
z = temp8;


return z;
}
public int Start (int a, int b ){
Calculation temp11;
int temp12;
My_Calculation temp13;
int temp14;
Calculation temp9;
int temp10;
int x;
temp9 = new Calculation();
temp10 = temp9.addition(a,b );
x = temp10;
temp11 = new Calculation();
temp12 = temp11.Subtraction(a,b );
x = temp12;
temp13 = this;
temp14 = temp13.multiplication(a,b );
x = temp14;


return x;
}
}
