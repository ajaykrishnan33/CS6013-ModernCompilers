class Testcase40{
public static void main(String [] args_){
  int temp_fun0;
  temp_fun0=new T2().Fun( );
System.out.println(temp_fun0);
}
}

class T2 extends Testcase40 {
 
	 public int Fun( ){     
		 int temp_int0;
		 int temp_int1;
		 boolean temp_bool0;
		 int temp_int2;
		 boolean temp_bool1;
		 int temp_int3;
		 int temp_int4;
		 int temp_int5;
		 int temp_int6;
		 int a;
		 int b;    
		 temp_int0=5;
		 b=temp_int0; 
		 a=b;
		 temp_int1=3;
		 temp_bool0=a < temp_int1;
		 while(temp_bool0){ 
			 temp_int2=8;
			 temp_bool1=b < temp_int2;
			 while(temp_bool1){
				 temp_int3=1;
				 temp_int4=a + temp_int3;
				 a=temp_int4;
				 } 
			 temp_int2=8;
			 temp_bool1=b < temp_int2;
	  		 temp_int5=1;
			 temp_int6=b + temp_int5;
			 b=temp_int6;
			 temp_int1=3;
			 temp_bool0=a < temp_int1;
	 		}
	 return b;
	 }

}