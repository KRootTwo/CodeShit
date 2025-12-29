import java.util.*;
import java.math.*;

public class Q01 {
    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        System.out.print("Entre Numero: ");
        int m = blehh.nextInt();

        int n = m, sum = 0;

        while (m > 0) {
            sum += m % 10;
            m /= 10;
        }

        if (sum % 9 == 0) {
            System.out.println(n +" is divisible by 9");
        } else {
            System.out.println(n +" is not divisible by 9");
        }
    }
}
