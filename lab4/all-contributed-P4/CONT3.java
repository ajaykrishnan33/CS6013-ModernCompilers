class TC3 {
	public static void main(String[] args){
		C31 c1;
		C32 c2;
		int x;
		int y;
		int t;
		boolean b;
		boolean c;
		int temp;
		c1 = new C31();
		c2 = new C32();
		t = 10;
		x = c1.setVal(t);
		t = 120;
		b = c1.checkVal(t);
		t = 1;
		y = c2.setVal(t);
		t = 0;
		c = c2.checkVal(t);
		temp = x;
		for(temp = 1; temp < 20;temp = temp + 1){
			/* LOOPINVARIANTCODE? */ t = 2 * y;
			x = temp - t;
			System.out.println(x);
			/* LOOPINVARIANTCODE? */ b = temp < y;
			if(b){
				y = x - 1;
			}else{
				/* LOOPINVARIANTCODE? */ y = x - 5;
			}
		}
		System.out.println(y);
	}
}

class C31{

	int x;

	public int setVal(int i) {
		// TODO Auto-generated method stub
		x = i;
		return x;
	}

	public boolean checkVal(int i) {
		// TODO Auto-generated method stub
		boolean _ret;
		boolean temp;
		temp = x < i;
		if(temp)
			_ret = true;
		else
			_ret = false;
		return _ret;
	}
	
}

class C32 extends C31{

	int y;
	
	public int setVal(int i) {
		// TODO Auto-generated method stub
		y = i;
		return y;
	}
	
	public boolean checkVal(int i) {
		// TODO Auto-generated method stub
		boolean _ret;
		boolean temp;
		temp = y < i;
		if(temp)
			_ret = true;
		else
			_ret = false;
		return _ret;
	}
}
