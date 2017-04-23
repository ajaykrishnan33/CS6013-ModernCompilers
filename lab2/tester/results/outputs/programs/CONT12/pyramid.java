class pyramid {
public static void main(String[] a){
int temp2;
py temp0;
int temp1;
temp0 = new py();
temp1 = 6;
temp2 = temp0.start(temp1);
System.out.println(temp2);

}
}
class py {
public int start (int n ){
int temp6;
int temp11;
int temp7;
boolean temp4;
int temp5;
boolean temp8;
int temp9;
int temp10;
int i;
int j;
int temp3;
temp3 = 1;
i = temp3;
temp4 = i < n;
while(temp4){
temp7 = 1;
j = temp7;
temp8 = j < i;
while(temp8){
System.out.println(j);
temp9 = 1;
temp10 = j + temp9;
j = temp10;
temp8 = j < i;
}
temp5 = 1;
temp6 = i + temp5;
i = temp6;
temp4 = i < n;
}

temp11 = 0;

return temp11;
}
}
