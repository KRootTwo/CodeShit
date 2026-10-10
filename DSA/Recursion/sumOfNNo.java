public class sumOfNNo {
    // first n ints
    public static int  sumN(int n, int s) {
        if (n == 0) return s;
        s += n;
        return sumN(--n, s);
    }
    public static void main(String[] args) {
        int sum = 0;
        System.out.println(sumN(9, sum));
    }
}
