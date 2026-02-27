// Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
// method can't use the multiplication, modulus, or division operators, The method signature is
// as follows.
// public static boolean isOdd(int n)
import java.util.Scanner;
public class Q06 {
    public static boolean isOdd(int i) {
        return ((i & 1) == 1);
    }
    public static boolean isOddO(int i) {
        return ((i | 1) == i);
    }
    public static boolean isOddX(int i) {
        return ((i ^ 1) == i - 1);
    }
    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int d = blehh.nextInt();
        System.out.println(d + " is odd: " + isOdd(d));
    }
}
