class testcase4 {
public static void main(String[] args){
loop temp0;
int temp1;
temp0 = new loop();
temp1 = temp0.method1();
System.out.println(temp1);

}
}
class loop {
int a;
int b;
boolean x;
boolean y;
int i;
public int method1 ( ){
int temp11;
boolean temp12;
boolean temp13;
boolean temp14;
int temp10;
int temp2;
int temp15;
int temp3;
int temp16;
boolean temp17;
boolean temp18;
boolean temp6;
int temp7;
int temp4;
int temp5;
int temp8;
boolean temp9;
temp2 = 1;
a = temp2;
temp3 = 1;
b = temp3;
temp4 = 0;
i = temp4;
temp5 = 4;
temp6 = i < temp5;
while(temp6){
temp9 = x & y;
if(temp9){
temp10 = 1;
temp11 = a + temp10;
a = temp11;
temp12 = false;
x = temp12;
temp13 = false;
y = temp13;
}
else{
temp14 = a < b;
while(temp14){
temp15 = 1;
temp16 = b + temp15;
b = temp16;
temp17 = true;
x = temp17;
temp18 = true;
y = temp18;
temp14 = a < b;
}
}
temp7 = 1;
temp8 = i + temp7;
i = temp8;
temp5 = 4;
temp6 = i < temp5;
}


return b;
}
}
