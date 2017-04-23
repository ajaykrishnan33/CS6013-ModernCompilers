class Testcase1 {
public static void main(String[] args_){
T1 temp0;
boolean temp1;
temp0 = new T1();
temp1 = temp0.Fun();
System.out.println(temp1);

}
}
class T1 extends Testcase1 {
int a;
int b;
int k;
public boolean Fun ( ){
int temp6;
boolean temp11;
boolean temp7;
T1 temp4;
int temp5;
int temp8;
int temp9;
boolean temp10;
T1 temp2;
int temp3;
temp2 = this;
temp3 = 3;
temp2.a = temp3;
temp4 = this;
temp5 = 6;
temp4.b = temp5;
temp6 = 0;
k = temp6;
temp7 = k < a;
while(temp7){
temp10 = k < a;
if(temp10){
System.out.println(a);
}
else{
System.out.println(b);
}
temp8 = 1;
temp9 = k + temp8;
k = temp9;
temp7 = k < a;
}

temp11 = true;

return temp11;
}
}
