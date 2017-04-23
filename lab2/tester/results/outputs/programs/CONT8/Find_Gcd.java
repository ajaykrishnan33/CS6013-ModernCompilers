class Find_Gcd {
public static void main(String[] a){
int temp2;
int temp3;
Gcd temp0;
int temp1;
temp0 = new Gcd();
temp1 = 10;
temp2 = 15;
temp3 = temp0.findgcd(temp1,temp2 );
System.out.println(temp3);

}
}
class Gcd {
public int findgcd (int n1, int n2 ){
boolean temp6;
int temp7;
Gcd temp4;
boolean temp5;
int temp8;
temp4 = this;
temp5 = temp4.Compare(n1,n2 );
while(temp5){
temp6 = n2 < n1;
if(temp6){
temp7 = n1 - n2;
n1 = temp7;
}
else{
temp8 = n2 - n1;
n2 = temp8;
}
temp4 = this;
temp5 = temp4.Compare(n1,n2 );
}


return n1;
}
public boolean Compare (int num1, int num2 ){
int temp11;
boolean temp12;
boolean temp13;
boolean temp14;
boolean temp9;
int temp10;
int aux02;
boolean temp15;
boolean temp16;
boolean retval;
boolean temp17;
temp9 = false;
retval = temp9;
temp10 = 1;
temp11 = num2 + temp10;
aux02 = temp11;
temp12 = num1 < num2;
if(temp12){
temp13 = false;
retval = temp13;
}
else{
temp14 = num1 < aux02;
temp15= !temp14;
if(temp15){
temp16 = false;
retval = temp16;
}
else{
temp17 = true;
retval = temp17;
}
}


return retval;
}
}
