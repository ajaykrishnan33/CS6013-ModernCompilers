
class Testcase2 {
	public static void main(String [] args_){
		System.out.println(new T2().Fun());
	}
}

class T2 extends Testcase2
{
    public int Fun()
    {
        int a; 
        int b;
        b= 5; 
        a= b;
        while(a < 3)
        {

            while(b < 8)
            {
            	a=a+1;
            }
            b=b+1;
        }
    return b;
    }
}