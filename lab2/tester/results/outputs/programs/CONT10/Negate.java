class Negate {
public static void main(String[] abc){
int temp2;
neg temp0;
boolean temp1;
temp0 = new neg();
temp1 = true;
temp2 = temp0.t2(temp1);
System.out.println(temp2);

}
}
class neg {
public boolean t1 (boolean u, boolean v ){
boolean temp4;
boolean temp3;

temp3 = u & v;
temp4= !temp3;

return temp4;
}
public int t2 (boolean a ){
boolean temp11;
boolean temp12;
boolean b;
boolean temp13;
boolean c;
boolean temp14;
boolean temp10;
int i;
int temp15;
int temp16;
int temp17;
boolean temp6;
boolean temp7;
int temp5;
neg temp8;
boolean temp9;
temp5 = 0;
i = temp5;
temp6 = false;
b = temp6;
temp7 = true;
c = temp7;
temp8 = this;
temp9= !b;
temp10 = temp8.t1(temp9,a );
temp11= !temp10;
if(temp11){
temp12= !b;
temp13 = c & temp12;
temp14 = a & temp13;
if(temp14){
temp15 = 1;
i = temp15;
}
else{
temp16 = 2;
i = temp16;
}
}
else{
temp17 = 0;
i = temp17;
}


return i;
}
}
