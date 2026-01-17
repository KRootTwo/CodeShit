import java.util.Scanner;

public class p04 {

    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        System.out.print("Entre Numero: ");
        int n = blehh.nextInt();

        int i = 0;
        for (i = 1; i <= 3; i++) {
            System.out.println(n + " x "+ i +" = "+ i * 5);
        }
        while (i <= 6) {
            System.out.println(n + " x "+ i +" = "+ i * 5);
            i++;
        }
        do {
            System.out.println(n + " x "+ i +" = "+ i * 5);
            i++;
        } while (i <= 10);
    }
}
