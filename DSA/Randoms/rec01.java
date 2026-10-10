
import java.util.Scanner;

public class rec01 {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);

        // int n = in.nextInt();

        // try {
        //     if (n >= 0) {
        //         System.out.println("bruhh: " + n);
        //     }
        //     else {
        //         throw new NumberFormatException("Negative nigger");
        //     }
        // } catch (NumberFormatException nfe) {
        //     System.out.println(nfe.getMessage());
        // }


        // --------------

        // try {
        //     int n = in.nextInt();

        //     if (n > 100) throw new MarksOutOfBoundException("Shiii");
        //     System.out.println("hell nahh: " + n);
        // } catch (MarksOutOfBoundException mobe) {
        //     System.out.println(mobe);
        // }

        // ---------------

        Box<Integer> b = new Box<>();

        b.insert(10);
    }
}