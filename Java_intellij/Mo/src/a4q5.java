import java.util.Scanner;

public class a4q5 {
    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        System.out.print("Enter a(intialization), b (limit), c(increment): ");
        int a = blehh.nextInt();
        int b = blehh.nextInt();
        int c = blehh.nextInt();
        int sum = 0 ;

        for (int i = a; i <= b; i += c) {
            System.out.print(i+" ");
            sum += i;
        }
        System.out.println("\nThe sum is " + sum);
    }
}
