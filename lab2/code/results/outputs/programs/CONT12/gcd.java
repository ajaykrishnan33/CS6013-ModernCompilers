class gcd {
public static void main(String[] a){
int temp2;
int temp3;
SGCD temp0;
int temp1;
temp0 = new SGCD();
temp1 = 15;
temp2 = 5;
temp3 = temp0.start(temp1,temp2 );
System.out.println(temp3);

}
}
class SGCD {
public int start (int n, int m ){
boolean temp6;
boolean temp7;
SGCD temp4;
boolean temp5;
int temp8;
int temp9;
temp4 = this;
temp5 = temp4.compare(n,m );
temp6= !temp5;
while(temp6){
temp7 = n < m;
if(temp7){
temp8 = m - n;
m = temp8;
}
else{
temp9 = n - m;
n = temp9;
}
temp4 = this;
temp5 = temp4.compare(n,m );
temp6= !temp5;
}


return n;
}
public boolean compare (int n, int m ){
int temp11;
int temp12;
boolean temp13;
boolean temp14;
boolean temp10;
int aux02;
boolean temp15;
boolean value;
boolean temp16;
boolean temp17;
boolean temp18;
temp10 = false;
value = temp10;
temp11 = 1;
temp12 = m + temp11;
aux02 = temp12;
temp13 = n < m;
if(temp13){
temp14 = false;
value = temp14;
}
else{
temp15 = n < aux02;
temp16= !temp15;
if(temp16){
temp17 = false;
value = temp17;
}
else{
temp18 = true;
value = temp18;
}
}


return value;
}
}
