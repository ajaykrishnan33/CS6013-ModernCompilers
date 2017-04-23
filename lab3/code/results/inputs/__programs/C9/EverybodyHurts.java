class EverybodyHurts{
    public static void main(String[] a){
        int x;
        x = new EverybodyIsShellfish().EverybodyCries();
        System.out.println(x);
    }
}

class youKnowWhy
{
	int passing;
	public int setYourValues()
	{
		int stillSingle;
		passing = 1;
		stillSingle  = passing;
		return stillSingle;
	}
}


class EverybodyIsShellfish extends youKnowWhy
{
	youKnowWhy reason1;
	public int EverybodyCries()
	{
		int findthisConst;
		int x;
		int i;
		int t1;
		int t2;
		int t3;
		boolean check1;
		boolean check2;
		x = 9;
		reason1 = new youKnowWhy();
		t1 = 2;
		t2 = 3;
		t3 = 5;
		check1 = t1 < t2;
		if(check1)
		{
			check2  = t3 < x;
			while(check2)
			{
				t3 = t3 + t2;
				check2  = t3 < x;
			}
		}
		else
		{
			check2 = t1 < x;
			i = 0;
			for(i=0;check2;i=x)
			{
				x = x-t1;
				i=x;
				check2 = t1 < x;
			}
		}

		findthisConst = reason1.setYourValues(); 
		// findthisConst = reason1.passing;
		reason1.passing = x;
		return x;
	}
}
