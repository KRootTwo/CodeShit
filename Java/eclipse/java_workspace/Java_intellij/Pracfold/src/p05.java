import java.util.Scanner;

public class p05 {
    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        System.out.print("Entre numero uno: ");
        int a = blehh.nextInt();
        System.out.print("Entre numero dos: ");
        int b = blehh.nextInt();

        for (int i = a; i <= b; i++) {
            int fact = 1;
            for (int j = 1; j <= i; j++) {
                fact *= j;
            }
            System.out.println("factorial of " + i + " is " + fact);
        }
    }
}
