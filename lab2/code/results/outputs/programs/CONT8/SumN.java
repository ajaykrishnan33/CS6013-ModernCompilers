class SumN {
public static void main(String[] a){
int temp2;
Naturalnos temp0;
int temp1;
temp0 = new Naturalnos();
temp1 = 6;
temp2 = temp0.sumR(temp1);
System.out.println(temp2);

}
}
class Naturalnos {
public int sumR (int num ){
int ret;
int temp11;
int a;
int temp12;
int temp10;
int sum;
int temp3;
boolean temp6;
int temp7;
Naturalnos temp4;
int temp5;
Naturalnos temp8;
int temp9;
temp3 = 0;
ret = temp3;
temp4 = this;
temp5 = 1;
temp6 = temp4.Compare(num,temp5 );
if(temp6){
temp7 = 1;
ret = temp7;
}
else{
temp8 = this;
temp9 = 1;
temp10 = num - temp9;
temp11 = temp8.sumR(temp10);
a = temp11;
temp12 = num + a;
sum = temp12;
ret = sum;
}


return ret;
}
public boolean Compare (int num1, int num2 ){
boolean temp13;
int temp14;
boolean temp20;
boolean temp21;
boolean temp19;
int aux02;
int temp15;
boolean temp16;
boolean retval;
boolean temp17;
boolean temp18;
temp13 = false;
retval = temp13;
temp14 = 1;
temp15 = num2 + temp14;
aux02 = temp15;
temp16 = num1 < num2;
if(temp16){
temp17 = false;
retval = temp17;
}
else{
temp18 = num1 < aux02;
temp19= !temp18;
if(temp19){
temp20 = false;
retval = temp20;
}
else{
temp21 = true;
retval = temp21;
}
}


return retval;
}
}
