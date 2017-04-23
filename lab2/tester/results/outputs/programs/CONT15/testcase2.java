class testcase2 {
public static void main(String[] args){
int temp2;
arr temp0;
int temp1;
temp0 = new arr();
temp1 = 7;
temp2 = temp0.array_chk(temp1);
System.out.println(temp2);

}
}
class arr {
int res;
int res1;
int[] myIntarry;
int res2;
public int array_chk (int val ){
int temp11;
int temp22;
int temp12;
int temp13;
int temp14;
int temp20;
int temp10;
int temp21;
int temp19;
int temp15;
int temp3;
int temp16;
int temp17;
int temp18;
int[] temp6;
int temp7;
int temp4;
int temp5;
int temp8;
int temp9;
temp3 = 2;
temp4 = 1;
temp5 = temp3 + temp4;
temp6= new int[temp5];
myIntarry = temp6;
temp7 = 0;
temp8 = 6;
temp9 = val + temp8;
myIntarry[temp7] = temp9;
temp10 = 1;
temp11 = 5;
myIntarry[temp10] = temp11;
temp12 = 2;
temp13 = 9;
myIntarry[temp12] = temp13;
temp14 = 0;
temp15 = myIntarry[temp14];
res = temp15;
temp16 = 1;
temp17 = myIntarry[temp16];
res1 = temp17;
temp18 = 2;
temp19 = myIntarry[temp18];
res2 = temp19;
temp20 = res + res1;
res = temp20;
temp21 = 2;
temp22 = res - temp21;
res = temp22;


return res;
}
}
