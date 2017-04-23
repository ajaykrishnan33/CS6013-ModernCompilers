class Inversion_Naive {
public static void main(String[] args){
InMat temp0;
int temp1;
temp0 = new InMat();
temp1 = temp0.calculate();
System.out.println(temp1);

}
}
class InMat {
int[] arr;
public int calculate ( ){
int temp11;
int temp33;
int temp12;
int temp34;
int temp13;
int temp35;
int temp14;
boolean temp36;
boolean temp30;
int temp31;
InMat temp10;
int temp32;
int temp19;
int temp2;
int temp15;
int temp37;
int temp3;
int temp16;
int temp38;
int temp17;
int temp39;
InMat temp18;
int temp22;
int temp23;
boolean temp24;
int temp25;
int temp40;
boolean temp41;
int temp20;
int temp42;
int temp21;
int temp43;
int i;
int j;
int temp26;
int ret_res;
int temp27;
int temp28;
int temp29;
int temp6;
boolean temp7;
int[] temp4;
int temp5;
int temp8;
int temp9;
temp2 = 0;
ret_res = temp2;
temp3 = 15;
temp4= new int[temp3];
arr = temp4;
temp5 = 0;
i = temp5;
temp6 = arr.length;
temp7 = i < temp6;
while(temp7){
temp10 = this;
temp11 = 2;
temp12 = temp10.divide(i,temp11 );
temp13 = 3;
temp14 = temp12 * temp13;
temp15 = temp14 - i;
temp16 = 1;
temp17 = temp15 + temp16;
temp18 = this;
temp19 = arr.length;
temp20 = temp18.divide(temp19,i );
temp21 = temp17 - temp20;
arr[i] = temp21;
temp8 = 1;
temp9 = i + temp8;
i = temp9;
temp6 = arr.length;
temp7 = i < temp6;
}
temp22 = 0;
i = temp22;
temp23 = arr.length;
temp24 = i < temp23;
while(temp24){
temp27 = arr[i];
System.out.println(temp27);
temp25 = 1;
temp26 = i + temp25;
i = temp26;
temp23 = arr.length;
temp24 = i < temp23;
}
temp28 = 0;
i = temp28;
temp29 = arr.length;
temp30 = i < temp29;
while(temp30){
temp33 = 1;
temp34 = i + temp33;
j = temp34;
temp35 = arr.length;
temp36 = j < temp35;
while(temp36){
temp39 = arr[j];
temp40 = arr[i];
temp41 = temp39 < temp40;
if(temp41){
temp42 = 1;
temp43 = ret_res + temp42;
ret_res = temp43;
}
else{
ret_res = ret_res;
}
temp37 = 1;
temp38 = j + temp37;
j = temp38;
temp35 = arr.length;
temp36 = j < temp35;
}
temp31 = 1;
temp32 = i + temp31;
i = temp32;
temp29 = arr.length;
temp30 = i < temp29;
}


return ret_res;
}
public int divide (int num, int denom ){
boolean temp55;
boolean temp56;
int temp57;
boolean temp58;
boolean temp51;
boolean temp52;
int temp53;
int temp54;
int quo;
boolean temp59;
int temp70;
int rem;
boolean temp50;
int temp44;
boolean temp66;
int temp45;
boolean temp67;
int temp46;
int temp68;
boolean temp47;
int temp69;
int temp62;
int temp63;
int temp64;
int temp65;
boolean temp48;
int temp49;
boolean temp60;
int temp61;
temp44 = 0;
quo = temp44;
temp45 = 0;
rem = temp45;
temp46 = 0;
temp47 = num < temp46;
temp48= !temp47;
temp49 = 0;
temp50 = temp49 < num;
temp51= !temp50;
temp52 = temp48 & temp51;
if(temp52){
temp53 = 0;
quo = temp53;
}
else{
temp54 = 0;
temp55 = denom < temp54;
temp56= !temp55;
temp57 = 0;
temp58 = temp57 < denom;
temp59= !temp58;
temp60 = temp56 & temp59;
if(temp60){
temp61 = 0;
temp62 = 1;
temp63 = temp61 - temp62;
quo = temp63;
}
else{
temp64 = num - denom;
rem = temp64;
temp65 = 0;
temp66 = rem < temp65;
temp67= !temp66;
while(temp67){
temp68 = 1;
temp69 = quo + temp68;
quo = temp69;
temp70 = rem - denom;
rem = temp70;
temp65 = 0;
temp66 = rem < temp65;
temp67= !temp66;
}
}
}


return quo;
}
}
