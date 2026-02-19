// Write a java program to check whether a number is a spy number or not.
import java.util.Scanner;
public class Q03 {
    public static int sumD(int n) {
        int s = 0;
        while (n != 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
    public static int proD(int n) {
        int p = 1;
        while (n != 0) {
            p *= n % 10;
            n /= 10;
        }
        return p;
    }
    public static boolean isSpy(int n) {
        return sumD(n) == proD(n);
    }
    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        System.out.print("Enter an int: ");
        if (isSpy(blehh.nextInt())) System.out.println("It's a spy number.");
        else System.out.println("It's not a spy number.");
    }
}
