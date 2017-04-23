class Pyramids {
    public static void main(String[] args) {
        BuildPyramid a;
        int b;
        int c;
        a = new BuildPyramid();
        c = 20;
        /*INLINE*/b = a.Display(c);	         
    }
}

class BuildPyramid{

    public int Display(int num){	
        int i;
        int j;
        int one;
        int zero;
        int a;
        a = 20;
        zero = 0;
        one = 1;
        for ( i = 1; i <a; i=i+one) {
            for ( j = 1; j < a; j=j+one) {
                System.out.println(zero);
            }
        }
        return zero;
    }
}


