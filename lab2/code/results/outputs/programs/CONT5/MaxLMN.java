class MaxLMN {
public static void main(String[] a){
ArrayOp temp0;
int temp1;
temp0 = new ArrayOp();
temp1 = temp0.getmax();
System.out.println(temp1);

}
}
class ArrayOp {
public int getmax ( ){
int temp11;
int temp12;
int temp13;
int temp14;
int max;
int temp20;
int temp10;
int temp21;
int[] numbers;
boolean temp19;
int i;
int j;
int temp2;
int temp15;
int[] temp3;
int temp16;
boolean temp17;
int temp18;
int temp6;
int temp7;
int temp4;
int temp5;
int temp8;
int temp9;
temp2 = 5;
temp3= new int[temp2];
numbers = temp3;
temp4 = 0;
max = temp4;
temp5 = 0;
i = temp5;
temp6 = 0;
temp7 = 3;
numbers[temp6] = temp7;
temp8 = 1;
temp9 = 6;
numbers[temp8] = temp9;
temp10 = 2;
temp11 = 1;
numbers[temp10] = temp11;
temp12 = 3;
temp13 = 4;
numbers[temp12] = temp13;
temp14 = 4;
temp15 = 3;
numbers[temp14] = temp15;
temp16 = 5;
temp17 = i < temp16;
while(temp17){
temp18 = numbers[i];
j = temp18;
temp19 = j < max;
if(temp19){
max = j;
}
else{
max = max;
}
temp20 = 1;
temp21 = i + temp20;
i = temp21;
temp16 = 5;
temp17 = i < temp16;
}


return max;
}
}
