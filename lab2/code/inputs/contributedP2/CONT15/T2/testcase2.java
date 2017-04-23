//Testcase for Array and Array allocation expression
class testcase2 {
public static void main(String[] args) {
	System.out.println(new arr().array_chk(7));
}
}

class arr {
	int[] myIntarry;int res;int res1;int res2;
	public int array_chk(int val) {
		myIntarry = new int[2+1];
		myIntarry[0] = val+6;
		myIntarry[1] = 5;
		myIntarry[2] = 9;
		res = myIntarry[0];
		res1 =  myIntarry[1];
		res2 =  myIntarry[2] ;
		res = res +res1;
		res = res - 2;
		return res;
	}
}
