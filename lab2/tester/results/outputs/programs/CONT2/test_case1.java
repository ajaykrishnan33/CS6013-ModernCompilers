class test_case1 {
public static void main(String[] args){
int temp2;
int temp3;
Class1 temp0;
int temp1;
temp0 = new Class1();
temp1 = 22;
temp2 = 18;
temp3 = temp0.method3(temp1,temp2 );
System.out.println(temp3);

}
}
class Class1 {
public int method1 (int a, int b, int c, int d ){
boolean temp11;
boolean temp12;
boolean temp13;
int temp14;
boolean temp10;
int ret_val;
int temp15;
Class1 temp16;
int temp17;
boolean temp6;
boolean temp7;
boolean temp4;
boolean temp5;
boolean temp8;
boolean temp9;
temp4 = a < b;
temp5= !temp4;
temp6 = b < a;
temp7= !temp6;
temp8 = temp5 & temp7;
temp9= !temp8;
temp10 = c < d;
temp11= !temp10;
temp12 = temp9 & temp11;
temp13= !temp12;
if(temp13){
temp14 = d - c;
temp15 = a + temp14;
ret_val = temp15;
}
else{
temp16 = this;
temp17 = temp16.method2(b,d ,c );
ret_val = temp17;
}


return ret_val;
}
public int method2 (int b, int c, int d ){
int ret_val2;
int temp22;
int temp23;
int temp24;
int temp25;
Class1 temp20;
int temp21;
boolean temp19;
boolean temp18;
temp18 = c < b;
temp19= !temp18;
if(temp19){
temp20 = this;
temp21 = c - b;
temp22 = b + c;
temp23 = temp20.method1(temp21,temp22 ,d ,c );
ret_val2 = temp23;
}
else{
temp24 = b - d;
temp25 = temp24 + c;
ret_val2 = temp25;
}


return ret_val2;
}
public int method3 (int c, int d ){
int temp77;
int temp78;
int temp79;
int temp122;
int temp121;
int temp73;
int temp120;
int temp74;
boolean temp75;
Class1 temp76;
Class1 temp70;
int temp71;
int temp119;
int temp72;
int temp118;
int temp117;
int temp116;
int temp115;
int temp114;
Class1 temp66;
int temp67;
int temp68;
int temp69;
int temp62;
int temp63;
boolean temp64;
int start_i;
boolean temp65;
int temp60;
int temp61;
int temp99;
int temp102;
int temp101;
int temp100;
int temp95;
int temp96;
int temp97;
int temp98;
int temp91;
boolean temp92;
int temp93;
int temp94;
int temp90;
int temp88;
int temp113;
int[] a;
int temp89;
int temp112;
int temp111;
int temp110;
int temp84;
int temp85;
int temp86;
int temp87;
int i;
int temp80;
boolean temp81;
boolean temp109;
int temp82;
boolean temp108;
int temp83;
boolean temp107;
int temp106;
int temp105;
int temp104;
boolean temp103;
boolean temp33;
boolean temp34;
Class1 temp35;
int temp36;
int temp30;
int temp31;
int temp32;
int temp37;
int temp38;
boolean temp39;
int temp26;
int[] temp27;
int temp28;
Class1 temp29;
int temp55;
int temp56;
boolean temp57;
boolean temp58;
int temp51;
Class1 temp52;
int temp53;
int temp54;
Class1 temp59;
int temp50;
Class1 temp44;
int temp45;
int temp46;
int temp47;
boolean temp40;
Class1 temp41;
int temp42;
int temp43;
boolean temp48;
Class1 temp49;
temp26 = c + d;
temp27= new int[temp26];
a = temp27;
temp28 = 0;
i = temp28;
temp29 = this;
temp30 = 0;
temp31 = temp29.method2(temp30,c ,d );
temp32 = 0;
temp33 = temp31 < temp32;
temp34= !temp33;
temp35 = this;
temp36 = 0;
temp37 = temp35.method2(temp36,c ,d );
temp38 = c + d;
temp39 = temp37 < temp38;
temp40 = temp34 & temp39;
if(temp40){
temp41 = this;
temp42 = 0;
temp43 = temp41.method2(temp42,c ,d );
start_i = temp43;
}
else{
temp44 = this;
temp45 = 0;
temp46 = temp44.method2(temp45,c ,d );
temp47 = c + d;
temp48 = temp46 < temp47;
if(temp48){
temp49 = this;
temp50 = 0;
temp51 = temp49.method2(temp50,c ,d );
start_i = temp51;
}
else{
temp52 = this;
temp53 = 1;
temp54 = 0;
temp55 = temp52.method1(temp53,c ,temp54 ,d );
temp56 = 0;
temp57 = temp55 < temp56;
temp58= !temp57;
temp59 = this;
temp60 = 1;
temp61 = 0;
temp62 = temp59.method1(temp60,c ,temp61 ,d );
temp63 = c + d;
temp64 = temp62 < temp63;
temp65 = temp58 & temp64;
if(temp65){
temp66 = this;
temp67 = 1;
temp68 = 0;
temp69 = temp66.method1(temp67,c ,temp68 ,d );
start_i = temp69;
}
else{
temp70 = this;
temp71 = 1;
temp72 = 0;
temp73 = temp70.method1(temp71,c ,temp72 ,d );
temp74 = c + d;
temp75 = temp73 < temp74;
if(temp75){
temp76 = this;
temp77 = 1;
temp78 = 0;
temp79 = temp76.method1(temp77,c ,temp78 ,d );
start_i = temp79;
}
else{
temp80 = 0;
start_i = temp80;
}
}
}
}
temp81 = i < start_i;
while(temp81){
temp82 = 1;
temp83 = i + temp82;
temp84 = 1;
temp85 = start_i + temp84;
temp86 = temp83 * temp85;
a[i] = temp86;
temp87 = 1;
temp88 = i + temp87;
i = temp88;
temp81 = i < start_i;
}
temp89 = 1;
temp90 = start_i + temp89;
i = temp90;
temp91 = c + d;
temp92 = i < temp91;
while(temp92){
temp95 = c + d;
temp96 = 2;
temp97 = c * temp96;
temp98 = temp95 - temp97;
temp99 = i * temp98;
temp100 = start_i + temp99;
a[i] = temp100;
temp101 = a[i];
temp102 = 0;
temp103 = temp101 < temp102;
temp104 = c + d;
temp105 = 2;
temp106 = temp105 * i;
temp107 = temp104 < temp106;
temp108= !temp107;
temp109 = temp103 & temp108;
if(temp109){
temp110 = a[i];
System.out.println(temp110);
}
else{
temp111 = c + d;
temp112 = 2;
temp113 = temp112 * i;
temp114 = temp111 - temp113;
System.out.println(temp114);
}
temp93 = 1;
temp94 = i + temp93;
i = temp94;
temp91 = c + d;
temp92 = i < temp91;
}

temp115 = c + d;
temp116 = 1;
temp117 = temp115 - temp116;
temp118 = a[temp117];
temp119 = c + d;
temp120 = 1;
temp121 = temp119 - temp120;
temp122 = temp118 + temp121;

return temp122;
}
}
