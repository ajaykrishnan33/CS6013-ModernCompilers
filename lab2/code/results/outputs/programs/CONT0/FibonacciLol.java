class FibonacciLol {
public static void main(String[] a){
int temp2;
Fib temp0;
int temp1;
temp0 = new Fib();
temp1 = 10;
temp2 = temp0.Start(temp1);
System.out.println(temp2);

}
}
class Fib {
int[] number;
int size;
public int Start (int sz ){
int temp6;
int temp7;
int temp4;
Fib temp5;
int aux01;
Fib temp3;
System.out.println(sz);
temp3 = this;
temp4 = temp3.Populate(sz);
aux01 = temp4;
System.out.println(aux01);
temp5 = this;
temp6 = temp5.Print();
aux01 = temp6;
System.out.println(aux01);

temp7 = 0;

return temp7;
}
public int Populate (int sz ){
int aux1;
boolean temp11;
int aux0;
int temp12;
int aux3;
boolean temp13;
int aux2;
int temp14;
int temp20;
int temp10;
int temp21;
int temp19;
int temp15;
int temp16;
int temp17;
int temp18;
int[] temp8;
int temp9;
temp8= new int[sz];
number = temp8;
size = sz;
temp9 = 0;
aux0 = temp9;
temp10 = 0;
aux1 = temp10;
temp11 = aux0 < size;
while(temp11){
number[aux0] = aux1;
temp12 = 1;
temp13 = aux0 < temp12;
if(temp13){
temp14 = 1;
aux1 = temp14;
}
else{
temp15 = 1;
temp16 = aux0 - temp15;
aux2 = temp16;
temp17 = number[aux2];
aux3 = temp17;
temp18 = aux1 + aux3;
aux1 = temp18;
}
temp19 = 1;
temp20 = aux0 + temp19;
aux0 = temp20;
temp11 = aux0 < size;
}

temp21 = 0;

return temp21;
}
public int Print ( ){
int temp22;
boolean temp23;
int temp24;
int temp25;
int aux;
int temp26;
int temp27;
temp22 = 0;
aux = temp22;
temp23 = aux < size;
while(temp23){
temp24 = number[aux];
System.out.println(temp24);
temp25 = 1;
temp26 = aux + temp25;
aux = temp26;
temp23 = aux < size;
}

temp27 = 0;

return temp27;
}
}
