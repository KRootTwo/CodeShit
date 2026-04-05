public class basics {
    public static void nNames(String s, int n) {
        if (n == 0) {
            return;
        }
        System.out.println(s);
        nNames(s, n - 1);
    }
    public static void main(String[] args) {
        nNames("Fuck Nigga", 28);
    }
}