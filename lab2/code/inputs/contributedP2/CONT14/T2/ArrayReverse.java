class ArrayReverse{
	public static void main(String[] x){
		System.out.println(new AR().PrintRev(10));
	}
}
class AR{
   int[] n;
   public int PrintRev(int a){
	int i;
	int j; 
	n = new int[a];
	//n.length = a;
	for(i=0;i<a;i=i+1){	
		j=a-i;
		j=j-1;
		n[j]=i+1;
		}
	i=0;
	while(i<a ){
		System.out.println(n[i]);
		i=i+1;
		}
	return 0;
	}
 }
		
	
	


