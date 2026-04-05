public class gcd_hcf {
    public static int gcf1(int n1, int n2) {
        int g = 1;
        for (int i = 0; i < Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                g = i;
            }
        }
        return g;
    }
    public static int gcf2(int n1, int n2) {
        int g = 1;
        for (int i = Math.min(n1, n2); i >= 1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                g = i;
                break;
            }
        }
        return g;
    }
    public static void main(String[] args) {
        
    }
}