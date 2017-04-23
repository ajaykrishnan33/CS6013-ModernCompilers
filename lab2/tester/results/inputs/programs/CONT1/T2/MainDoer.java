class MainDoer{
	public static void main(String[] args){
		System.out.println(((new AuxDoer().printArray(new AuxDoer().getArray())).length)+26);
	}
}
class AuxDoer extends SupAuxDoer{	
	public int[] printArray(int[] arr){
		int[] y;
		int i;
		y = arr;
		i = 0;
		while(i<(arr.length)){
			System.out.println(i);
			i=i+1;
		}
		return arr;
	}
	public int[] getArray(){
		int[] x;
		int i;
		x = new int[100];
		for(i=0;i<100;i=i+1){
			x[i]=i;
		}
		return x;
	}
}
class SupAuxDoer{

}