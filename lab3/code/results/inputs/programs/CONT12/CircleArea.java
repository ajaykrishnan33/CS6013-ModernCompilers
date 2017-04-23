class CircleArea {
public static void main(String[] a){
int temp2;
CA temp0;
int temp1;
temp0 = new CA();
temp1 = 5;
temp2 = temp0.cal(temp1);
System.out.println(temp2);

}
}
class CA {
public int cal (int radius ){
int area;
CA temp6;
int temp7;
int temp4;
int temp5;
int temp8;
int temp3;
temp3 = 22;
temp4 = radius * temp3;
area = temp4;
temp5 = area * radius;
area = temp5;
temp6 = this;
temp7 = 7;
temp8 = temp6.div(area,temp7 );
area = temp8;


return area;
}
public int div (int num1, int num2 ){
int ret;
int temp11;
boolean temp12;
int temp;
int temp13;
int temp14;
int temp9;
boolean temp10;
int count;
int temp15;
temp9 = 0;
count = temp9;
temp10 = num1 < num2;
if(temp10){
temp11 = 0;
ret = temp11;
}
else{
temp = num2;
temp12 = temp < num1;
while(temp12){
temp13 = temp + num2;
temp = temp13;
temp14 = 1;
temp15 = count + temp14;
count = temp15;
temp12 = temp < num1;
}
ret = count;
}


return ret;
}
}
