class LinearSearch {
public static void main(String[] args){
int temp2;
RLS temp0;
int temp1;
temp0 = new RLS();
temp1 = 5;
temp2 = temp0.search(temp1);
System.out.println(temp2);

}
}
class LS {
public int Init (int[] a, int len ){
int temp6;
int temp11;
int temp7;
int temp12;
boolean temp4;
int temp5;
int temp8;
int temp9;
int temp10;
int i;
int temp2;
int temp3;
temp3 = 0;
i = temp3;
temp4 = i < len;
while(temp4){
temp5 = 2;
temp6 = i * temp5;
a[i] = temp6;
temp7 = a[i];
temp2 = temp7;
temp8 = 3;
temp9 = temp2 + temp8;
a[i] = temp9;
temp10 = 1;
temp11 = i + temp10;
i = temp11;
temp4 = i < len;
}

temp12 = 0;

return temp12;
}
}
class RLS extends LS {
public int search (int elem ){
int[] arr;
int temp22;
RLS temp23;
int temp;
int temp13;
int temp24;
int[] temp14;
int temp25;
int temp20;
int temp21;
boolean temp19;
int i;
int temp15;
int temp26;
LS temp16;
int temp17;
int temp18;
int size;
temp13 = 10;
temp14= new int[temp13];
arr = temp14;
temp15 = 10;
size = temp15;
temp16 = new LS();
temp17 = temp16.Init(arr,size );
temp = temp17;
temp18 = 0;
i = temp18;
temp19 = i < size;
while(temp19){
temp20 = arr[i];
System.out.println(temp20);
temp21 = 1;
temp22 = i + temp21;
i = temp22;
temp19 = i < size;
}
temp23 = this;
temp24 = 0;
temp25 = 10;
temp26 = temp23.reccall(arr,temp24 ,temp25 ,elem );
temp = temp26;


return temp;
}
public int reccall (int[] ar, int i, int ln, int element ){
int val;
int ret;
int temp33;
int temp34;
int temp35;
int temp36;
boolean ch;
boolean temp30;
boolean temp31;
boolean temp32;
RLS temp37;
int temp27;
int temp38;
RLS temp28;
int temp29;
temp27 = 0;
val = temp27;
temp28 = this;
temp29 = ar[i];
temp30 = temp28.compare(temp29,element );
ch = temp30;
temp31 = i < ln;
temp32= !temp31;
if(temp32){
temp33 = 0;
ret = temp33;
}
else{
if(ch){
temp34 = 1;
ret = temp34;
}
else{
temp35 = 1;
temp36 = i + temp35;
i = temp36;
temp37 = this;
temp38 = temp37.reccall(ar,i ,ln ,element );
val = temp38;
ret = val;
}
}


return ret;
}
public boolean compare (int num1, int num2 ){
boolean temp44;
boolean temp45;
boolean temp46;
boolean temp47;
int temp40;
int temp41;
boolean temp42;
boolean temp43;
int aux02;
boolean retval;
boolean temp39;
temp39 = false;
retval = temp39;
temp40 = 1;
temp41 = num2 + temp40;
aux02 = temp41;
temp42 = num1 < num2;
if(temp42){
temp43 = false;
retval = temp43;
}
else{
temp44 = num1 < aux02;
temp45= !temp44;
if(temp45){
temp46 = false;
retval = temp46;
}
else{
temp47 = true;
retval = temp47;
}
}


return retval;
}
}
