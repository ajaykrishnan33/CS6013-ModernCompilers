class JarOfHearts{
    public static void main(String[] a){
        int pyar1;
        int pyar2;
        int x;
        pyar1 = 0;
        pyar2 = 1000;
        x = new didYou().findThisConst(pyar1, pyar2);
        System.out.println(x);
    }
}

class didYou
{
	int thisIsConst;
	public int findThisConst(int x, int y)
	{
		boolean tru;
		thisIsConst = 2;
		tru = x < y;
		while(tru)
		{
			x = x + thisIsConst;
			tru = x < y;
		}
		return thisIsConst;
	}
}