class MoreThan4 {
public static void main(String[] a){
int temp6;
int temp7;
int temp4;
int temp5;
int temp2;
int temp3;
MT4 temp0;
int temp1;
temp0 = new MT4();
temp1 = 1;
temp2 = 2;
temp3 = 3;
temp4 = 4;
temp5 = 5;
temp6 = 6;
temp7 = temp0.Start(temp1,temp2 ,temp3 ,temp4 ,temp5 ,temp6 );
System.out.println(temp7);

}
}
class MT4 {
public int Start (int p1, int p2, int p3, int p4, int p5, int p6 ){
int aux;
MT4 temp8;
int temp9;
System.out.println(p1);
System.out.println(p2);
System.out.println(p3);
System.out.println(p4);
System.out.println(p5);
System.out.println(p6);
temp8 = this;
temp9 = temp8.Change(p6,p5 ,p4 ,p3 ,p2 ,p1 );
aux = temp9;


return aux;
}
public int Change (int p1, int p2, int p3, int p4, int p5, int p6 ){
int temp10;
System.out.println(p1);
System.out.println(p2);
System.out.println(p3);
System.out.println(p4);
System.out.println(p5);
System.out.println(p6);

temp10 = 0;

return temp10;
}
}
