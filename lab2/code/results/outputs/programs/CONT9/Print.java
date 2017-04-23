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
int temp11;
int temp7;
int temp4;
int temp5;
int temp8;
int temp9;
boolean temp10;
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
temp9 = 2;
temp10 = n & temp9;
System.out.println(temp10);

temp11 = 0;

return temp11;
}
}
class PE extends P {
public int pqr (int m ){
P temp12;
int temp13;
int temp14;
int d;
boolean temp15;
int temp16;
temp12 = new P();
temp13 = temp12.ABC(m);
d = temp13;
temp14 = 2;
temp15 = m < temp14;
System.out.println(temp15);

temp16 = 0;

return temp16;
}
}
