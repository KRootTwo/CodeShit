/*
Write a recursive method in Java that computes the factorial of a given integer.
*/

public class A03Q07 {
    public static int fact(int x) {
        if (x == 0) {
            return 1;
        }
        return x * fact(x - 1);
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}