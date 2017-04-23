class DumbDoer{
	public static void main(String[] args){
		System.out.println(new Foobar().init(10));
	}
}
class Foobar{
	int[] arr;
	public int init(int x){
		int i;
		int j;
		int sum;
		for(i=1;i<x;i=i+1){
			sum=0;
			for(j=i;j<x;j=j+1){
				sum = (sum*10) + j;
			}
			System.out.println(sum);
		}
		return 0;
	}
}