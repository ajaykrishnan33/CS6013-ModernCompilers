class Prim {
public static void main(String[] a){
int temp2;
Port temp0;
int temp1;
temp0 = new Port();
temp1 = 10;
temp2 = temp0.add(temp1);
System.out.println(temp2);

}
}
class Port {
public int add (int num ){
int temp6;
int temp7;
int n0;
int temp4;
boolean temp5;
Port temp8;
int temp9;
int temp10;
int x;
int sum;
int temp3;
temp3 = 0;
sum = temp3;
temp4 = 0;
x = temp4;
temp5 = x < num;
while(temp5){
temp8 = this;
temp9 = temp8.getSquare(x);
n0 = temp9;
temp10 = sum + n0;
sum = temp10;
temp6 = 1;
temp7 = x + temp6;
x = temp7;
temp5 = x < num;
}


return sum;
}
public int getSquare (int q ){
boolean temp11;
int temp12;
boolean temp13;
int temp14;
int t;
boolean yes;
int temp20;
int temp19;
int temp15;
int temp16;
int temp17;
boolean temp18;
temp11 = true;
yes = temp11;
temp12 = 1;
t = temp12;
while(yes){
temp13 = t < q;
if(temp13){
temp14 = 1;
temp15 = t + temp14;
t = temp15;
}
else{
temp16 = 1;
temp17 = t + temp16;
t = temp17;
temp18 = false;
yes = temp18;
}
temp19 = 1;
temp20 = t + temp19;
t = temp20;
}


return q;
}
}
