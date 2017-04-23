class Palindrome {
public static void main(String[] args){
int temp2;
Palin temp0;
int temp1;
temp0 = new Palin();
temp1 = 1210;
temp2 = temp0.check(temp1);
System.out.println(temp2);

}
}
class Palin {
public int check (int num ){
int temp11;
int temp12;
int temp13;
int temp14;
int temp30;
int temp10;
int temp19;
int temp2;
int temp15;
int temp3;
int temp16;
boolean temp17;
int temp1;
int temp18;
int rem;
int ret;
int temp22;
int temp23;
int temp;
int rev;
int temp24;
int temp25;
boolean ch;
int temp20;
int temp21;
int temp26;
Palin temp27;
boolean temp28;
int temp29;
boolean temp6;
int temp7;
int temp4;
boolean temp5;
boolean temp8;
boolean temp9;
temp = num;
temp3 = 0;
rev = temp3;
temp4 = 10;
temp5 = temp < temp4;
temp6= !temp5;
while(temp6){
temp1 = temp;
temp7 = 10;
temp8 = temp1 < temp7;
temp9= !temp8;
while(temp9){
temp10 = 10;
temp11 = temp1 - temp10;
temp1 = temp11;
temp7 = 10;
temp8 = temp1 < temp7;
temp9= !temp8;
}
temp12 = 10;
temp13 = rev * temp12;
rev = temp13;
temp14 = rev + temp1;
rev = temp14;
temp15 = 0;
rem = temp15;
temp16 = 0;
temp1 = temp16;
temp2 = temp;
temp17 = temp1 < temp2;
while(temp17){
temp18 = 1;
temp19 = rem + temp18;
rem = temp19;
temp20 = 10;
temp21 = temp1 + temp20;
temp1 = temp21;
temp17 = temp1 < temp2;
}
temp22 = 1;
temp23 = rem - temp22;
temp = temp23;
temp4 = 10;
temp5 = temp < temp4;
temp6= !temp5;
}
temp24 = 10;
temp25 = rev * temp24;
rev = temp25;
temp26 = rev + temp;
rev = temp26;
temp27 = this;
temp28 = temp27.Compare(rev,num );
ch = temp28;
if(ch){
temp29 = 1;
ret = temp29;
}
else{
temp30 = 0;
ret = temp30;
}


return ret;
}
public boolean Compare (int num1, int num2 ){
int temp33;
boolean temp34;
boolean temp35;
boolean temp36;
boolean temp31;
int temp32;
int aux02;
boolean temp37;
boolean temp38;
boolean retval;
boolean temp39;
temp31 = false;
retval = temp31;
temp32 = 1;
temp33 = num2 + temp32;
aux02 = temp33;
temp34 = num1 < num2;
if(temp34){
temp35 = false;
retval = temp35;
}
else{
temp36 = num1 < aux02;
temp37= !temp36;
if(temp37){
temp38 = false;
retval = temp38;
}
else{
temp39 = true;
retval = temp39;
}
}


return retval;
}
}
