class Average {
public static void main(String[] args){
int temp2;
Av temp0;
int temp1;
temp0 = new Av();
temp1 = 10;
temp2 = temp0.start(temp1);
System.out.println(temp2);

}
}
class Av {
int[] arr;
int len;
public int start (int size ){
int temp6;
int average;
int temp7;
int temp4;
Av temp5;
int temp8;
Av temp9;
int temp10;
int temp3;
temp3 = 1;
temp4 = size + temp3;
size = temp4;
temp5 = this;
temp6 = temp5.Init(size);
average = temp6;
temp7 = 1;
temp8 = size - temp7;
size = temp8;
temp9 = this;
temp10 = temp9.Div(average,size );
average = temp10;


return average;
}
public int Init (int s ){
int[] temp11;
int temp12;
int temp;
int temp13;
int avg;
boolean temp14;
int i;
int temp15;
int temp16;
int temp17;
int temp18;
temp11= new int[s];
arr = temp11;
temp12 = 0;
avg = temp12;
temp13 = 0;
i = temp13;
temp14 = i < s;
while(temp14){
arr[i] = i;
temp17 = arr[i];
temp = temp17;
temp18 = avg + temp;
avg = temp18;
temp15 = 1;
temp16 = i + temp15;
i = temp16;
temp14 = i < s;
}


return avg;
}
public int Div (int number1, int number2 ){
boolean temp22;
int temp23;
int temp;
int temp24;
int temp25;
boolean ch;
int temp20;
int temp21;
boolean temp19;
int rem;
temp19 = number1 < number2;
if(temp19){
temp20 = 0;
rem = temp20;
}
else{
temp21 = 0;
rem = temp21;
temp = number2;
temp22 = temp < number1;
while(temp22){
temp24 = 1;
temp25 = rem + temp24;
rem = temp25;
temp23 = temp + number2;
temp = temp23;
temp22 = temp < number1;
}
}


return rem;
}
}
