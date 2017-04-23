class fibonacci2{
public static void main(String[] a){
Fibo f0; int t0; int t1;
f0=new Fibo();t0=6; t1=f0.getFibo(t0);
System.out.println(t1);
}
}
class Fibo{
public int  getFibo(int  n){
int  retval;
int  val1;
int  val2;
 int t2; boolean b0;int t3; int t4; int t5; int t6; int t7;  int t8;   int t9; int t10;
t2=3; b0=n<t2;
if(b0){
t3=1; retval=t3;
}
else
{
 t4=1; t5=n-t4; val1=t5;
 t6=2; t7=n-t6; val2=t7;
 t8=this.getFibo(val1);
 t9=this.getFibo(val2);
  t10=t8+t9; retval=t10;
}

return retval;}
}
