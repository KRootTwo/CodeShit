// package blehh;
import java.util.*;
import java.math.*;

public class siuu{
    public static void main (String [] args) {
        Scanner siuuu = new Scanner(System.in);
        
        int ngg = (int) (Math.random()*10);
        int gg = -1;

        while (gg != ngg) {

            System.out.print("Enter yo number (0-9) fam: ");
            gg = siuuu.nextInt();

            if (gg == ngg){
                System.out.println("Siuuu Nigga.");
            } else {
                System.out.println("Nah Nigga. Try again.");
            }
        }

    }
}