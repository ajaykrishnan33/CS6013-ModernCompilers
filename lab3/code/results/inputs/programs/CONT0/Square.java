class Square {
public static void main(String[] a){
int temp2;
SQ temp0;
int temp1;
temp0 = new SQ();
temp1 = 34;
temp2 = temp0.Start(temp1);
System.out.println(temp2);

}
}
class SQ {
int number;
public int Start (int num ){
int temp6;
int temp7;
int temp4;
boolean temp5;
int temp8;
int temp9;
int aux01;
int aux03;
int aux02;
int temp3;
temp3 = 0;
aux02 = temp3;
temp4 = 0;
aux01 = temp4;
temp5 = aux01 < num;
while(temp5){
temp6 = aux01 * aux01;
aux03 = temp6;
System.out.println(aux03);
temp7 = 1;
temp8 = aux01 + temp7;
aux01 = temp8;
temp5 = aux01 < num;
}

temp9 = 0;

return temp9;
}
}
