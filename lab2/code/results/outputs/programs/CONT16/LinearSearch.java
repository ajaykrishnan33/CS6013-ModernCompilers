class LinearSearch {
public static void main(String[] a){
int temp2;
LS temp0;
int temp1;
temp0 = new LS();
temp1 = 10;
temp2 = temp0.Start(temp1);
System.out.println(temp2);

}
}
class LS {
int[] number;
int size;
public int Start (int sz ){
LS temp11;
int temp12;
int temp13;
LS temp14;
int temp20;
int temp10;
int aux01;
int temp19;
int aux02;
int temp15;
LS temp3;
int temp16;
LS temp17;
int temp18;
int temp6;
int temp7;
int temp4;
LS temp5;
LS temp8;
int temp9;
temp3 = this;
temp4 = temp3.Init(sz);
aux01 = temp4;
temp5 = this;
temp6 = temp5.Print();
aux02 = temp6;
temp7 = 9999;
System.out.println(temp7);
temp8 = this;
temp9 = 8;
temp10 = temp8.Search(temp9);
System.out.println(temp10);
temp11 = this;
temp12 = 12;
temp13 = temp11.Search(temp12);
System.out.println(temp13);
temp14 = this;
temp15 = 17;
temp16 = temp14.Search(temp15);
System.out.println(temp16);
temp17 = this;
temp18 = 50;
temp19 = temp17.Search(temp18);
System.out.println(temp19);

temp20 = 55;

return temp20;
}
public int Print ( ){
boolean temp22;
int temp23;
int temp24;
int temp25;
int temp21;
int j;
int temp26;
temp21 = 1;
j = temp21;
temp22 = j < size;
while(temp22){
temp23 = number[j];
System.out.println(temp23);
temp24 = 1;
temp25 = j + temp24;
j = temp25;
temp22 = j < size;
}

temp26 = 0;

return temp26;
}
public int Search (int num ){
int temp33;
boolean temp34;
int temp35;
boolean temp36;
int temp40;
boolean temp30;
int temp41;
int nt;
int temp31;
int temp42;
int ifound;
int temp32;
int aux01;
int j;
int aux02;
boolean temp37;
int temp27;
int temp38;
boolean temp28;
boolean temp39;
int temp29;
boolean ls01;
temp27 = 1;
j = temp27;
temp28 = false;
ls01 = temp28;
temp29 = 0;
ifound = temp29;
temp30 = j < size;
while(temp30){
temp31 = number[j];
aux01 = temp31;
temp32 = 1;
temp33 = num + temp32;
aux02 = temp33;
temp34 = aux01 < num;
if(temp34){
temp35 = 0;
nt = temp35;
}
else{
temp36 = aux01 < aux02;
temp37= !temp36;
if(temp37){
temp38 = 0;
nt = temp38;
}
else{
temp39 = true;
ls01 = temp39;
temp40 = 1;
ifound = temp40;
j = size;
}
}
temp41 = 1;
temp42 = j + temp41;
j = temp42;
temp30 = j < size;
}


return ifound;
}
public int Init (int sz ){
int temp44;
int temp55;
int temp45;
int temp56;
int temp46;
int temp57;
boolean temp47;
int temp51;
int temp52;
int temp53;
int[] temp43;
int temp54;
int aux01;
int j;
int k;
int aux02;
int temp48;
int temp49;
int temp50;
size = sz;
temp43= new int[sz];
number = temp43;
temp44 = 1;
j = temp44;
temp45 = 1;
temp46 = size + temp45;
k = temp46;
temp47 = j < size;
while(temp47){
temp48 = 2;
temp49 = temp48 * j;
aux01 = temp49;
temp50 = 3;
temp51 = k - temp50;
aux02 = temp51;
temp52 = aux01 + aux02;
number[j] = temp52;
temp53 = 1;
temp54 = j + temp53;
j = temp54;
temp55 = 1;
temp56 = k - temp55;
k = temp56;
temp47 = j < size;
}

temp57 = 0;

return temp57;
}
}
