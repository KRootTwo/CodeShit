import java.util.Scanner;

public class p03 {

    public static boolean oddEven (int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        System.out.print("Entre Numero(0 to stop): ");
        int n = blehh.nextInt();

        do {
            if (oddEven(n)) {
                System.out.println("Even.");
            } else {
                System.out.println("Odd.");
            }
            System.out.print("Entre Numero(0 to stop): ");
            n = blehh.nextInt();

        } while (n != 0);
        System.out.println("Programme terminated.");
    }
}
