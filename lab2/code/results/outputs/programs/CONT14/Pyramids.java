class Pyramids {
public static void main(String[] args){
int temp2;
BuildPyramid temp0;
int temp1;
temp0 = new BuildPyramid();
temp1 = 20;
temp2 = temp0.Display(temp1);
System.out.println(temp2);

}
}
class BuildPyramid {
public int Display (int num ){
int temp11;
int temp12;
int temp13;
int temp14;
boolean temp10;
int i;
int j;
int temp3;
int temp6;
int temp7;
int temp4;
boolean temp5;
int temp8;
int temp9;
temp3 = 1;
i = temp3;
temp4 = 20;
temp5 = i < temp4;
while(temp5){
temp8 = 1;
j = temp8;
temp9 = 20;
temp10 = j < temp9;
while(temp10){
temp13 = 0;
System.out.println(temp13);
temp11 = 1;
temp12 = j + temp11;
j = temp12;
temp9 = 20;
temp10 = j < temp9;
}
temp6 = 1;
temp7 = i + temp6;
i = temp7;
temp4 = 20;
temp5 = i < temp4;
}

temp14 = 0;

return temp14;
}
}
