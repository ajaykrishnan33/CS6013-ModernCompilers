class QuickSort {
public static void main(String[] a){
int temp2;
QS temp0;
int temp1;
temp0 = new QS();
temp1 = 10;
temp2 = temp0.Start(temp1);
System.out.println(temp2);

}
}
class QS {
int[] number;
int size;
public int Start (int sz ){
int temp11;
int temp12;
QS temp13;
int temp14;
QS temp10;
int aux01;
int temp15;
QS temp3;
int temp6;
int temp7;
int temp4;
QS temp5;
int temp8;
int temp9;
temp3 = this;
temp4 = temp3.Init(sz);
aux01 = temp4;
temp5 = this;
temp6 = temp5.Print();
aux01 = temp6;
temp7 = 9999;
System.out.println(temp7);
temp8 = 1;
temp9 = size - temp8;
aux01 = temp9;
temp10 = this;
temp11 = 0;
temp12 = temp10.Sort(temp11,aux01 );
aux01 = temp12;
temp13 = this;
temp14 = temp13.Print();
aux01 = temp14;

temp15 = 0;

return temp15;
}
public int Sort (int left, int right ){
int temp33;
boolean temp34;
boolean temp35;
boolean temp36;
boolean temp30;
int temp31;
int temp32;
boolean cont02;
boolean cont01;
boolean temp37;
int temp38;
int temp39;
boolean temp22;
int temp23;
int temp24;
int temp25;
int temp20;
boolean temp21;
boolean temp26;
boolean temp27;
boolean temp28;
boolean temp29;
int temp55;
int temp56;
QS temp51;
int temp52;
int nt;
int temp53;
int temp54;
int temp19;
int aux03;
int temp16;
boolean temp17;
int temp18;
int temp50;
boolean temp44;
int temp45;
int temp46;
QS temp47;
int temp40;
int temp41;
boolean temp42;
boolean temp43;
int i;
int j;
int temp48;
int temp49;
int t;
int v;
temp16 = 0;
t = temp16;
temp17 = left < right;
if(temp17){
temp18 = number[right];
v = temp18;
temp19 = 1;
temp20 = left - temp19;
i = temp20;
j = right;
temp21 = true;
cont01 = temp21;
while(cont01){
temp22 = true;
cont02 = temp22;
while(cont02){
temp23 = 1;
temp24 = i + temp23;
i = temp24;
temp25 = number[i];
aux03 = temp25;
temp26 = aux03 < v;
temp27= !temp26;
if(temp27){
temp28 = false;
cont02 = temp28;
}
else{
temp29 = true;
cont02 = temp29;
}
}
temp30 = true;
cont02 = temp30;
while(cont02){
temp31 = 1;
temp32 = j - temp31;
j = temp32;
temp33 = number[j];
aux03 = temp33;
temp34 = v < aux03;
temp35= !temp34;
if(temp35){
temp36 = false;
cont02 = temp36;
}
else{
temp37 = true;
cont02 = temp37;
}
}
temp38 = number[i];
t = temp38;
temp39 = number[j];
number[i] = temp39;
number[j] = t;
temp40 = 1;
temp41 = i + temp40;
temp42 = j < temp41;
if(temp42){
temp43 = false;
cont01 = temp43;
}
else{
temp44 = true;
cont01 = temp44;
}
}
temp45 = number[i];
number[j] = temp45;
temp46 = number[right];
number[i] = temp46;
number[right] = t;
temp47 = this;
temp48 = 1;
temp49 = i - temp48;
temp50 = temp47.Sort(left,temp49 );
nt = temp50;
temp51 = this;
temp52 = 1;
temp53 = i + temp52;
temp54 = temp51.Sort(temp53,right );
nt = temp54;
}
else{
temp55 = 0;
nt = temp55;
}

temp56 = 0;

return temp56;
}
public int Print ( ){
int temp57;
boolean temp58;
int temp62;
int j;
int temp60;
int temp61;
int temp59;
temp57 = 0;
j = temp57;
temp58 = j < size;
while(temp58){
temp59 = number[j];
System.out.println(temp59);
temp60 = 1;
temp61 = j + temp60;
j = temp61;
temp58 = j < size;
}

temp62 = 0;

return temp62;
}
public int Init (int sz ){
int temp66;
int temp77;
int temp67;
int temp78;
int temp68;
int temp79;
int temp69;
int temp73;
int temp84;
int[] temp63;
int temp74;
int temp64;
int temp75;
int temp65;
int temp76;
int temp80;
int temp70;
int temp81;
int temp71;
int temp82;
int temp72;
int temp83;
size = sz;
temp63= new int[sz];
number = temp63;
temp64 = 0;
temp65 = 20;
number[temp64] = temp65;
temp66 = 1;
temp67 = 7;
number[temp66] = temp67;
temp68 = 2;
temp69 = 12;
number[temp68] = temp69;
temp70 = 3;
temp71 = 18;
number[temp70] = temp71;
temp72 = 4;
temp73 = 2;
number[temp72] = temp73;
temp74 = 5;
temp75 = 11;
number[temp74] = temp75;
temp76 = 6;
temp77 = 6;
number[temp76] = temp77;
temp78 = 7;
temp79 = 9;
number[temp78] = temp79;
temp80 = 8;
temp81 = 19;
number[temp80] = temp81;
temp82 = 9;
temp83 = 5;
number[temp82] = temp83;

temp84 = 0;

return temp84;
}
}
