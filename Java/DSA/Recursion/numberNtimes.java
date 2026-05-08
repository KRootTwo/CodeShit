public class numberNtimes {
    public static void pTillN(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n--);
        pTillN(n);
    }
    public static void pFromN(int i, int n) {
        if (i > n) return;
        System.out.println(i++);
        pFromN(i, n--);
    }
    public static void main(String[] args) {
        pTillN(3);
        nl.nl();
        pFromN(0, 9);
    }
}
