/*
Write a recursive method in Java which, given real value x and a positive integer n, returns
the value of xn.
*/

public class A03Q08 {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * pow(x, n - 1);
    }
    public static void main(String[] args) {
        System.out.println(pow(3, 3));
    }
}