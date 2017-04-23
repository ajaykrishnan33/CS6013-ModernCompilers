class Fib_tailrec {
public static void main(String[] args){
int temp2;
Fib temp0;
int temp1;
temp0 = new Fib();
temp1 = 317811;
temp2 = temp0.get(temp1);
System.out.println(temp2);

}
}
class Fib {
public int get (int a ){
int temp6;
int temp7;
int temp4;
int temp5;
Fib temp3;

temp3 = this;
temp4 = 0;
temp5 = 1;
temp6 = 2;
temp7 = temp3.fib(temp4,temp5 ,a ,temp6 );

return temp7;
}
public int fib (int a, int b, int n, int r ){
int temp11;
int temp22;
boolean temp12;
int temp23;
boolean temp13;
boolean temp14;
int temp20;
boolean temp10;
int temp21;
Fib temp19;
int temp15;
int ret_res;
boolean temp16;
boolean temp17;
int temp18;
int temp8;
boolean temp9;
temp8 = a + b;
temp9 = temp8 < n;
temp10= !temp9;
temp11 = a + b;
temp12 = n < temp11;
temp13= !temp12;
temp14 = temp10 & temp13;
if(temp14){
ret_res = r;
}
else{
temp15 = a + b;
temp16 = temp15 < n;
temp17= !temp16;
if(temp17){
temp18 = 0;
ret_res = temp18;
}
else{
temp19 = this;
temp20 = a + b;
temp21 = 1;
temp22 = r + temp21;
temp23 = temp19.fib(b,temp20 ,n ,temp22 );
ret_res = temp23;
}
}


return ret_res;
}
}
