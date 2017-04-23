class Modulo {
public static void main(String[] a){
int temp2;
int temp3;
Mod temp0;
int temp1;
temp0 = new Mod();
temp1 = 32;
temp2 = 3;
temp3 = temp0.find(temp1,temp2 );
System.out.println(temp3);

}
}
class Mod {
public int find (int num1, int num2 ){
int ret;
int temp6;
int temp7;
int temp;
boolean temp4;
boolean flag;
int temp5;
Mod temp8;
boolean temp9;
int temp10;
int rem;
temp = num2;
temp4 = temp < num1;
while(temp4){
temp5 = temp + num2;
temp = temp5;
temp4 = temp < num1;
}
temp6 = temp - num2;
rem = temp6;
temp7 = num1 - rem;
rem = temp7;
temp8 = this;
temp9 = temp8.compare(rem,num2 );
flag = temp9;
if(flag){
temp10 = 0;
ret = temp10;
}
else{
ret = rem;
}


return ret;
}
public boolean compare (int num1, int num2 ){
boolean temp11;
int temp12;
int temp13;
boolean temp14;
boolean temp19;
int aux02;
boolean temp15;
boolean temp16;
boolean retval;
boolean temp17;
boolean temp18;
temp11 = false;
retval = temp11;
temp12 = 1;
temp13 = num2 + temp12;
aux02 = temp13;
temp14 = num1 < num2;
if(temp14){
temp15 = false;
retval = temp15;
}
else{
temp16 = num1 < aux02;
temp17= !temp16;
if(temp17){
temp18 = false;
retval = temp18;
}
else{
temp19 = true;
retval = temp19;
}
}


return retval;
}
}
