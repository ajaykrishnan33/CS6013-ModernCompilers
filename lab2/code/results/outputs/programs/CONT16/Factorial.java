class Factorial {
public static void main(String[] a){
int temp2;
Fac temp0;
int temp1;
temp0 = new Fac();
temp1 = 10;
temp2 = temp0.ComputeFac(temp1);
System.out.println(temp2);

}
}
class Fac {
public int ComputeFac (int num ){
Fac temp6;
int temp7;
boolean temp4;
int temp5;
int temp8;
int temp9;
int temp10;
int num_aux;
int temp3;
temp3 = 1;
temp4 = num < temp3;
if(temp4){
temp5 = 1;
num_aux = temp5;
}
else{
temp6 = this;
temp7 = 1;
temp8 = num - temp7;
temp9 = temp6.ComputeFac(temp8);
temp10 = num * temp9;
num_aux = temp10;
}


return num_aux;
}
}
