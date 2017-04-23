class in4 {
public static void main(String[] args){
int temp2;
Loop temp0;
int temp1;
temp0 = new Loop();
temp1 = 6;
temp2 = temp0.isEqual(temp1);
System.out.println(temp2);

}
}
class Loop {
public int isEqual (int n ){
int temp6;
int temp7;
int temp4;
int fact;
boolean temp5;
int temp8;
int temp3;
temp3 = 1;
fact = temp3;
temp4 = 0;
temp5 = temp4 < n;
while(temp5){
temp6 = fact * n;
fact = temp6;
temp7 = 1;
temp8 = n - temp7;
n = temp8;
temp4 = 0;
temp5 = temp4 < n;
}


return fact;
}
}
