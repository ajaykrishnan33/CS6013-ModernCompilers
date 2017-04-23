class SumNumbers2{
public static void main(String[] a){
SumNum f0; int t0; int t1;
f0=new SumNum();t0=6; t1=f0.getSum(t0);
System.out.println(t1);
}
}
class SumNum{
public int  getSum(int  n){
int  retval;
int  i;
int t2;int t3;  int t4; int t5; int t6;  boolean b0;  int t7;
t2=0; retval=t2;
t3=0; i=t3;
 b0=i<n;
while(b0){
  t4=retval+i; retval=t4;
 t5=1; t6=i+t5; i=t6;
 b0=i<n;
}
  t7=retval+i; retval=t7;

return retval;}
}
