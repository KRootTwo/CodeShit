package blehh;
import java.util.*;

public class siuuu{
    public static void main (String [] args) {
        Scanner siuu = new Scanner(System.in);
        
        int ngg = (int) (Math.random()*10);
        int gg = -1;

        while (gg != ngg) {

            System.out.print("Enter yo number (0-9) fam: ");
            gg = siuu.nextInt();

            if (gg == ngg){
                System.out.println("Siuuu Nigga.");
            } else {
                System.out.println("Nah Nigga. Try again.");
            }
        }
        siuu.close();
    }
}