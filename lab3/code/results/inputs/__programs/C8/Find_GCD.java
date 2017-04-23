
 class Find_GCD{ 
public static void main(String[] a) 
 { 
 
 Gcd classcount0; 
 int temp0; 
 int temp1;

 int temp2;classcount0= new Gcd(); 
 temp0 =10; 
 temp1 =15;
 temp2 = classcount0.findgcd(temp0,temp1); 
 System.out.println( temp2 ); 
 } 
}
class Gcd { 

 public 
 int findgcd(
 int n1 , 
 int n2){ 
 int forjugaad; 

 Gcd classcount1;

 boolean temp3;
  
 boolean temporary0;
  
 int temp4;
  
 int temp5;classcount1 = this;
 temp3 = classcount1.Compare(n1,n2);while(temp3) 
 { { 
 
  
 temporary0 = n2 < n1;
 if(temporary0)
 {
  
 temp4 = n1 - n2;
 n1 = temp4 ; 
}
 else {

  
 temp5 = n2 - n1;
 n2 = temp5 ;
}
 }classcount1 = this;
 temp3 = classcount1.Compare(n1,n2);}
 return n1; 
 }
 public 
 boolean Compare(
 int num1 , 
 int num2){ 
 int forjugaad; 

 
 boolean retval;
 
 int aux02; 
 boolean temporary1;
  
 int temp6; 
 int temp7;
  
 boolean temporary2; 
 boolean temporary3;
 
  
 boolean temporary4; 
 boolean temporary5; 
 boolean temporary6; 
 boolean temporary7; 
 temporary1 =false;
 retval = temporary1 ;
  
 temp6 =1; 
 temp7 = num2 + temp6;
 aux02 = temp7 ;
  
 temporary2 = num1 < num2;
 if(temporary2)
 { 
 temporary3 =false;
 retval = temporary3 ; 
}
 else {

 
  
 temporary4 = num1 < aux02; 
 temporary5 = ! temporary4;
 if(temporary5)
 { 
 temporary6 =false;
 retval = temporary6 ; 
}
 else {
 
 temporary7 =true;
 retval = temporary7 ;
}
}
 return retval; 
 }
 }
