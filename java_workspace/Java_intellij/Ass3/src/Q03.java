import java.util.Scanner;

public class Q03 {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Input first number: ");
        int n1 = sc.nextInt();
        System.out.print(" Input second number: ");
        int n2 = sc.nextInt();
        System.out.print(" Input third number: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n2 > n3) {
            System.out.println ("\"Decreasing\"");
        } else if(n3 > n2 && n2 > n1) {
            System.out.println ("\"Increasing\"");
        } else {
            System.out.println ("\"Neither Increasing nor Decreasing\"");
        }
        sc.close();
    }

}
