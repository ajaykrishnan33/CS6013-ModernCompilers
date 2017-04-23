class Amstrong {
public static void main(String[] a){
int temp2;
ANumber temp0;
int temp1;
temp0 = new ANumber();
temp1 = 153;
temp2 = temp0.Compute(temp1);
System.out.println(temp2);

}
}
class ANumber {
public int Compute (int n ){
int temp11;
int a;
int temp12;
int b;
int temp;
int temp13;
int c;
boolean temp14;
int temp20;
int temp10;
int temp21;
boolean temp19;
boolean temp15;
int temp3;
int temp16;
boolean temp17;
boolean temp18;
ANumber temp6;
int temp7;
int temp4;
boolean temp5;
int temp8;
int temp9;
temp3 = 0;
c = temp3;
temp4 = 0;
temp5 = temp4 < n;
while(temp5){
temp6 = this;
temp7 = temp6.DivByTen(n);
b = temp7;
temp8 = n - b;
a = temp8;
n = b;
temp9 = a * a;
b = temp9;
temp10 = a * b;
b = temp10;
temp11 = c + b;
c = temp11;
temp4 = 0;
temp5 = temp4 < n;
}
temp12 = n - c;
b = temp12;
temp13 = 0;
temp14 = b < temp13;
temp15= !temp14;
temp16 = 0;
temp17 = temp16 < b;
temp18= !temp17;
temp19 = temp15 & temp18;
if(temp19){
temp20 = 0;
a = temp20;
}
else{
temp21 = 1;
a = temp21;
}


return a;
}
public int DivByTen (int n ){
int temp22;
int temp23;
boolean temp24;
int temp25;
int x;
int y;
int temp26;
int temp27;
int temp28;
temp22 = 0;
y = temp22;
temp23 = 10;
x = temp23;
temp24 = x < n;
while(temp24){
temp25 = 1;
temp26 = y + temp25;
y = temp26;
temp27 = 10;
temp28 = x + temp27;
x = temp28;
temp24 = x < n;
}


return y;
}
}
