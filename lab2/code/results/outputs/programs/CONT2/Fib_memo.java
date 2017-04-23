class Fib_memo {
public static void main(String[] args){
int temp2;
fib2 temp0;
int temp1;
temp0 = new fib2();
temp1 = 317811;
temp2 = temp0.get(temp1);
System.out.println(temp2);

}
}
class fib2 {
int[] fib_array;
int fib_index;
public int get (int a ){
int temp6;
fib2 temp7;
int temp4;
fib2 temp5;
int temp8;
int init_ret;
int calc_ret;
fib2 temp3;
temp3 = this;
temp4 = temp3.initialize();
init_ret = temp4;
temp5 = this;
temp6 = temp5.calc();
calc_ret = temp6;
temp7 = this;
temp8 = temp7.find(a);
fib_index = temp8;


return fib_index;
}
public int initialize ( ){
int temp11;
int temp22;
int temp12;
int temp13;
boolean temp14;
int temp20;
int[] temp10;
int temp21;
int temp19;
int i;
int temp15;
int temp16;
int temp17;
int temp18;
int temp9;
temp9 = 48;
temp10= new int[temp9];
fib_array = temp10;
temp11 = 0;
fib_index = temp11;
temp12 = 0;
i = temp12;
temp13 = fib_array.length;
temp14 = i < temp13;
while(temp14){
temp17 = 0;
fib_array[i] = temp17;
temp15 = 1;
temp16 = i + temp15;
i = temp16;
temp13 = fib_array.length;
temp14 = i < temp13;
}
temp18 = 0;
temp19 = 0;
fib_array[temp18] = temp19;
temp20 = 1;
temp21 = 1;
fib_array[temp20] = temp21;

temp22 = 1;

return temp22;
}
public int calc ( ){
int temp33;
int temp23;
int temp34;
int temp24;
int temp35;
boolean temp25;
int temp30;
int temp31;
int temp32;
int i;
int temp26;
int temp27;
int temp28;
int temp29;
temp23 = 2;
i = temp23;
temp24 = fib_array.length;
temp25 = i < temp24;
while(temp25){
temp28 = 1;
temp29 = i - temp28;
temp30 = fib_array[temp29];
temp31 = 2;
temp32 = i - temp31;
temp33 = fib_array[temp32];
temp34 = temp30 + temp33;
fib_array[i] = temp34;
temp26 = 1;
temp27 = i + temp26;
i = temp27;
temp24 = fib_array.length;
temp25 = i < temp24;
}

temp35 = 1;

return temp35;
}
public int find (int n ){
int temp55;
int temp56;
int temp57;
int temp36;
int temp58;
int temp51;
int temp52;
boolean temp53;
int temp54;
int temp37;
int temp59;
int temp38;
int temp39;
boolean temp50;
int temp44;
boolean temp45;
boolean temp46;
int temp47;
int temp40;
boolean temp41;
int temp42;
int temp43;
int i;
int ret_val;
boolean temp48;
boolean temp49;
temp36 = 0;
temp37 = 1;
temp38 = temp36 - temp37;
ret_val = temp38;
temp39 = 0;
i = temp39;
temp40 = fib_array.length;
temp41 = i < temp40;
while(temp41){
temp44 = fib_array[i];
temp45 = temp44 < n;
temp46= !temp45;
temp47 = fib_array[i];
temp48 = n < temp47;
temp49= !temp48;
temp50 = temp46 & temp49;
if(temp50){
ret_val = i;
}
else{
temp51 = fib_array[i];
temp52 = 0;
temp53 = temp51 < temp52;
if(temp53){
temp54 = fib_array[i];
temp55 = 0;
temp56 = 1;
temp57 = temp55 - temp56;
temp58 = temp54 * temp57;
System.out.println(temp58);
}
else{
temp59 = fib_array[i];
System.out.println(temp59);
}
}
temp42 = 1;
temp43 = i + temp42;
i = temp43;
temp40 = fib_array.length;
temp41 = i < temp40;
}


return ret_val;
}
}
