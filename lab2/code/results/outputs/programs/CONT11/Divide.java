class Divide {
public static void main(String[] args){
int temp2;
int temp3;
Div temp0;
int temp1;
temp0 = new Div();
temp1 = 31;
temp2 = 3;
temp3 = temp0.check(temp1,temp2 );
System.out.println(temp3);

}
}
class Div {
public int check (int number1, int number2 ){
int ret;
boolean temp6;
int temp11;
int temp7;
int temp;
boolean temp4;
int temp5;
boolean ch;
Div temp8;
boolean temp9;
int temp10;
temp4 = number1 < number2;
if(temp4){
temp5 = 0;
ret = temp5;
}
else{
temp = number2;
temp6 = temp < number1;
while(temp6){
temp7 = temp + number2;
temp = temp7;
temp6 = temp < number1;
}
temp8 = this;
temp9 = temp8.Compare(temp,number1 );
ch = temp9;
if(ch){
temp10 = 1;
ret = temp10;
}
else{
temp11 = 0;
ret = temp11;
}
}


return ret;
}
public boolean Compare (int num1, int num2 ){
boolean temp12;
int temp13;
int temp14;
boolean temp20;
boolean temp19;
int aux02;
boolean temp15;
boolean temp16;
boolean retval;
boolean temp17;
boolean temp18;
temp12 = false;
retval = temp12;
temp13 = 1;
temp14 = num2 + temp13;
aux02 = temp14;
temp15 = num1 < num2;
if(temp15){
temp16 = false;
retval = temp16;
}
else{
temp17 = num1 < aux02;
temp18= !temp17;
if(temp18){
temp19 = false;
retval = temp19;
}
else{
temp20 = true;
retval = temp20;
}
}


return retval;
}
}
