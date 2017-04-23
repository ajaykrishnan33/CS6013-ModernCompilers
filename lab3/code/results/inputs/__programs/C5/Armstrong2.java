class Armstrong2{
public static void main(String[] a){
ANumber f0; int t0; int t1;
f0=new ANumber();t0=153; t1=f0.Compute(t0);
System.out.println(t1);
}
}
class ANumber{
public int  Compute(int  n){
int  c;
int  a;
int  b;
int  temp;
int t2;  int t4;  int t5;  int t6;  int t7;  int t8;int t3;  boolean b0;  int t9; int t10; boolean b1;boolean b2; int t11;  boolean b3;boolean b4; boolean b5;int t12;int t13;
t2=0; c=t2;
t3=0; b0=t3<n;
while(b0){
 t4=this.DivByTen(n); b=t4;
  t5=n-b; a=t5;
 n=b;
 t6=a*a; b=t6;
 t7=a*b; b=t7;
  t8=c+b; c=t8;
t3=0; b0=t3<n;
}
  t9=n-c; b=t9;
t10=0; b1=b<t10;
b2=!b1;
t11=0; b3=t11<b;
b4=!b3;
 b5=b2&b4;
if(b5){
t12=0; a=t12;
}
else
{
t13=1; a=t13;
}

return a;}
public int  DivByTen(int  n){
int  x;
int  y;
int t14;int t15; int t16; int t17; int t18; int t19;  boolean b6;
t14=0; y=t14;
t15=10; x=t15;
 b6=x<n;
while(b6){
 t16=1; t17=y+t16; y=t17;
 t18=10; t19=x+t18; x=t19;
 b6=x<n;
}

return y;}
}
