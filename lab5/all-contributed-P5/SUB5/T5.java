class T5 {
    public static void main (String [] args) {
        int temp1;
        int temp2;
        int temp3;
        temp1=4;
        temp2=5;

        temp3=new T51().multiply(temp1,temp2);
        System.out.println(temp3);
    }
}
class T51 extends T5
{

    public int multiply(int x, int y)
    {

        int n;
        int temp5;
        n=0;
        temp5=1;
        y = y-temp5;
        /*INLINE*/n = this.multiply(x, y);
        n = x + n;
        return n;
    }
}


class B1 extends T51
{



    public int f1(int y)
    {	int temp3;
        int temp4;
        int temp5;
        int temp6;
        int temp7;
        int sum;
        int i;
        T51 x;
        sum=0;

        temp4=40;
        for(i=sum;y<temp4;i=y)
        {temp6=sum+i;
            sum = temp6;
            temp7=1;
            temp5 = y+temp7;
            y=temp5;
        }
        /*INLINE*/i=new T51().multiply(temp4,sum);

        return i;
    }

}


