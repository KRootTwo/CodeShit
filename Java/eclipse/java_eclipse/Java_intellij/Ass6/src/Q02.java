public class Q02 {
    public static int countDigits(int n) {
        int c = 0;
        while (n != 0) {
            n /= 10;
            c++;
        }
        return c;
    }

    public static int power(int a, int b) {
        int r = 1;
        for (int i = 1; i <= b; i++) {
            r *= a;
        }
        return r;
    }

    public static boolean isArmstrong(int n) {

    }
}
