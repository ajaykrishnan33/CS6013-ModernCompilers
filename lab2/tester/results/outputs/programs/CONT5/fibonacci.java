class fibonacci {
public static void main(String[] a){
int temp2;
Fibo temp0;
int temp1;
temp0 = new Fibo();
temp1 = 6;
temp2 = temp0.getFibo(temp1);
System.out.println(temp2);

}
}
class Fibo {
public int getFibo (int n ){
int temp11;
Fibo temp12;
int temp13;
int temp14;
int val2;
int val1;
Fibo temp10;
int temp3;
int retval;
int temp6;
int temp7;
boolean temp4;
int temp5;
int temp8;
int temp9;
temp3 = 3;
temp4 = n < temp3;
if(temp4){
temp5 = 1;
retval = temp5;
}
else{
temp6 = 1;
temp7 = n - temp6;
val1 = temp7;
temp8 = 2;
temp9 = n - temp8;
val2 = temp9;
temp10 = this;
temp11 = temp10.getFibo(val1);
temp12 = this;
temp13 = temp12.getFibo(val2);
temp14 = temp11 + temp13;
retval = temp14;
}


return retval;
}
}
