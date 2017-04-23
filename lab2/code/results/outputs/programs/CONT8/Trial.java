class Trial {
public static void main(String[] a){
int temp2;
First temp0;
int temp1;
temp0 = new First();
temp1 = 15;
temp2 = temp0.start(temp1);
System.out.println(temp2);

}
}
class First {
public int start (int x ){
int temp11;
int temp12;
int temp13;
boolean temp10;
int sum;
int temp3;
boolean temp6;
int temp7;
int temp4;
int temp5;
int temp8;
int temp9;
int y;
int z;
temp3 = 0;
y = temp3;
temp4 = 1;
sum = temp4;
temp5 = 1;
y = temp5;
temp6 = y < x;
while(temp6){
temp9 = 1;
z = temp9;
temp10 = z < x;
while(temp10){
temp13 = sum + z;
sum = temp13;
temp11 = 2;
temp12 = z + temp11;
z = temp12;
temp10 = z < x;
}
temp7 = 2;
temp8 = y + temp7;
y = temp8;
temp6 = y < x;
}


return sum;
}
}
