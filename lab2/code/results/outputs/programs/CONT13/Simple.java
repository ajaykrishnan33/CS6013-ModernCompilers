class Simple {
public static void main(String[] s){
A temp0;
int temp1;
temp0 = new A();
temp1 = temp0.g();
System.out.println(temp1);

}
}
class A {
public boolean f ( ){
int temp11;
int a;
int temp12;
boolean temp13;
boolean temp14;
int[] temp10;
int i;
int j;
int k;
int temp2;
int temp3;
boolean temp6;
boolean temp7;
int temp4;
int temp5;
int temp8;
int temp9;
temp2 = 10;
a = temp2;
temp3 = 1;
i = temp3;
temp4 = 2;
j = temp4;
temp5 = 4;
k = temp5;

temp6 = false;
temp7= !temp6;
temp8 = a * a;
temp9 = temp8 + i;
temp10= new int[temp9];
temp11 = 5;
temp12 = temp10[temp11];
temp13 = temp12 < a;
temp14 = temp7 & temp13;

return temp14;
}
public int g ( ){
int temp22;
int temp23;
int temp24;
int temp25;
A temp20;
boolean temp21;
int temp19;
int i;
int temp15;
int temp26;
int[] temp16;
int temp27;
int temp17;
int temp18;
int[] v;
temp15 = 2;
temp16= new int[temp15];
v = temp16;
temp17 = 1;
i = temp17;
temp18 = 1;
temp19 = 1;
v[temp18] = temp19;
temp20 = new A();
temp21 = temp20.f();
if(temp21){
temp22 = 0;
i = temp22;
}
else{
}

temp23 = v.length;
temp24 = 1;
temp25 = i + temp24;
temp26 = temp23 - temp25;
temp27 = v[temp26];

return temp27;
}
}
