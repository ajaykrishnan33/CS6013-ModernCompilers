class Divide {
public static void main(String[] a){
int temp2;
int temp3;
D temp0;
int temp1;
temp0 = new D();
temp1 = 10;
temp2 = 3;
temp3 = temp0.div(temp1,temp2 );
System.out.println(temp3);

}
}
class D {
int ans;
public int div (int num, int divisor ){
int temp11;
int temp12;
boolean temp13;
boolean temp14;
int temp20;
D temp10;
int temp21;
int temp19;
int temp15;
D temp16;
int temp17;
int temp18;
boolean temp6;
boolean temp7;
D temp4;
int s;
int temp5;
boolean temp8;
int temp9;
temp4 = this;
temp5 = 0;
temp6 = temp4.equals(divisor,temp5 );
temp7= !temp6;
if(temp7){
temp8 = num < divisor;
if(temp8){
temp9 = 0;
ans = temp9;
}
else{
temp10 = this;
temp11 = num - divisor;
temp12 = 0;
temp13 = temp10.equals(temp11,temp12 );
temp14= !temp13;
if(temp14){
temp15 = 1;
temp16 = this;
temp17 = num - divisor;
temp18 = temp16.div(temp17,divisor );
temp19 = temp15 + temp18;
ans = temp19;
}
else{
temp20 = 1;
ans = temp20;
}
}
}
else{
temp21 = 0;
ans = temp21;
}


return ans;
}
public boolean equals (int x, int y ){
boolean temp22;
int temp23;
int temp24;
boolean temp25;
int t;
boolean temp30;
boolean yes;
boolean temp26;
boolean temp27;
boolean temp28;
boolean temp29;
temp22 = false;
yes = temp22;
temp23 = 1;
temp24 = y + temp23;
t = temp24;
temp25 = x < y;
if(temp25){
temp26 = false;
yes = temp26;
}
else{
temp27 = x < t;
temp28= !temp27;
if(temp28){
temp29 = false;
yes = temp29;
}
else{
temp30 = true;
yes = temp30;
}
}


return yes;
}
}
