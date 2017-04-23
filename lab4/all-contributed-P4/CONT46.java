class CircleArea{
	public static void main(String[] a){
		//System.out.println(new CA().cal(5));
        int t1;
	int t2;
        CA pyra;
	t2 = 5;	
	pyra = new CA();
	t1= pyra.cal(t2);
	System.out.println(t1);
	}	
}

class CA{
	public int cal(int radius){
		int area;
		int temp;
		int temp2;
     		int i;
		int z;
		z = 0;
		temp = 22;
		area = radius * temp;
		area = area * radius;
		temp2 = 7;
		area = this.div(area,temp2);	
		return area;
	}
	public int div(int num1, int num2){
		int temp;
		int count;
		int ret;
		boolean t3;
		boolean t4;
		int t5;
		count = 0;
		t3 = num1 < num2;
       for(i = 0; i < 5; i = i + 1){
         k = z + i;
        /*LOOPINCARIANTCODE? */ py = k + z; //no
        /*LOOPINCARIANTCODE? */ c = z + 2; // yes
         System.out.println(c);
      }
		if(t3){
			ret =  0;		
		}	
		else{
			temp = num2;
			t4 = temp < num1;
			while(t4){
				temp = temp + num2;
				t5 = 1;
				count = count + t5;			
			}
			ret = count;		
		}
		return ret;
	}
}

