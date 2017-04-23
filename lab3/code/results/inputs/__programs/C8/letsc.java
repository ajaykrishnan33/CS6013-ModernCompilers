
 class letsc{ 
public static void main(String[] a) 
 { 
 
 Fac classcount0; 
 int tempo0;

 int tempo1;classcount0= new Fac(); 
 tempo0 =5;
 tempo1 = classcount0.ComputeFac(tempo0); 
 System.out.println( tempo1 ); 
 } 
}
class Fac { 

 public 
 int ComputeFac(
 int num){ 
 int forjugaad; 

 
 int num_aux;
 
 int i;
 
 int j; 
 int tempo2; 
 int tempo3; 
 int tempo4; 
 int tempo5;
  
 int tempo6; 
 boolean temporary0;
  
 int tempo7; 
 int tempo8;
  
 int tempo9; 
 boolean temporary1; 
 int tempo10;
 
 Fac classcount1;
  
 int tempo11; 
 int tempo12;

 int tempo13; 
 int tempo14; 
 int tempo15; 
 tempo2 =10;
 i = tempo2 ; 
 tempo3 =1;
 num_aux = tempo3 ; 
 tempo4 =5;
 j = tempo4 ;
forjugaad=0;
 
 tempo5 =5;i=tempo5;

  
 tempo6 =10; 
 temporary0 = i < tempo6;for(i=tempo5;temporary0; forjugaad=forjugaad) 
 { 
 { 
 
  
 tempo9 =1; 
 temporary1 = num < tempo9;
 if(temporary1)
 { 
 tempo10 =1;
 num_aux = tempo10 ; 
}
 else {

 classcount1 = this;
  
 tempo11 =1; 
 tempo12 = num - tempo11;
 tempo13 = classcount1.ComputeFac(tempo12); 
 tempo14 = num * tempo13;
 num_aux = tempo14 ;
}
 }
  
 tempo7 =1; 
 tempo8 = i + tempo7;
i=tempo8;
  
 tempo6 =10; 
 temporary0 = i < tempo6;
 } 
 tempo15 =1;
 num_aux = tempo15 ;
 return num_aux; 
 }
 }
