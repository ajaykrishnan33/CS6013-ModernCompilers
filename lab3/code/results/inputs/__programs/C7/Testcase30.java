
class Testcase30 {

	public static void main(String[] args) {
		int t1;
		t1=new T4().Fun();
		System.out.println(t1);
		
	}

}

class T4
{   
	public int Fun(){
	int [] arr;
	    int sum;
    int i;
    int j;
    int len;
    int temp;
    int t9;
   
    int t2;
    int t3;
    int t4;
    int t5;
    int t6;

    t9=6;
    arr = new int[t9];
    i=0;
    sum=0;
    j = 20;
    
    len = arr.length;

    for(i=i;i<len; i = i)
    {
    	arr[i] = j;
    	t2=20;
    	t3=j+t2;
    	j = t3;
	temp = arr[i];
	t4=sum+temp;
        sum =t4;
        t5=1;
        t6=i+t5;
	i=t6;
	
    }
    return sum;
	}

}
