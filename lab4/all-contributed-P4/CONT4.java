class TC4 {
	public static void main(String[] args) {
		int t1;
		InMat t0;

		t0 = new InMat();
		t1 = t0.calculate();
		System.out.println(t1);
	}
}

class InMat {
	int[] arr;

	public int calculate() {
		int i;
		int j;
		int ret_res;
		int t14;
		int t36;
		int t15;
		int t37;
		int t16;
		int t38;
		int t17;
		boolean t39;
		int t10;
		int t32;
		int t11;
		int t33;
		int t12;
		int t34;
		int t13;
		int t35;
		int t18;
		int t19;
		int t30;
		int t31;
		int t0;
		int t3;
		int t25;
		int t4;
		int t26;
		int t1;
		int t27;
		int[] t2;
		int t28;
		int t7;
		int t21;
		int t43;
		int t8;
		int t22;
		int t5;
		int t23;
		int t6;
		int t24;
		int t9;
		int t29;
		int t40;
		int t41;
		int t20;
		int t42;

		t0 = 0;
		ret_res = 0;
		t1 = 15;
		t2 = new int[t1];
		arr = t2;
		t5 = 1;
		t4 = arr.length;
		t3 = t4;
		for (i = 0; i < t3; i = i + 1) {
			t18 = i;
			t19 = 2;
			t17 = this.divide(t18, t19);
			t15 = t17;
			t16 = 3;
			/* LOOPINVARIANTCODE? */ t14 = t15 * 3;
			t13 = t14;
			t12 = t13 - i;
			t10 = t12;
			t11 = 1;
			/* LOOPINVARIANTCODE? */ t9 = t10 + 1;
			t21 = arr.length;
			t22 = i;
			t20 = this.divide(t21, t22);
			t7 = t9;
			t8 = t20;
			t23 = t7 - t8;
			t6 = i;
			arr[t6] = t23;
		}
		t26 = 1;
		t25 = arr.length;
		t24 = t25;
		for (i = 0; i < t24; i = i + 1) {
			t27 = arr[i];
			System.out.println(t27);
		}
		t30 = 1;
		t29 = arr.length;
		t28 = t29;
		for (i = 0; i < t28; i = i + 1) {
			t34 = 1;
			t33 = arr.length;
			t32 = t33;
			t31 = 1;
			/* INDEPENDENTITERS? */ for (j = i + 1; j < t32; j = j + 1) {
				t37 = arr[j]; // S1
				t38 = arr[i]; // S2
				t35 = t37;
				t36 = t38;
				/* LOOPINVARIANTCODE? */ t39 = t35 < t36;
				if (t39) {
					t40 = 1;
					t41 = 1;
					/* LOOPINVARIANTCODE? */ ret_res = 1;
				} else {
					t42 = 0;
					ret_res = 0;
				}
			}
		}
		t43 = ret_res;
		return t43;
	}

	public int divide(int num, int denom) {
		int quo;
		int rem;
		boolean t14;
		boolean t15;
		int t16;
		boolean t17;
		boolean t10;
		int t32;
		int t11;
		int t33;
		boolean t12;
		boolean t13;
		boolean t18;
		int t19;
		int t30;
		int t31;
		int t0;
		boolean t3;
		int t25;
		boolean t4;
		boolean t26;
		int t1;
		boolean t27;
		boolean t2;
		int t28;
		boolean t7;
		int t21;
		boolean t8;
		int t22;
		boolean t5;
		int t23;
		int t6;
		int t24;
		int t9;
		boolean t29;
		boolean t20;

		t0 = 0;
		quo = 0;
		t1 = 0;
		rem = 0;
		t6 = 0;
		t5 = num < 0;
		t4 = t5;
		t9 = 0;
		t8 = 0 < num;
		t7 = t8;
		t2 = !t4;
		t3 = !t7;
		t10 = t2 & t3;
		if (t10) {
			t11 = 0;
			quo = 0;
		} else {
			t16 = 0;
			t15 = denom < 0;
			t14 = t15;
			t19 = 0;
			t18 = 0 < denom;
			/* LOOPINVARIANTCODE? */ t17 = t18;
			t12 = !t14;
			t13 = !t17;
			t20 = t12 & t13;
			if (t20) {
				t22 = 0;
				t23 = 1;
				/* LOOPINVARIANTCODE? */ t21 = 0 - 1;
				t24 = 0 - 1;
				quo = 0 - 1;
			} else {
				t25 = num - denom;
				rem = t25;
				t28 = 0;
				/* LOOPINVARIANTCODE? */ t27 = rem < 0;
				t26 = t27;
				t29 = !t26;
				while (t29) {
					t30 = 1;
					t31 = quo + 1;
					quo = t31;
					t32 = rem - denom;
					rem = t32;
					/* LOOPINVARIANTCODE? */ t28 = 0;
					t27 = rem < 0;
					t26 = t27;
					t29 = !t26;
				}

			}
		}

		t33 = quo;
		return t33;
	}

}