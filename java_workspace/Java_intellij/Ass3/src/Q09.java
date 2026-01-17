import java.util.*;

public class Q09 {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Input two Numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.print("Input operand (+,-,*,*)");
        char ch = sc.next().charAt(0);

        double res = 0;

        switch (ch) {
            case '+' :
                res = a + b;
                break;
            case '-' :
                res = a - b;
                break;
            case '*' :
                res = a * b;
                break;
            case '/' :
                if (b != 0) {
                    res = a / b;
                } else {
                    System.out.println("Division by zero is not allowed!");
                }
                break;
            default :
                System.out.println("Invalid operator! Please use +, -, *, or /.");
        }


    }
}
