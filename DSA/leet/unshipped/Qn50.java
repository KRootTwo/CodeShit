public class Qn50 {
    public static double myPow(double x, int n) {
        double res = 1;
        boolean neg = false;
        if (n < 0) {
            n = -(n);
            neg = true;
        }

        while (n > 0) {
            if (n % 2 != 0) {
                res *= n;
                n -= 1;
            }

        }


        
        return res;
    }
    public static void main(String[] args) {
        
    }
}