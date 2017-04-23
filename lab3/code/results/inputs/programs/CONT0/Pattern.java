class Pattern {
public static void main(String[] a){
int temp2;
Pat temp0;
int temp1;
temp0 = new Pat();
temp1 = 34;
temp2 = temp0.Start(temp1);
System.out.println(temp2);

}
}
class Pat {
int number;
public int Start (int num ){
int temp6;
int temp11;
int temp7;
int temp4;
boolean temp5;
boolean temp8;
int temp9;
int temp10;
int aux01;
int aux02;
int temp3;
temp3 = 0;
aux02 = temp3;
temp4 = 0;
aux01 = temp4;
temp5 = aux01 < num;
while(temp5){
System.out.println(aux01);
temp6 = 1;
temp7 = aux01 + temp6;
aux01 = temp7;
temp5 = aux01 < num;
}
temp8 = aux02 < aux01;
while(temp8){
System.out.println(aux01);
temp9 = 1;
temp10 = aux01 - temp9;
aux01 = temp10;
temp8 = aux02 < aux01;
}

temp11 = 0;

return temp11;
}
}
