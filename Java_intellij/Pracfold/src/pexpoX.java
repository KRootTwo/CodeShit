import java.util.Scanner;

public class pexpoX {

    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        System.out.println("Entre x: ");
        double x = blehh.nextInt();

        double term = 1, sum = 1;
        int n = 1;

        while (Math.abs(term) > 0.0000000001) {
            term = term * (x / n);
            sum += term;
            n++;
        }
        System.out.println("e power " + x + " = " + sum);
    }
}
