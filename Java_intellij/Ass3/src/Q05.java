import java.util.Scanner;

public class Q05 {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Entre Three Numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 + n2 > n3 || n2 + n3 > n1 || n3 + n1 > n2) {
            if (n1 == n2 && n2 == n3) {

                System.out.println ("The triangle is Isosceles.");
            } else if (n3 == n2 || n2 == n1 || n3 == n1) {
                System.out.println ("The triangle is Equilateral.");
            } else {
                System.out.println ("The triangle is Scalene.");
            }
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }


    }
}
