class BinarySearch {
	public static void main(String[] a) {
		int temp2;
		BS temp0;
		int temp1;
		temp0 = new BS();
		temp1 = 20;
		temp2 = temp0.Start(temp1);
		System.out.println(temp2);

	}
}
class BS {
	int[] number;
	int size;
	public int Start (int sz ) {
		int temp11;
		int temp33;
		BS temp12;
		boolean temp34;
		int temp13;
		int temp35;
		boolean temp14;
		int temp36;
		int temp30;
		int temp31;
		int temp10;
		BS temp32;
		int aux01;
		boolean temp19;
		int aux02;
		int temp15;
		BS temp37;
		BS temp3;
		int temp16;
		int temp38;
		BS temp17;
		boolean temp39;
		int temp18;
		BS temp22;
		boolean temp44;
		int temp23;
		int temp45;
		boolean temp24;
		int temp46;
		int temp25;
		int temp47;
		int temp40;
		int temp41;
		int temp20;
		BS temp42;
		int temp21;
		int temp43;
		int temp26;
		BS temp27;
		int temp28;
		boolean temp29;
		int temp6;
		BS temp7;
		int temp4;
		BS temp5;
		int temp8;
		boolean temp9;
		temp3 = this;
		temp4 = temp3.Init(sz);
		aux01 = temp4;
		temp5 = this;
		temp6 = temp5.Print();
		aux02 = temp6;
		temp7 = this;
		temp8 = 8;
		temp9 = temp7.Search(temp8);
		if (temp9) {
			temp10 = 1;
			System.out.println(temp10);
		} else {
			temp11 = 0;
			System.out.println(temp11);
		}
		temp12 = this;
		temp13 = 19;
		temp14 = temp12.Search(temp13);
		if (temp14) {
			temp15 = 1;
			System.out.println(temp15);
		} else {
			temp16 = 0;
			System.out.println(temp16);
		}
		temp17 = this;
		temp18 = 20;
		temp19 = temp17.Search(temp18);
		if (temp19) {
			temp20 = 1;
			System.out.println(temp20);
		} else {
			temp21 = 0;
			System.out.println(temp21);
		}
		temp22 = this;
		temp23 = 21;
		temp24 = temp22.Search(temp23);
		if (temp24) {
			temp25 = 1;
			System.out.println(temp25);
		} else {
			temp26 = 0;
			System.out.println(temp26);
		}
		temp27 = this;
		temp28 = 37;
		temp29 = temp27.Search(temp28);
		if (temp29) {
			temp30 = 1;
			System.out.println(temp30);
		} else {
			temp31 = 0;
			System.out.println(temp31);
		}
		temp32 = this;
		temp33 = 38;
		temp34 = temp32.Search(temp33);
		if (temp34) {
			temp35 = 1;
			System.out.println(temp35);
		} else {
			temp36 = 0;
			System.out.println(temp36);
		}
		temp37 = this;
		temp38 = 39;
		temp39 = temp37.Search(temp38);
		if (temp39) {
			temp40 = 1;
			System.out.println(temp40);
		} else {
			temp41 = 0;
			System.out.println(temp41);
		}
		temp42 = this;
		temp43 = 50;
		temp44 = temp42.Search(temp43);
		if (temp44) {
			temp45 = 1;
			System.out.println(temp45);
		} else {
			temp46 = 0;
			System.out.println(temp46);
		}

		temp47 = 999;

		return temp47;
	}
	public boolean Search (int num ) {
		int temp55;
		BS temp56;
		int temp57;
		int temp58;
		int temp51;
		boolean temp73;
		int temp52;
		boolean temp74;
		int nt;
		int temp53;
		boolean temp54;
		int aux01;
		int medium;
		boolean temp59;
		int temp70;
		BS temp71;
		int temp50;
		boolean temp72;
		boolean temp66;
		boolean temp67;
		boolean temp68;
		boolean temp69;
		int temp62;
		int temp63;
		BS temp64;
		boolean temp65;
		int right;
		int temp48;
		boolean temp49;
		boolean var_cont;
		int left;
		int temp60;
		int temp61;
		boolean bs01;
		temp48 = 0;
		aux01 = temp48;
		temp49 = false;
		bs01 = temp49;
		temp50 = number.length;
		right = temp50;
		temp51 = 1;
		temp52 = right - temp51;
		right = temp52;
		temp53 = 0;
		left = temp53;
		temp54 = true;
		var_cont = temp54;
		while (var_cont) {
			temp55 = left + right;
			medium = temp55;
			temp56 = this;
			temp57 = temp56.Div(medium);
			medium = temp57;
			temp58 = number[medium];
			aux01 = temp58;
			temp59 = num < aux01;
			if (temp59) {
				temp60 = 1;
				temp61 = medium - temp60;
				right = temp61;
			} else {
				temp62 = 1;
				temp63 = medium + temp62;
				left = temp63;
			}
			temp64 = this;
			temp65 = temp64.Compare(aux01, num );
			if (temp65) {
				temp66 = false;
				var_cont = temp66;
			} else {
				temp67 = true;
				var_cont = temp67;
			}
			temp68 = right < left;
			if (temp68) {
				temp69 = false;
				var_cont = temp69;
			} else {
				temp70 = 0;
				nt = temp70;
			}
		}
		temp71 = this;
		temp72 = temp71.Compare(aux01, num );
		if (temp72) {
			temp73 = true;
			bs01 = temp73;
		} else {
			temp74 = false;
			bs01 = temp74;
		}


		return bs01;
	}
	public int Div (int num ) {
		int temp77;
		int temp78;
		boolean temp79;
		int count02;
		int temp75;
		int count01;
		int temp76;
		int temp80;
		int temp81;
		int aux03;
		int temp82;
		int temp83;
		temp75 = 0;
		count01 = temp75;
		temp76 = 0;
		count02 = temp76;
		temp77 = 1;
		temp78 = num - temp77;
		aux03 = temp78;
		temp79 = count02 < aux03;
		while (temp79) {
			temp80 = 1;
			temp81 = count01 + temp80;
			count01 = temp81;
			temp82 = 2;
			temp83 = count02 + temp82;
			count02 = temp83;
			temp79 = count02 < aux03;
		}


		return count01;
	}
	public boolean Compare (int num1, int num2 ) {
		boolean temp88;
		boolean temp89;
		boolean temp84;
		int temp85;
		int temp86;
		boolean temp87;
		boolean temp91;
		boolean temp92;
		int aux02;
		boolean retval;
		boolean temp90;
		temp84 = false;
		retval = temp84;
		temp85 = 1;
		temp86 = num2 + temp85;
		aux02 = temp86;
		temp87 = num1 < num2;
		if (temp87) {
			temp88 = false;
			retval = temp88;
		} else {
			temp89 = num1 < aux02;
			temp90 = !temp89;
			if (temp90) {
				temp91 = false;
				retval = temp91;
			} else {
				temp92 = true;
				retval = temp92;
			}
		}


		return retval;
	}
	public int Print ( ) {
		int temp99;
		int temp95;
		int temp96;
		int temp97;
		int temp98;
		int j;
		int temp93;
		boolean temp94;
		temp93 = 1;
		j = temp93;
		temp94 = j < size;
		while (temp94) {
			temp95 = number[j];
			System.out.println(temp95);
			temp96 = 1;
			temp97 = j + temp96;
			j = temp97;
			temp94 = j < size;
		}
		temp98 = 99999;
		System.out.println(temp98);

		temp99 = 0;

		return temp99;
	}
	public int Init (int sz ) {
		int temp102;
		int temp113;
		int temp101;
		int temp112;
		int[] temp100;
		int temp111;
		int temp110;
		int aux01;
		int j;
		int k;
		int aux02;
		int temp109;
		int temp108;
		int temp107;
		int temp106;
		int temp105;
		boolean temp104;
		int temp103;
		int temp114;
		size = sz;
		temp100 = new int[sz];
		number = temp100;
		temp101 = 1;
		j = temp101;
		temp102 = 1;
		temp103 = size + temp102;
		k = temp103;
		temp104 = j < size;
		while (temp104) {
			temp105 = 2;
			temp106 = temp105 * j;
			aux01 = temp106;
			temp107 = 3;
			temp108 = k - temp107;
			aux02 = temp108;
			temp109 = aux01 + aux02;
			number[j] = temp109;
			temp110 = 1;
			temp111 = j + temp110;
			j = temp111;
			temp112 = 1;
			temp113 = k - temp112;
			k = temp113;
			temp104 = j < size;
		}

		temp114 = 0;

		return temp114;
	}
}
