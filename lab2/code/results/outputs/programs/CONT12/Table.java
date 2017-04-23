class Table {
public static void main(String[] args){
int temp2;
TTrev temp0;
int temp1;
temp0 = new TTrev();
temp1 = 5;
temp2 = temp0.printrev(temp1);
System.out.println(temp2);

}
}
class TT {
public int print (int num ){
int[] arr;
int temp11;
int temp12;
int temp;
int temp10;
int i;
int temp3;
int temp6;
boolean temp7;
int[] temp4;
int temp5;
int temp8;
int temp9;
temp3 = 11;
temp4= new int[temp3];
arr = temp4;
temp5 = 0;
i = temp5;
temp6 = 11;
temp7 = i < temp6;
while(temp7){
temp8 = num * i;
temp = temp8;
arr[i] = temp;
temp9 = arr[i];
System.out.println(temp9);
temp10 = 1;
temp11 = i + temp10;
i = temp11;
temp6 = 11;
temp7 = i < temp6;
}

temp12 = 0;

return temp12;
}
}
class TTrev extends TT {
public int printrev (int num ){
int temp22;
int[] a;
TT temp23;
int temp13;
int temp24;
int[] temp14;
int temp25;
int temp20;
int temp21;
int temp19;
int j;
int temp2;
int temp15;
int temp16;
boolean temp17;
boolean temp18;
temp13 = 11;
temp14= new int[temp13];
a = temp14;
temp15 = 10;
j = temp15;
temp16 = 0;
temp17 = j < temp16;
temp18= !temp17;
while(temp18){
temp19 = num * j;
temp2 = temp19;
a[j] = temp2;
temp20 = a[j];
System.out.println(temp20);
temp21 = 1;
temp22 = j - temp21;
j = temp22;
temp16 = 0;
temp17 = j < temp16;
temp18= !temp17;
}
temp23 = new TT();
temp24 = temp23.print(num);
temp2 = temp24;

temp25 = 0;

return temp25;
}
}
