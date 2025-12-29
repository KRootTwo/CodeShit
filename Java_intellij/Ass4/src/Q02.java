import java.util.*;
import java.math.*;

public class Q02 {
    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        System.out.print("Entre Numero: ");
        int m = blehh.nextInt();

        int n = 1;
        String st = "";

        System.out.println(st);
        for (int i = 1; i <= m; i++) {
            st = st + i + st;
            System.out.println(st);
        }

    }
}
