class P1{ 
public static void main (String[] args){ 
	boolean temp0;int sum;int i;int k;
	temp0 = true;
	sum = 0;
	i = 9;
	while (temp0) {
            /*LOOPINVARIANTCODE?*/sum = sum + i;
            /*LOOPINVARIANTCODE?*/k = 1;
            /*LOOPINVARIANTCODE?*/i = i + k;
            System.out.println(i);
	    /*LOOPINVARIANTCODE?*/temp0 = false;
        }
	System.out.println(temp0);
}
}
