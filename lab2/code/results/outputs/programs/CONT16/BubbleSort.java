class BubbleSort {
public static void main(String[] a){
int temp2;
BBS temp0;
int temp1;
temp0 = new BBS();
temp1 = 10;
temp2 = temp0.Start(temp1);
System.out.println(temp2);

}
}
class BBS {
int[] number;
int size;
public int Start (int sz ){
int temp6;
int temp11;
int temp7;
int temp12;
int temp4;
BBS temp5;
BBS temp8;
int temp9;
BBS temp10;
int aux01;
BBS temp3;
temp3 = this;
temp4 = temp3.Init(sz);
aux01 = temp4;
temp5 = this;
temp6 = temp5.Print();
aux01 = temp6;
temp7 = 99999;
System.out.println(temp7);
temp8 = this;
temp9 = temp8.Sort();
aux01 = temp9;
temp10 = this;
temp11 = temp10.Print();
aux01 = temp11;

temp12 = 0;

return temp12;
}
public int Sort ( ){
int temp33;
int temp34;
int temp13;
int temp35;
int temp14;
int temp36;
int aux05;
int aux04;
int temp30;
int nt;
int aux07;
int temp31;
int aux06;
int temp32;
int temp19;
int aux02;
int temp15;
int temp37;
int temp16;
int temp17;
boolean temp18;
boolean temp22;
int temp23;
int temp24;
int temp25;
int temp20;
int temp21;
int i;
int j;
int temp26;
boolean temp27;
int temp28;
int temp29;
int t;
temp13 = 1;
temp14 = size - temp13;
i = temp14;
temp15 = 0;
temp16 = 1;
temp17 = temp15 - temp16;
aux02 = temp17;
temp18 = aux02 < i;
while(temp18){
temp19 = 1;
j = temp19;
temp20 = 1;
temp21 = i + temp20;
temp22 = j < temp21;
while(temp22){
temp23 = 1;
temp24 = j - temp23;
aux07 = temp24;
temp25 = number[aux07];
aux04 = temp25;
temp26 = number[j];
aux05 = temp26;
temp27 = aux05 < aux04;
if(temp27){
temp28 = 1;
temp29 = j - temp28;
aux06 = temp29;
temp30 = number[aux06];
t = temp30;
temp31 = number[j];
number[aux06] = temp31;
number[j] = t;
}
else{
temp32 = 0;
nt = temp32;
}
temp33 = 1;
temp34 = j + temp33;
j = temp34;
temp20 = 1;
temp21 = i + temp20;
temp22 = j < temp21;
}
temp35 = 1;
temp36 = i - temp35;
i = temp36;
temp18 = aux02 < i;
}

temp37 = 0;

return temp37;
}
public int Print ( ){
int temp40;
int temp41;
int temp42;
int temp43;
int j;
int temp38;
boolean temp39;
temp38 = 0;
j = temp38;
temp39 = j < size;
while(temp39){
temp40 = number[j];
System.out.println(temp40);
temp41 = 1;
temp42 = j + temp41;
j = temp42;
temp39 = j < size;
}

temp43 = 0;

return temp43;
}
public int Init (int sz ){
int[] temp44;
int temp55;
int temp45;
int temp56;
int temp46;
int temp57;
int temp47;
int temp58;
int temp51;
int temp62;
int temp52;
int temp63;
int temp53;
int temp64;
int temp54;
int temp65;
int temp48;
int temp59;
int temp49;
int temp60;
int temp50;
int temp61;
size = sz;
temp44= new int[sz];
number = temp44;
temp45 = 0;
temp46 = 20;
number[temp45] = temp46;
temp47 = 1;
temp48 = 7;
number[temp47] = temp48;
temp49 = 2;
temp50 = 12;
number[temp49] = temp50;
temp51 = 3;
temp52 = 18;
number[temp51] = temp52;
temp53 = 4;
temp54 = 2;
number[temp53] = temp54;
temp55 = 5;
temp56 = 11;
number[temp55] = temp56;
temp57 = 6;
temp58 = 6;
number[temp57] = temp58;
temp59 = 7;
temp60 = 9;
number[temp59] = temp60;
temp61 = 8;
temp62 = 19;
number[temp61] = temp62;
temp63 = 9;
temp64 = 5;
number[temp63] = temp64;

temp65 = 0;

return temp65;
}
}
