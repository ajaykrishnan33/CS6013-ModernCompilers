class Collatz {
public static void main(String[] a){
int temp2;
ColNum temp0;
int temp1;
temp0 = new ColNum();
temp1 = 34;
temp2 = temp0.Start(temp1);
System.out.println(temp2);

}
}
class ColNum {
int number;
public int Start (int num ){
boolean temp6;
int temp7;
int temp4;
int temp5;
ColNum temp8;
int temp9;
int aux01;
int aux02;
ColNum temp3;
number = num;
temp3 = this;
temp4 = temp3.Next(number);
aux02 = temp4;
System.out.println(aux02);
temp5 = 2;
temp6 = aux02 < temp5;
if(temp6){
temp7 = 0;
aux02 = temp7;
}
else{
temp8 = this;
temp9 = temp8.Start(aux02);
aux02 = temp9;
}


return aux02;
}
public int Next (int num ){
int temp11;
int temp22;
int temp12;
int temp23;
int temp13;
boolean temp14;
int count02;
int temp20;
int count01;
int temp10;
int temp21;
boolean temp19;
int aux03;
int temp15;
int temp16;
int temp17;
int temp18;
temp10 = 0;
count01 = temp10;
temp11 = 0;
count02 = temp11;
temp12 = 1;
temp13 = num - temp12;
aux03 = temp13;
temp14 = count02 < aux03;
while(temp14){
temp15 = 1;
temp16 = count01 + temp15;
count01 = temp16;
temp17 = 2;
temp18 = count02 + temp17;
count02 = temp18;
temp14 = count02 < aux03;
}
temp19 = count02 < num;
if(temp19){
temp20 = 3;
temp21 = num * temp20;
aux03 = temp21;
temp22 = 1;
temp23 = aux03 + temp22;
aux03 = temp23;
}
else{
aux03 = count01;
}


return aux03;
}
}
