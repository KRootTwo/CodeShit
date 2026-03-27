// Write a java method to calculate the sum of digits of a given number until the number is a
// single digit. The method signature is as follows.
// public static int sum_Of_Digits(int n)
public class Q05 {
    public static int sumD(int n) {
        int s = 0;
        while (n != 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
    public static int sum_Of_Digits(int n) {
        int s = sumD(n);
        while (Integer.toString(s).length() != 1) {
            s = sumD(s);
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Sum of Digits: " + sum_Of_Digits(9294));
    }
}
