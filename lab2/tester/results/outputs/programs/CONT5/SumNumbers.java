class SumNumbers {
public static void main(String[] a){
int temp2;
SumNum temp0;
int temp1;
temp0 = new SumNum();
temp1 = 6;
temp2 = temp0.getSum(temp1);
System.out.println(temp2);

}
}
class SumNum {
public int getSum (int n ){
int temp6;
int temp7;
int temp4;
boolean temp5;
int temp8;
int temp9;
int i;
int temp3;
int retval;
temp3 = 0;
retval = temp3;
temp4 = 0;
i = temp4;
temp5 = i < n;
while(temp5){
temp6 = retval + i;
retval = temp6;
temp7 = 1;
temp8 = i + temp7;
i = temp8;
temp5 = i < n;
}
temp9 = retval + i;
retval = temp9;


return retval;
}
}
