class Print {
public static void main(String[] b){
int temp2;
PE temp0;
int temp1;
temp0 = new PE();
temp1 = 8;
temp2 = temp0.pqr(temp1);
System.out.println(temp2);

}
}
class P {
int sz;
public int ABC (int n ){
int temp6;
int temp7;
int temp4;
int temp5;
int temp8;
int temp9;
int temp3;
sz = n;
temp3 = 1;
temp4 = n + temp3;
System.out.println(temp4);
temp5 = 1;
temp6 = n - temp5;
System.out.println(temp6);
temp7 = 2;
temp8 = n * temp7;
System.out.println(temp8);

temp9 = 0;

return temp9;
}
}
class PE extends P {
public int pqr (int m ){
int temp11;
int temp12;
boolean temp13;
int temp14;
int d;
P temp10;
temp10 = new P();
temp11 = temp10.ABC(m);
d = temp11;
temp12 = 2;
temp13 = m < temp12;
System.out.println(temp13);

temp14 = 0;

return temp14;
}
}
