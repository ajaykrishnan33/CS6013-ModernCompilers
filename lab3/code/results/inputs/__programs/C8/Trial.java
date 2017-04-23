
 class Trial{ 
public static void main(String[] a) 
 { 
 
 First classcount0; 
 int tempo0;

 int tempo1;classcount0= new First(); 
 tempo0 =15;
 tempo1 = classcount0.start(tempo0); 
 System.out.println( tempo1 ); 
 } 
}
class First { 

 public 
 int start(
 int x){ 
 int forjugaad; 

 
 int y;
 
 int z;
 
 int sum; 
 int tempo2; 
 int tempo3; 
 int tempo4;
  
 boolean temporary0;
  
 int tempo5; 
 int tempo6; 
 int tempo7;
  
 boolean temporary1;
  
 int tempo8; 
 int tempo9;
  
 int tempo10; 
 int tempo11; 
 tempo2 =0;
 y = tempo2 ; 
 tempo3 =1;
 sum = tempo3 ;
forjugaad=0;
 
 tempo4 =1;y=tempo4;

  
 temporary0 = y < x;for(y=tempo4;temporary0; forjugaad=forjugaad) 
 { 
 { 
 
forjugaad=0;
 
 tempo7 =1;z=tempo7;

  
 temporary1 = z < x;for(z=tempo7;temporary1; forjugaad=forjugaad) 
 { 
 { 
 
  
 tempo10 = sum + z;
 sum = tempo10 ;
 }
  
 tempo8 =2; 
 tempo9 = z + tempo8;
z=tempo9;
  
 temporary1 = z < x;
 } 
 tempo11 =1;
 sum = tempo11 ;
 }
  
 tempo5 =2; 
 tempo6 = y + tempo5;
y=tempo6;
  
 temporary0 = y < x;
 }
 return sum; 
 }
 }
