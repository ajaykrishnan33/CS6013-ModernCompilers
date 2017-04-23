class While {
public static void main(String[] a){
int temp2;
W temp0;
int temp1;
temp0 = new W();
temp1 = 6;
temp2 = temp0.loop(temp1);
System.out.println(temp2);

}
}
class W {
public int loop (int x ){
int temp11;
int temp12;
int temp10;
int sum;
int temp3;
int temp6;
boolean temp7;
int temp4;
boolean temp5;
int temp8;
int temp9;
int y;
int z;
temp3 = 0;
y = temp3;
temp4 = 1;
sum = temp4;
temp5 = y < x;
while(temp5){
temp6 = 1;
z = temp6;
temp7 = z < x;
while(temp7){
temp10 = sum * z;
sum = temp10;
temp8 = 1;
temp9 = z + temp8;
z = temp9;
temp7 = z < x;
}
temp11 = 1;
temp12 = y + temp11;
y = temp12;
temp5 = y < x;
}


return sum;
}
}
