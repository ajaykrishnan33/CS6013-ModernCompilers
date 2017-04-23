class Calculator{
    public static void main(String[] a){
	System.out.println(new My_Calculation().Start(40,37));
    }
}


class Calculation {
   int z;
	
   public int addition(int x, int y) {
      z = x + y;
      System.out.println(z);
	return 0;
   }
	
   public int Subtraction(int x, int y) {
      z = x - y;
      System.out.println(z);
	return 0;
   }
}

class My_Calculation extends Calculation {
   public int multiplication(int x, int y) {
      z = x * y;
      //System.out.println(z);
	return z;
   }

   public int Start(int a, int b)
   {
      int x;

      
      x=new Calculation().addition(a, b);
      x=new Calculation().Subtraction(a, b);
     x=this.multiplication(a, b);
	return x;
   }
}
