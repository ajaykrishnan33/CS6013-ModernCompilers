class Negate
{
	public static void main(String[] abc) {
	    System.out.println(new neg().t2(true));
    }
}
class neg
{
        public boolean t1(boolean u, boolean v){
            return !(u & v);
        }
	    public int t2(boolean a){
	        boolean b;
            boolean c;
            int i;
            i =0;
            b = false;
            c = true;
            if(!(this.t1(!b,a))){
             if(a & (c & !b)){
                i = 1;
                //return i;
             } else i =2;
            } else i = 0;
            return i;
        }
        
}
