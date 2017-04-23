/*Program parsed successfully*/
class p3{ 
public static void main (String[] args){ 
	boolean  temp0;
	temp0 =new notExp().method1();
	System.out.println(temp0);
}
}

class notExp{ 
	public boolean  method1( ) { 
		int int_0;
		int int_1;boolean temp1;
		boolean bool0;
		int_0 = 1;
		int_1 = 2;
		temp1 =int_0<int_1;
		bool0 = !temp1;
		return bool0;
}
} 
