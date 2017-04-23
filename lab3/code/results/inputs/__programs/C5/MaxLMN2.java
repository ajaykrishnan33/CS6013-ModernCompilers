class MaxLMN2{
public static void main(String[] a){
ArrayOp f0; int t0;
f0=new ArrayOp(); t0=f0.getmax();
System.out.println(t0);
}
}
class ArrayOp{
public int  getmax(){
int  max;
int[]  numbers;
int  i;
int  j;
int t1;int t2;int t3;int t4;int t5;int t6;int t7;int t8;int t9;int t10;int t11;int t12;int t13;int t15;  boolean b1; int t16; int t17; int t14; boolean b0;
t1=5; numbers=new int[t1];
t2=0; max=t2;
t3=0; i=t3;
t4=0;t5=3;numbers[t4]=t5;
t6=1;t7=6;numbers[t6]=t7;
t8=2;t9=1;numbers[t8]=t9;
t10=3;t11=4;numbers[t10]=t11;
t12=4;t13=3;numbers[t12]=t13;
t14=5; b0=i<t14;
while(b0){
t15=numbers[i]; j=t15;
 b1=j<max;
if(b1){
 max=j;
}
else
{
 max=max;
}
 t16=1; t17=i+t16; i=t17;
t14=5; b0=i<t14;
}

return max;}
}
