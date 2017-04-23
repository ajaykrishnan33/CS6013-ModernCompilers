class CircleArea{
	public static void main(String[] a){
		System.out.println(new CA().cal(5));
	}	
}

class CA{
	public int cal(int radius){
		int area;
		area = radius * 22;
		area = area * radius;
		area = this.div(area,7);	
		return area;
	}
	public int div(int num1, int num2){
		int temp;
		int count;
		int ret;
		count = 0;
		if(num1 < num2){
			ret =  0;		
		}	
		else{
			temp = num2;
			while(temp < num1){
				temp = temp + num2;
				count = count + 1;			
			}
			ret = count;		
		}
		return ret;
	}
}

