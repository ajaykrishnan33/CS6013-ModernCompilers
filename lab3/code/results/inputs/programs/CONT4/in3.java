class in3 {
public static void main(String[] args){
Condition temp0;
int temp1;
temp0 = new Condition();
temp1 = temp0.isEqual();
System.out.println(temp1);

}
}
class Condition {
int x;
int y;
public int isEqual ( ){
int ret;
int temp11;
int temp10;
int temp2;
int temp3;
boolean b1;
boolean b2;
int temp6;
int temp7;
boolean temp4;
boolean temp5;
int temp8;
int temp9;
temp2 = 6;
x = temp2;
temp3 = 9;
y = temp3;
temp4 = x < y;
b1 = temp4;
temp5 = y < x;
b2 = temp5;
if(b1){
temp6 = 1;
System.out.println(temp6);
temp7 = 1;
ret = temp7;
}
else{
if(b2){
temp8 = 1;
System.out.println(temp8);
temp9 = 1;
ret = temp9;
}
else{
temp10 = 0;
System.out.println(temp10);
temp11 = 0;
ret = temp11;
}
}


return ret;
}
}
