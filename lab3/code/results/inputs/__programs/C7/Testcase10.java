class Testcase10 {

    public static void main(String [ ] args) {

        int number;
        int count;
        int sum;
        boolean t1;
        boolean t2;
        int t7;
        int t8;
        int t9;
        int t10;
        number = 2;
        count = 1000;
        sum = 0;
        t7 = 0;
        t1 = t7 < count;
        while ( t1) {
            t2 = new Test13().isPrimeNumber(number);
            if (t2) {
                t8 = 1;
                sum = sum + number;
                count = count - t8;
            } else {

            }
            t9 = 1;
            System.out.println(number);
            number = number + t9;
            t10 = 0;
            t1 = t10 < count;
        }
        System.out.println(sum);
    }
}

class Test13 extends Testcase10 {
    public boolean isPrimeNumber(int number) {
        int i;
        boolean t3;
        int t4;
        boolean t5;
        int t11;
        int t12;
        int t13;
        int t14;
        boolean t16;
        t16 = true;
        i = 2;
        t3 = i < number;
        for (i = 2; t3; i = i) {
            t11 = 1000;
            t5 = t11 < i;
            if (t5) {
                t16 = false;
            } else {
                t13 = 2;
                t12 = number - t13;
                t3 = i < t12;
                t14 = 1;
                i = i + t14;
                t16 = true;
            }
        }
        return t16;
    }
}

