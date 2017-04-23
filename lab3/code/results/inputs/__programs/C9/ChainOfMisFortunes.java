class ChainOfMisFortunes{
    public static void main(String[] a){
        int x;
        x = new ChainRevealed().IamFine();
        System.out.println(x);
    }
}

class ChainRevealed
{
	int [] arr;

	public int Initialize()
	{
		int findThisConst;
		int i;
		int size;
		int inc;
		int one;
		int ihaveNotchanged;
		boolean check;
		size =10;
		one = 1;
		findThisConst  = 4;
		ihaveNotchanged = findThisConst;
		i=0;
		inc = i + one;
		arr = new int [size];
		check  = i< size;
		for(i=0;check;i=inc)
		{	
			inc  = i+ one;
			arr[i] = inc;
			findThisConst  = ihaveNotchanged;
			check = inc < size;
		}

		return one;
	}

	public int IamFine()
	{
		int findThisConst;
		int two;
		int j;
		int size;
		boolean check;
		boolean check2;
		int one;
		int arrEle;
		int zero;
		j = 0;
		zero = 0;
		two  = 2;
		one = this.Initialize();
		size  = arr.length;
		check = j  < size;
		one = 1;
		findThisConst = 4;
		while(check)
		{
			arrEle = arr[j];
			check2 = arrEle < zero;
			if(check2)
				findThisConst = one  + one;
			else
				findThisConst = two + two;	

			j = j + one;
			check  = j < size;
		}
		return one;
	}
}