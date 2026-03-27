import java.util.Scanner;
public class A1QH1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer a: ");
        int a = sc.nextInt();
        System.out.print("Enter integer b: ");
        int b = sc.nextInt();
        System.out.print("Enter integer c: ");
        int c = sc.nextInt();
        System.out.println("\nResults:");
        boolean found = false;
        if (a + b == c) {
            System.out.println(a + " + " + b + " = " + c);
            found = true;
        }
        if (a == b - c) {
            System.out.println(a + " = " + b + " - " + c);
            found = true;
        }
        if (a * b == c) {
            System.out.println(a + " * " + b + " = " + c);
            found = true;
        }
        if (!found) {
            System.out.println("No matching formula found for these integers.");
        }
    }
}
    

