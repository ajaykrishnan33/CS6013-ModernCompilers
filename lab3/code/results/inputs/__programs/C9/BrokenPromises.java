class BrokenPromises{
    public static void main(String[] a){
        int x;
        boolean theTruth;
        x = 90;
        theTruth = new DoesGodExist().testOfGod(x);
        System.out.println(theTruth);
    }
}

class DoesGodExist
{
	boolean answer;

	public boolean testOfGod(int faith)
	{
		boolean temp;
		boolean atheist;
		boolean theist;
		int charso;
		boolean findThisConst;
		faith  = this.RandomFaith(faith);
		theist = false;
		atheist = false;
		charso = 400;
		findThisConst = true; 
		temp = faith < charso ;
		temp  = temp & findThisConst;
		answer = !temp;
		if(answer)
			theist = findThisConst & atheist;
		else	
			atheist = findThisConst & theist;

		theist =  findThisConst & atheist;
		atheist  = findThisConst & theist;
		return findThisConst;
	}


	public int RandomFaith(int x)
	{
		int faith;
		int rary1;
		int rary2;
		rary2 = x * x;
		rary1  =  x - rary2;
		rary2 = x  -  rary1;
		rary1 = x + rary2;
		faith = rary2;
		return faith;
	}
}