import java.util.Scanner;
import java.math.*;

public class Q06 {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a, b, c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double dis = (Math.pow(b, 2)- 4*a*c);
        double root1 = (-b + Math.sqrt(dis) / 2*a);
        double root2 = (-b - Math.sqrt(dis) / 2*a);

        if (dis > 0) {
            System.out.print("The equation has two roots. " + root1 + " " + root2);
        } else if (dis == 0) {
            System.out.print("The equation has one root. " + root1);
        } else {
            System.out.print("The equation has no real roots");
        }

        sc.close();
    }
}
