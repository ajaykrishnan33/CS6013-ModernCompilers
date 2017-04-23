class Square {
public static void main(String[] a){
int temp4;
int temp5;
int temp2;
int temp3;
arraysquare temp0;
int temp1;
temp0 = new arraysquare();
temp1 = 6;
temp2 = 15;
temp3 = 31;
temp4 = 56;
temp5 = temp0.sqr(temp1,temp2 ,temp3 ,temp4 );
System.out.println(temp5);

}
}
class arraysquare {
public int sqr (int num0, int num1, int num2, int num3 ){
int temp11;
int temp22;
int temp12;
int temp23;
int temp13;
int temp14;
int temp20;
int temp10;
int temp21;
int temp19;
int sum;
int j;
int temp15;
int temp16;
int temp17;
boolean temp18;
int temp6;
int temp7;
int[] temp8;
int[] anArray;
int temp9;
temp6 = 0;
j = temp6;
temp7 = 5;
temp8= new int[temp7];
anArray = temp8;
temp9 = 0;
temp10 = num0 * num0;
anArray[temp9] = temp10;
temp11 = 1;
temp12 = num1 * num1;
anArray[temp11] = temp12;
temp13 = 2;
temp14 = num2 * num2;
anArray[temp13] = temp14;
temp15 = 3;
temp16 = num3 * num3;
anArray[temp15] = temp16;
temp17 = 3;
temp18 = j < temp17;
while(temp18){
temp19 = anArray[j];
System.out.println(temp19);
temp20 = 1;
temp21 = j + temp20;
j = temp21;
temp17 = 3;
temp18 = j < temp17;
}

temp22 = 3;
temp23 = anArray[temp22];

return temp23;
}
}
