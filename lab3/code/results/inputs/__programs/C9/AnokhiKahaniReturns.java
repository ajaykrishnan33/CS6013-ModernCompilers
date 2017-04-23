class AnokhiKahaniReturns{
    public static void main(String[] a){
        int x;
        x = new RajaBeta().jahangir();
        System.out.println(x);
    }
}

class Baap
{
	int Birbal;
	int Tansen;
	public int expandEmpire()
	{
		boolean tru;
		boolean satya;
		boolean asatya;
		int hushar;
		hushar = 1;
		tru = false;
		satya = false;
		asatya = true;
		Birbal = 8;
		Tansen = 7;
		if(tru)
		{
			if(satya)
				Birbal = Birbal + hushar;
			else
				Birbal = Tansen;
		}
		else
		{
			if(asatya)
				Tansen = Birbal-hushar;
			else
				Tansen = Birbal;
		}
		return hushar;
	}
}

class Maa extends Baap
{	
	Baap Raja;

	public int Rani()
	{
		int findThisConst;
		boolean check1;
		boolean check2;
		int left;
		int right;
		int aageBadh;
		int dahineMud;
		int bayeMud;
		int sidhaHo;
		int p;
		int q;
		int z;
		p = 1729;
		q = 1857;
		Raja = new Baap();
		Raja.Birbal = p;
		Raja.Tansen = q;
		dahineMud = p -q;
		bayeMud  = 1;
		sidhaHo = 0;
		left = 0;
		z = Raja.expandEmpire();
		check1 = dahineMud < sidhaHo;
		aageBadh  = left + bayeMud;
		for(left = 0;check1;left = aageBadh)
		{
			check2 = bayeMud  < left;
			if(check2)
				sidhaHo = dahineMud + bayeMud;
			else
				sidhaHo = z -bayeMud;
			left = aageBadh;
			check1 = left  < sidhaHo;
		}
		return left;
		}
}

class RajaBeta extends Maa
{
	Baap Akbar;
	Maa Jodha;
	public int jahangir()
	{
		int temp1;
		int tmp1;
		int _temp1;
		int tmp_1;
		int temp_1;
		boolean t1;
		boolean _ananya1;
		boolean t_1;
		Akbar = new Baap();
		Jodha = new Maa();

		temp1 = Akbar.expandEmpire();
		_temp1 = Jodha.Rani();
		tmp_1 = 1;
		tmp1= 0;
		t1  = temp1 < _temp1;
		temp_1 =  tmp_1 + _temp1;
		for(tmp1 = 0; t1; tmp1 = temp_1)
		{
			_ananya1 = _temp1 < temp_1;
			while(_ananya1)
			{
				t_1 =  _ananya1 & t1;
				if(t_1)
					temp_1 =  tmp_1 + _temp1;
				else
					temp_1 =  tmp_1 - _temp1;

				_ananya1 = _temp1 < temp_1;
			}
			t1  = temp1 < _temp1;
			temp_1 =  tmp_1 + _temp1;
		}

		return tmp1;

	}

}