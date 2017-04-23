class pyramid2{
public static void main(String[] a){
Pyra f0; int t0; int t1;
f0=new Pyra();t0=6; t1=f0.makePyra(t0);
System.out.println(t1);
}
}
class Pyra{
public int  makePyra(int  n){
int  nlimit;
int  i;
int  j;
int  limit;
int t2;int t3; int t4; int t5;int t6; int t7; int t8; int t9; int t10;  boolean b1; int t11; int t12;  boolean b0;int t13;
t2=1; i=t2;
t3=1; j=t3;
 t4=1; t5=n+t4; nlimit=t5;
 b0=i<nlimit;
while(b0){
t6=1; j=t6;
 t7=1; t8=i+t7; limit=t8;
 b1=j<limit;
while(b1){

System.out.println(j);
 t9=1; t10=j+t9; j=t10;
 b1=j<limit;
}
 t11=1; t12=i+t11;
 i=t12;
 b0=i<nlimit;
}
t13=0;
return t13;}
}
