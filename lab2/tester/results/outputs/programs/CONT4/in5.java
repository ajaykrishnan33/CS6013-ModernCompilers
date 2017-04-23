class in5 {
public static void main(String[] args){
Array temp0;
int temp1;
temp0 = new Array();
temp1 = temp0.sum();
System.out.println(temp1);

}
}
class Array {
int[] a;
public int sum ( ){
int temp11;
int temp12;
int temp13;
int temp14;
int temp20;
int temp10;
int temp21;
int temp19;
int i;
int temp2;
int temp15;
int[] temp3;
int temp16;
boolean temp17;
int temp18;
int temp6;
int temp7;
int temp4;
int s;
int temp5;
int temp8;
int temp9;
int x;
temp2 = 5;
temp3= new int[temp2];
a = temp3;
temp4 = 0;
s = temp4;
temp5 = 0;
temp6 = 1;
a[temp5] = temp6;
temp7 = 1;
temp8 = 1;
a[temp7] = temp8;
temp9 = 2;
temp10 = 1;
a[temp9] = temp10;
temp11 = 3;
temp12 = 1;
a[temp11] = temp12;
temp13 = 4;
temp14 = 1;
a[temp13] = temp14;
temp15 = 0;
i = temp15;
temp16 = 5;
temp17 = i < temp16;
while(temp17){
temp20 = a[i];
x = temp20;
temp21 = s + x;
s = temp21;
temp18 = 1;
temp19 = i + temp18;
i = temp19;
temp16 = 5;
temp17 = i < temp16;
}


return s;
}
}
