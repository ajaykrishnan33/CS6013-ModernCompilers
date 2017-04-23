class pyramid {
public static void main(String[] a){
int temp2;
Pyra temp0;
int temp1;
temp0 = new Pyra();
temp1 = 6;
temp2 = temp0.makePyra(temp1);
System.out.println(temp2);

}
}
class Pyra {
public int makePyra (int n ){
boolean temp11;
int temp12;
int temp13;
int temp14;
int temp10;
int i;
int j;
int temp15;
int temp3;
int temp16;
int temp6;
boolean temp7;
int temp4;
int temp5;
int nlimit;
int temp8;
int temp9;
int limit;
temp3 = 1;
i = temp3;
temp4 = 1;
j = temp4;
temp5 = 1;
temp6 = n + temp5;
nlimit = temp6;
temp7 = i < nlimit;
while(temp7){
temp8 = 1;
j = temp8;
temp9 = 1;
temp10 = i + temp9;
limit = temp10;
temp11 = j < limit;
while(temp11){
System.out.println(j);
temp12 = 1;
temp13 = j + temp12;
j = temp13;
temp11 = j < limit;
}
temp14 = 1;
temp15 = i + temp14;
i = temp15;
temp7 = i < nlimit;
}

temp16 = 0;

return temp16;
}
}
