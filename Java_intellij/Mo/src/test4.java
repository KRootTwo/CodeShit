import java.util.*;

public class test4 {

    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = blehh.nextInt();
        int divisibilityCount = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisibilityCount++;
            }
        }
        if (divisibilityCount == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("NOt prime");
        }
    }
}
