class Fib {
public static void main(String[] a){
int temp2;
Fibo temp0;
int temp1;
temp0 = new Fibo();
temp1 = 50;
temp2 = temp0.Computefib(temp1);
System.out.println(temp2);

}
}
class Fibo {
public int Computefib (int num ){
int temp6;
int hi;
int temp7;
int temp4;
int lo;
boolean temp5;
int temp8;
int temp3;
temp3 = 1;
lo = temp3;
temp4 = 1;
hi = temp4;
System.out.println(lo);
temp5 = hi < num;
while(temp5){
System.out.println(hi);
temp6 = lo + hi;
hi = temp6;
temp7 = hi - lo;
lo = temp7;
temp5 = hi < num;
}

temp8 = 1;

return temp8;
}
}
