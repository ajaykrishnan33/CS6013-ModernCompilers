class ArithmeticProgression {
public static void main(String[] args){
int temp4;
int temp2;
int temp3;
AP temp0;
int temp1;
temp0 = new AP();
temp1 = 10;
temp2 = 2;
temp3 = 10;
temp4 = temp0.start(temp1,temp2 ,temp3 );
System.out.println(temp4);

}
}
class AP {
int[] arr;
int len;
public int start (int a, int d, int size ){
int temp11;
int temp12;
int temp;
int temp13;
int temp14;
int temp20;
int prev;
int temp10;
int temp19;
int i;
int temp15;
boolean temp16;
int temp17;
int temp18;
int temp6;
int temp7;
int[] temp5;
boolean temp8;
int temp9;
temp5= new int[size];
arr = temp5;
len = size;
temp6 = 1;
i = temp6;
temp7 = 0;
arr[temp7] = a;
temp8 = i < len;
while(temp8){
temp9 = 1;
temp10 = i - temp9;
prev = temp10;
temp11 = arr[prev];
temp = temp11;
temp12 = temp + d;
arr[i] = temp12;
temp13 = 1;
temp14 = i + temp13;
i = temp14;
temp8 = i < len;
}
temp15 = 0;
i = temp15;
temp16 = i < len;
while(temp16){
temp17 = arr[i];
System.out.println(temp17);
temp18 = 1;
temp19 = i + temp18;
i = temp19;
temp16 = i < len;
}

temp20 = 0;

return temp20;
}
}
