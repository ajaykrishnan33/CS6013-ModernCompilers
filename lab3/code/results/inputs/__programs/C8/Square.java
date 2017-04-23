
 class Square{ 
public static void main(String[] a) 
 { 
 
 arraysquare classcount0; 
 int tempo0; 
 int tempo1; 
 int tempo2; 
 int tempo3;

 int tempo4;classcount0= new arraysquare(); 
 tempo0 =6; 
 tempo1 =15; 
 tempo2 =31; 
 tempo3 =56;
 tempo4 = classcount0.sqr(tempo0,tempo1,tempo2,tempo3); 
 System.out.println( tempo4 ); 
 } 
}
class arraysquare { 

 public 
 int sqr(
 int num0 , 
 int num1 , 
 int num2 , 
 int num3){ 
 int forjugaad; 

 
 int sum;
 
 int j;
 
 int[]  anArray; 
 int tempo5; 
 int tempo6; 
 int tempo7; 
 int[] tempo8; 
 int tempo9;
  
 int tempo10; 
 int tempo11;
  
 int tempo12; 
 int tempo13;
  
 int tempo14; 
 int tempo15;
  
 int tempo16;
  
 int tempo17; 
 boolean temporary0;
  
 int tempo18; 
 boolean temporary1;
  
 int tempo19; 
 int tempo20; 
 int tempo21;
 int tempo22;
  
 int tempo23; 
 int tempo24; 
 int tempo25;
 int tempo26; 
 tempo5 =0;
 j = tempo5 ; 
 tempo6 =10;
 sum = tempo6 ; 
 tempo7 =5; 
 tempo8 = new int[tempo7];
 anArray = tempo8 ; 
 tempo9 =0;
  
 tempo10 = num0 * num0;
 anArray [tempo9]=tempo10 ; 
 tempo11 =1;
  
 tempo12 = num1 * num1;
 anArray [tempo11]=tempo12 ; 
 tempo13 =2;
  
 tempo14 = num2 * num2;
 anArray [tempo13]=tempo14 ; 
 tempo15 =3;
  
 tempo16 = num3 * num3;
 anArray [tempo15]=tempo16 ;
  
 tempo17 =3; 
 temporary0 = j < tempo17;while(temporary0) 
 { { 
 
  
 tempo18 =15; 
 temporary1 = sum < tempo18;
 if(temporary1)
 {
  
 tempo19 =1; 
 tempo20 = j + tempo19;
 j = tempo20 ; 
}
 else {
 
 tempo21 =20;
 sum = tempo21 ;
}
 tempo22 = anArray[j]; 
 System.out.println( tempo22 );
  
 tempo23 =1; 
 tempo24 = j + tempo23;
 j = tempo24 ;
 }
  
 tempo17 =3; 
 temporary0 = j < tempo17;} 
 System.out.println( sum ); 
 System.out.println( j ); 
 tempo25 =3;
 tempo26 = anArray[tempo25];
 return tempo26; 
 }
 }
