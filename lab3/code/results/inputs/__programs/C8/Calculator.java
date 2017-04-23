
 class Calculator{ 
public static void main(String[] a) 
 { 
 
 My_Calculation classcount0; 
 int temp0; 
 int temp1;

 int temp2;classcount0= new My_Calculation(); 
 temp0 =40; 
 temp1 =37;
 temp2 = classcount0.Start(temp0,temp1); 
 System.out.println( temp2 ); 
 } 
}
class Calculation { 

 
 int z;
 public 
 int addition(
 int x , 
 int y){ 
 int forjugaad; 

  
 int temp3; 
 int temp4;
  
 temp3 = x + y;
 z = temp3 ; 
 System.out.println( z ); 
 temp4 =0;
 return temp4; 
 }
 public 
 int Subtraction(
 int x , 
 int y){ 
 int forjugaad; 

  
 int temp5; 
 int temp6;
  
 temp5 = x - y;
 z = temp5 ; 
 System.out.println( z ); 
 temp6 =0;
 return temp6; 
 }
 }
 class My_Calculation extends Calculation { 

 public 
 int multiplication(
 int x , 
 int y){ 
 int forjugaad; 

  
 int temp7;
  
 temp7 = x * y;
 z = temp7 ;
 return z; 
 }
 public 
 int Start(
 int a , 
 int b){ 
 int forjugaad; 

 
 int x;
 
 int t1;
 
 int t2; 
 int temp8;
 
 
  
 boolean temporary0; 
 boolean temporary1;
 
  
 boolean temporary2; 
 boolean temporary3; 
 boolean temporary4; 
 int temp9; 
 int temp10;
 Calculation classcount1;

 int temp11;
 Calculation classcount2;

 int temp12;
 My_Calculation classcount3;

 int temp13; 
 int temp14;
 t1 = a ;
 a = b ;
 b = t1 ; 
 temp8 =10;
 x = temp8 ;
 t2 = a ;
 a = b ;
 b = t2 ;
 
 
  
 temporary0 = a < b; 
 temporary1 = ! temporary0;
 
  
 temporary2 = b < a; 
 temporary3 = ! temporary2; 
 temporary4 = temporary1 & temporary3;
 if(temporary4)
 { { 
  
 temp9 =100;
 x = temp9 ;
 } 
}
 else {
 
 temp10 =10;
 x = temp10 ;
}classcount1= new Calculation();
 temp11 = classcount1.addition(a,b);
 x = temp11 ;classcount2= new Calculation();
 temp12 = classcount2.Subtraction(a,b);
 x = temp12 ;classcount3 = this;
 temp13 = classcount3.multiplication(a,b);
 x = temp13 ; 
 temp14 =10;
 x = temp14 ;
 return x; 
 }
 }
