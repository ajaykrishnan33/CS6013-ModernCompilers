class Reverse {
public static void main(String[] b){
int temp2;
R temp0;
int temp1;
temp0 = new R();
temp1 = 10;
temp2 = temp0.init(temp1);
System.out.println(temp2);

}
}
class R {
int[] a;
int sz;
public int rev (int e ){
int temp11;
int temp12;
R temp13;
int temp14;
int d;
int f;
int g;
int temp10;
int h;
int temp15;
int temp3;
int temp6;
int temp7;
int temp4;
boolean temp5;
int temp8;
int temp9;
temp3 = 0;
f = temp3;
temp4 = 5;
temp5 = f < temp4;
while(temp5){
temp6 = e - f;
temp7 = 1;
temp8 = temp6 - temp7;
h = temp8;
temp9 = a[f];
d = temp9;
temp10 = a[h];
a[f] = temp10;
a[h] = d;
temp11 = 1;
temp12 = f + temp11;
f = temp12;
temp4 = 5;
temp5 = f < temp4;
}
temp13 = this;
temp14 = temp13.print();
g = temp14;

temp15 = 0;

return temp15;
}
public int init (int size ){
int temp22;
R temp23;
int temp24;
int c;
int temp25;
int temp20;
R temp21;
int h;
int temp19;
int i;
int[] temp16;
int temp17;
boolean temp18;
sz = size;
temp16= new int[size];
a = temp16;
temp17 = 0;
c = temp17;
temp18 = c < size;
while(temp18){
a[c] = c;
temp19 = 1;
temp20 = c + temp19;
c = temp20;
temp18 = c < size;
}
temp21 = this;
temp22 = temp21.print();
h = temp22;
temp23 = this;
temp24 = temp23.rev(sz);
i = temp24;

temp25 = 999;

return temp25;
}
public int print ( ){
int temp30;
int temp31;
int j;
int temp26;
boolean temp27;
int temp28;
int temp29;
temp26 = 0;
j = temp26;
temp27 = j < sz;
while(temp27){
temp28 = a[j];
System.out.println(temp28);
temp29 = 1;
temp30 = j + temp29;
j = temp30;
temp27 = j < sz;
}

temp31 = 0;

return temp31;
}
}
