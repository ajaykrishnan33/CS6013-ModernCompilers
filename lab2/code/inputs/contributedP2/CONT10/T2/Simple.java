class Simple
{
	public static void main(String[] abc) {
	    System.out.println(new cond().tx(1));
    }
}
class cond
{
	    public int tx(int z){
	        int g;
            if(z < 1){
              g = 0;
             } else g=1;
             return g;
        }
        
}
