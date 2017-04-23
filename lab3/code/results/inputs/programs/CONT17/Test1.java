class Test1{
	public static void main(String[] args){
		int x;
		int y;
		int z;
		int r;
		int doo;
		int[] arr;
		int temp;
		int j;
		int temp38;
		boolean temp39;
		boolean fox;
		boolean b;
		int temp41;
		int temp42;
		int size;
		AuxTest1 aut;
		int porche;
		int i;
		int p;
		int m;
		int k;

		size=10;
		p = 1;
		x = 1;
		temp39 = p<size;
		while(temp39){
			for(m=0;m<size;m=m+p){
				System.out.println(p);
				b = true;
				k = 5;
				j = 5;
				for(i=0;i<k;i=i+p){
					b = j < i;
					if(b){
						j = 3;
					}
					else{
						j = 4;
					}
				}
			}
			System.out.println(p);
			p = p + x;
			temp39 = p<size;
			temp39 = !temp39;
		}
		temp = 30;
		fox = !temp39;
		if(fox){
			temp = 25;
		}
		else{
			temp = 45;
		}
		arr = new int[temp];
		x = 4;
		y = 5;
		temp38 = 0;
		j = temp38;
		size = 20;
		temp39 = j < size;
		temp41 = 1;
		temp38 = temp38 + temp41;
		aut = new AuxTest1();
		porche = aut.Init(size);
		System.out.println(y);
		System.out.println(porche);
	}
}

class AuxTest1{
	public int Init(int x){
		int temp;
		int i;
		int size;
		int p;
		boolean cond;
		size=10;
		p = 1;
		for(i=0;i<size;i=i+p){
			System.out.println(p);
		}
		temp = 0;
		i = temp;
		return i;
	}
}