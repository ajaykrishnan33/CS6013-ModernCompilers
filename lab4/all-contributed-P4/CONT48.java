class Table{
	public static void main(String[] args){
		int t1;
		TTrev t2;
		int t3;
		int t4;
		t2 = new TTrev();
		t3 = t2.printrev(t4);
		System.out.println(t3);
	}
}

class TT{
	public int print(int num){
		int i;
		int temp;		
		int[] arr;
		boolean t5;
		int t6;
		int t7;
		int t8;
		int t9;
		int t10;
		t10 = 0;
		t9 = 11;
		arr = new int[t9];
		
		t8 = 11;
		t5 = i < t8;
               /* INDEPEDENTITERS? */ for(i = 0; i < t5; i = i + 1) //no
		{
			temp = num * i;
			arr[i] = temp;
			t6 = arr[i];
			System.out.println(t6);
			
		}
		return t10;
	}
	
}

class TTrev extends TT{
	public int printrev(int num){
		int j;
		int temp2;
		int[] a;
		int t9;
		int t10;
		int t11;
		int t12;
		int t13;
		TT t14;
		int t15;
		t15 = 11;
		a = new int[t15];
		j=10;
		t12 = 0;
		t9 = j < t12;
		t10 = ! t9;
		while(t10){
			temp2 = num * j;
			a[j] = temp2;
			t11 = a[j];
			System.out.println(t11);
			t13 = 1;
			j = j - t13;
			t9 = j < t12;
			t10 = ! t9;		
		}
		
		t14 = new TT();
		temp2 = TT.print(num);
		return t12;
	}
}
