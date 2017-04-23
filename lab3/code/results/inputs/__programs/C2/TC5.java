
class TC5 {
	public static void main(String[] args){
		int a;
		int b;
		boolean c;
		int d;
		int e;
		boolean f;
		int g;
		int h;
		int ret;
		a = 10;
		b = 20;
		c = b < a;
		d = 20;
		e = 10;
		f = e < d;
		g = a + b;
		h = d + e;
		if(c)
			ret = g;
		else
			if(f)
				ret = h;
			else
				ret = 0;
		System.out.println(ret);
	}
}
