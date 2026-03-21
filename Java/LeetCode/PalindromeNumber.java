public class PalindromeNumber {
    public static boolean inPal(int x) {
        int r = 0, y = x;
        while (y != 0) {
            r = (r * 10) + (y % 10);
            y /= 10;
        }
        System.out.println(r + " " + x);
        if (x < 0) r = -r;
        return r == x;
    }
    public static void main(String[] args) {
        System.out.println(inPal(-121));
    }
}