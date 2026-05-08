
import java.util.InputMismatchException;
import java.util.Scanner;

public class A03Q02 {
    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        String a[] = {"red", "green", "orange", "grey", "cyan", "black"};
 
        try {
            System.out.println("Enter sl: ");
            int n = blehh.nextInt();
            System.out.println("Here's yo color nigga: " + a[n]);

        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println(aioobe.getMessage());
        } catch (InputMismatchException ime) {
            System.out.println("Input valid integer");
        } finally {
            blehh.close();
        }
    }
}