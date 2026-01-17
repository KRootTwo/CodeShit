import java.util.Scanner;
import java.math.*;

public class Q04 {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);

        int cg = (int) (Math.random()*9) +1;
        System.out.print("Enter user number: ");
        int ug = sc.nextInt();
        System.out.println("Computer guesses: " + cg);

        if (ug == cg) {
            System.out.println("You got it right");
        } else if (Math.abs(ug - cg) == 1) {
            System.out.println("Almost got it");
        } else {
            System.out.println("You got it wrong");
        }


//        int ug = -1, count = 0 ;

//        while ( ug != cg) {
//            System.out.print(" Entre guess: ");
//            ug = sc.nextInt();
//
//            if ( ug == cg) {
//                System.out.println("GG Blud.You win");
//                count += 1;
//            } else if (Math.abs( ug - cg)== 1) {
//                System.out.println ("Close.");
//                count += 1;
//            } else {
//                System.out.println ("WRONG. Try again");
//                count += 1;
//            }
//        }
//        System.out.println("Took " + count + " attempts.");

    }

}
