import java.util.*;
import java.time.*;

public class tw {
    public static void main(String[] args) throws InterruptedException {
        Scanner blehh = new Scanner(System.in);
        System.out.print("Press 'S' to start: ");
        char ch = blehh.next().toUpperCase().charAt(0);
        System.out.println();
        String y = "Yash is a Bitch-Nigga.";
        if (ch == 'S') {
            for (int i = 0; i < 10; i++) {
                System.out.print(y.charAt(i));
                Thread.sleep(1500);
            }
            for (int j = 10; j < y.length(); j++) {
                System.out.print(y.charAt(j));
                Thread.sleep(10);
            }
        }
    }
}
