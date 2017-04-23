class InsertionSort {
public static void main(String[] a){
int temp2;
IS temp0;
int temp1;
temp0 = new IS();
temp1 = 10;
temp2 = temp0.Start(temp1);
System.out.println(temp2);

}
}
class IS {
int[] number;
int size;
public int Start (int sz ){
int temp6;
IS temp7;
int temp4;
IS temp5;
int temp8;
int temp9;
int aux01;
IS temp3;
System.out.println(sz);
temp3 = this;
temp4 = temp3.Init(sz);
aux01 = temp4;
System.out.println(aux01);
temp5 = this;
temp6 = temp5.Sort();
aux01 = temp6;
System.out.println(aux01);
temp7 = this;
temp8 = temp7.Print();
aux01 = temp8;
System.out.println(aux01);

temp9 = 0;

return temp9;
}
public int Init (int sz ){
int temp11;
boolean temp12;
int temp13;
int temp14;
int temp20;
int[] temp10;
int temp21;
int aux01;
int temp19;
int i;
int aux03;
int aux02;
int temp15;
int temp16;
int temp17;
int temp18;
size = sz;
temp10= new int[sz];
number = temp10;
temp11 = 0;
i = temp11;
temp12 = i < sz;
while(temp12){
temp13 = 4;
temp14 = i * temp13;
aux01 = temp14;
temp15 = sz - i;
aux02 = temp15;
temp16 = 2;
temp17 = aux02 * temp16;
aux03 = temp17;
temp18 = aux01 + aux03;
number[i] = temp18;
temp19 = 1;
temp20 = i + temp19;
i = temp20;
temp12 = i < sz;
}

temp21 = 0;

return temp21;
}
public int Sort ( ){
int aux1;
int temp22;
int temp33;
int temp23;
int temp34;
int temp24;
int temp35;
int aux2;
boolean temp25;
int temp36;
int temp30;
boolean temp31;
int temp32;
int i;
int j;
int temp26;
int temp37;
int temp27;
int temp38;
boolean temp28;
int temp29;
int t;
int key;
temp22 = 0;
i = temp22;
temp23 = 1;
temp24 = size - temp23;
temp25 = i < temp24;
while(temp25){
temp26 = 1;
temp27 = i + temp26;
j = temp27;
key = i;
temp28 = j < size;
while(temp28){
temp29 = number[j];
aux1 = temp29;
temp30 = number[key];
aux2 = temp30;
temp31 = aux1 < aux2;
if(temp31){
key = j;
}
else{
}
temp32 = 1;
temp33 = j + temp32;
j = temp33;
temp28 = j < size;
}
temp34 = number[key];
t = temp34;
temp35 = number[i];
number[key] = temp35;
number[i] = t;
temp36 = 1;
temp37 = i + temp36;
i = temp37;
temp23 = 1;
temp24 = size - temp23;
temp25 = i < temp24;
}

temp38 = 0;

return temp38;
}
public int Print ( ){
int temp44;
boolean temp40;
int temp41;
int temp42;
int temp43;
int i;
int temp39;
temp39 = 0;
i = temp39;
temp40 = i < size;
while(temp40){
temp41 = number[i];
System.out.println(temp41);
temp42 = 1;
temp43 = i + temp42;
i = temp43;
temp40 = i < size;
}

temp44 = 0;

return temp44;
}
}
