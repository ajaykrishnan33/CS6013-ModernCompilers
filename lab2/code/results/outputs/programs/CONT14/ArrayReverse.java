class ArrayReverse {
public static void main(String[] x){
int temp2;
AR temp0;
int temp1;
temp0 = new AR();
temp1 = 10;
temp2 = temp0.PrintRev(temp1);
System.out.println(temp2);

}
}
class AR {
int[] n;
public int PrintRev (int a ){
int temp11;
int temp12;
int temp13;
boolean temp14;
int temp10;
int i;
int j;
int temp15;
int[] temp3;
int temp16;
int temp17;
int temp18;
int temp6;
int temp7;
int temp4;
boolean temp5;
int temp8;
int temp9;
temp3= new int[a];
n = temp3;
temp4 = 0;
i = temp4;
temp5 = i < a;
while(temp5){
temp8 = a - i;
j = temp8;
temp9 = 1;
temp10 = j - temp9;
j = temp10;
temp11 = 1;
temp12 = i + temp11;
n[j] = temp12;
temp6 = 1;
temp7 = i + temp6;
i = temp7;
temp5 = i < a;
}
temp13 = 0;
i = temp13;
temp14 = i < a;
while(temp14){
temp15 = n[i];
System.out.println(temp15);
temp16 = 1;
temp17 = i + temp16;
i = temp17;
temp14 = i < a;
}

temp18 = 0;

return temp18;
}
}
