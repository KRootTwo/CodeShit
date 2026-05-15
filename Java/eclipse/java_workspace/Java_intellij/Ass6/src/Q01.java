import java.util.Scanner;
import java.math.*;

public class Q01 {

    public static int additionSimple(int x, int y) {
        return x + y;
    }
    public static int subtractionSimple(int x, int y) {
        return x - y;
    }
    public static int multiplicationSimple(int x, int y) {
        return x * y;
    }
    public static double divisionSimple(int x, int y) {
        double r = 0;
        if (y != 0) {
            r = x / y;
        }
        return r;
    }
    public static int remainderSimple(int n, int m) {
        return n % m;
    }
    public static double squareRootSimple(int n) {
        return Math.sqrt(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("----- SIMPLE CALCULATOR -----\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n" +
                "5. Remainder\n" +
                "6. Square Root\n" +
                "7. Exit\n" +
                "Enter operator: ");
        int s = sc.nextInt();
        int x = 0, y = 0, z = 0;
        if (s == 6) {
            System.out.print("Enter number: ");
            z = sc.nextInt();
        } else {
            System.out.print("Enter two oprands: ");
            x = sc.nextInt();
            y = sc.nextInt();
        }
        double e = 0;
        switch (s) {
            case 1 :
                e = additionSimple(x, y);
                break;
            case 2:
                e = subtractionSimple(x, y);
                break;
            case 3:
                e = multiplicationSimple(x, y);
                break;
            case 4:
                e = divisionSimple(x, y);
                break;
            case 5:
                e = remainderSimple(x, y);
                break;
            case 6:
                e = squareRootSimple(z);
                break;
            case 7:
                break;
            default:
                System.out.println("Wrong operand.");
        }
        System.out.println("Result is: " + e);

    }
}
