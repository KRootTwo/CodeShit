public class nameNtimes {
    public static void nl() {
        System.out.println();
    }
    public static void pNameNTimes(String s, int n) {
        if ( n == 0) {
            return;
        }
        System.out.println(s);
        pNameNTimes(s, n - 1);
    }

    public static void main(String[] args) {
        // pNameNTimes("GitGud", 20);

    }
}
