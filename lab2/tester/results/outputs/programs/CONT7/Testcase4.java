class Testcase4 {
public static void main(String[] args){
T4 temp0;
int temp1;
temp0 = new T4();
temp1 = temp0.Fun();
System.out.println(temp1);

}
}
class T4 {
public int Fun ( ){
int[] arr;
int temp11;
int temp12;
int temp;
int temp13;
int temp14;
int temp10;
int temp19;
int i;
int sum;
int j;
int temp2;
boolean temp15;
int[] temp3;
int temp16;
int temp17;
int temp18;
int temp6;
int temp7;
int temp4;
int temp5;
int len;
int temp8;
boolean temp9;
temp2 = 6;
temp3= new int[temp2];
arr = temp3;
temp4 = 0;
i = temp4;
temp5 = 0;
sum = temp5;
temp6 = 20;
j = temp6;
temp7 = arr.length;
len = temp7;
temp8 = 0;
i = temp8;
temp9 = i < len;
while(temp9){
arr[i] = j;
temp12 = 20;
temp13 = j + temp12;
j = temp13;
temp10 = 1;
temp11 = i + temp10;
i = temp11;
temp9 = i < len;
}
temp14 = 6;
temp15 = i < temp14;
while(temp15){
temp16 = arr[i];
temp = temp16;
temp17 = sum + temp;
sum = temp17;
temp18 = 1;
temp19 = i + temp18;
i = temp19;
temp14 = 6;
temp15 = i < temp14;
}


return sum;
}
}
