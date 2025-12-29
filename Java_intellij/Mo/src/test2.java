import java.util.*;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units: ");
        int n = sc.nextInt();
        double cost = 0;

        if (n <= 50) {
            cost = n * 3;
        } else if ( n <= 200) {
            cost = ((n - 50) * 4.8 + 50 * 3);
        } else if ( n <= 400 ) {
            cost = 50 * 3 + 150 * 4.8 + (n - 200) * 5.8;
        } else {
            cost = 50 * 3 + 150 * 4.8 + 200 * 5.8 + (n - 400) * 6.20;
        }

        System.out.println(cost);
    }
}
