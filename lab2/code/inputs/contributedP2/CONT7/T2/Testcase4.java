
class Testcase4 {

	public static void main(String[] args) {
		System.out.println(new T4().Fun());
		
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
    arr = new int[6];

    i=0;
    sum=0;
    j = 20;
    
    len = arr.length;
    for(i=0;i< len; i = i+1)
    {
    	arr[i] = j;
    	j = j+20;
    }
    while(i<6) {
    	temp = arr[i];
        sum = sum+ temp;
        i=i+1;
    	}
    return sum;
	}

}