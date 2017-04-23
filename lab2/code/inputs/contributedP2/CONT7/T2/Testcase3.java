
class Testcase3 {
	public static void main(String []args) {
		System.out.println(new T3().Fun(10));
	}
	
}
class T3 {

	int n3;
	int n2;
	int i;
	int n1;
	
	
	
	public int Fun(int count)
{n1 = 0;
n2 = 1;
		for(i=2;i<count;i=i+1)//loop starts from 2 because 0 and 1 are already printed    
{    
 n3=n1+n2;        
 n1=n2;    
 n2=n3;    
} 
return n3;

}
	} 