class Testcase2 {
public static void main(String[] args_){
T2 temp0;
int temp1;
temp0 = new T2();
temp1 = temp0.Fun();
System.out.println(temp1);

}
}
class T2 extends Testcase2 {
public int Fun ( ){
boolean temp6;
int a;
int temp7;
int b;
boolean temp4;
int temp5;
int temp8;
int temp9;
int temp10;
int temp2;
int temp3;
temp2 = 5;
b = temp2;
a = b;
temp3 = 3;
temp4 = a < temp3;
while(temp4){
temp5 = 8;
temp6 = b < temp5;
while(temp6){
temp7 = 1;
temp8 = a + temp7;
a = temp8;
temp5 = 8;
temp6 = b < temp5;
}
temp9 = 1;
temp10 = b + temp9;
b = temp10;
temp3 = 3;
temp4 = a < temp3;
}


return b;
}
}
