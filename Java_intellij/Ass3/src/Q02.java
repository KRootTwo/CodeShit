import java.util.*;

public class Q02 {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number of steps walked: ");
        int steps = sc.nextInt();

        if (steps >= 10000) {
            System.out.println ("Good job! You're active today.");
        } else {
            System.out.println ("You need to walk more for good health.");
        }

    }

}
