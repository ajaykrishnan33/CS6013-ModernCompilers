class CutIntoSquares {
public static void main(String[] args){
int temp2;
int temp3;
Rec temp0;
int temp1;
temp0 = new Rec();
temp1 = 16;
temp2 = 50;
temp3 = temp0.cut(temp1,temp2 );
System.out.println(temp3);

}
}
class Rec {
public int cut (int a, int b ){
int temp11;
int temp12;
boolean temp13;
boolean temp14;
int temp20;
int temp10;
int temp21;
int temp19;
Rec temp15;
int ret_res;
int temp16;
int temp17;
int temp1;
Rec temp18;
boolean temp6;
int temp7;
int temp4;
boolean temp5;
int temp8;
int temp9;
temp4 = 0;
ret_res = temp4;
temp5 = a < b;
temp6= !temp5;
if(temp6){
temp7 = a + b;
a = temp7;
temp8 = a - b;
b = temp8;
temp9 = a - b;
a = temp9;
}
else{
System.out.println(a);
System.out.println(b);
}
temp10 = 1;
temp11 = a - temp10;
temp12 = 0;
temp13 = temp11 < temp12;
temp14= !temp13;
while(temp14){
temp15 = this;
temp16 = temp15.divide(b,a );
temp17 = ret_res + temp16;
ret_res = temp17;
temp18 = this;
temp19 = temp18.divide(b,a );
temp20 = a * temp19;
temp21 = b - temp20;
temp1 = temp21;
b = a;
a = temp1;
temp10 = 1;
temp11 = a - temp10;
temp12 = 0;
temp13 = temp11 < temp12;
temp14= !temp13;
}


return ret_res;
}
public int divide (int num, int denom ){
boolean temp33;
boolean temp34;
int temp35;
boolean temp36;
boolean temp30;
int temp31;
int temp32;
int quo;
boolean temp37;
boolean temp38;
int temp39;
int rem;
int temp22;
boolean temp44;
int temp23;
boolean temp45;
int temp24;
int temp46;
boolean temp25;
int temp47;
int temp40;
int temp41;
int temp42;
int temp43;
boolean temp26;
int temp48;
int temp27;
boolean temp28;
boolean temp29;
temp22 = 0;
quo = temp22;
temp23 = 0;
rem = temp23;
temp24 = 0;
temp25 = num < temp24;
temp26= !temp25;
temp27 = 0;
temp28 = temp27 < num;
temp29= !temp28;
temp30 = temp26 & temp29;
if(temp30){
temp31 = 0;
quo = temp31;
}
else{
temp32 = 0;
temp33 = denom < temp32;
temp34= !temp33;
temp35 = 0;
temp36 = temp35 < denom;
temp37= !temp36;
temp38 = temp34 & temp37;
if(temp38){
temp39 = 0;
temp40 = 1;
temp41 = temp39 - temp40;
quo = temp41;
}
else{
temp42 = num - denom;
rem = temp42;
temp43 = 0;
temp44 = rem < temp43;
temp45= !temp44;
while(temp45){
temp46 = 1;
temp47 = quo + temp46;
quo = temp47;
temp48 = rem - denom;
rem = temp48;
temp43 = 0;
temp44 = rem < temp43;
temp45= !temp44;
}
}
}


return quo;
}
}
