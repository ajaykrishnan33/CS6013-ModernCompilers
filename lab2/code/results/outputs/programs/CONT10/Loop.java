class Loop {
public static void main(String[] a){
int temp2;
yloop temp0;
int temp1;
temp0 = new yloop();
temp1 = 7;
temp2 = temp0.l1(temp1);
System.out.println(temp2);

}
}
class yloop {
public int l1 (int m ){
int temp11;
int temp12;
int temp13;
int temp14;
int temp10;
int count;
int temp3;
int n;
int temp6;
int temp7;
int temp4;
boolean temp5;
boolean temp8;
int temp9;
temp3 = 0;
count = temp3;
temp4 = 2;
temp5 = temp4 < m;
while(temp5){
temp6 = 1;
n = temp6;
temp7 = 4;
temp8 = n < temp7;
while(temp8){
temp9 = 1;
temp10 = count + temp9;
count = temp10;
temp11 = 1;
temp12 = n + temp11;
n = temp12;
temp7 = 4;
temp8 = n < temp7;
}
temp13 = 2;
temp14 = m - temp13;
m = temp14;
temp4 = 2;
temp5 = temp4 < m;
}


return count;
}
}
