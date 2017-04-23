class Arr
{
	public static void main(String[] a) {
	    System.out.println(new art().t3(2,3));
    }
}
class art
{
	    public int t3(int x, int y) {
	    int[] d;
	    d = new int[20];
        d[(x+y)] = 67;
        d[x]= 45;
        d[1] = 69;
        System.out.println((d[5]) + (d[x]));
        System.out.println(d[(y-x)]);
        return 1;
        }
}
