class Testcase3 {
public static void main(String[] args){
int temp2;
T3 temp0;
int temp1;
temp0 = new T3();
temp1 = 10;
temp2 = temp0.Fun(temp1);
System.out.println(temp2);

}
}
class T3 {
int n1;
int n2;
int n3;
int i;
public int Fun (int count ){
boolean temp6;
int temp7;
int temp4;
int temp5;
int temp8;
int temp9;
int temp3;
temp3 = 0;
n1 = temp3;
temp4 = 1;
n2 = temp4;
temp5 = 2;
i = temp5;
temp6 = i < count;
while(temp6){
temp9 = n1 + n2;
n3 = temp9;
n1 = n2;
n2 = n3;
temp7 = 1;
temp8 = i + temp7;
i = temp8;
temp6 = i < count;
}


return n3;
}
}
