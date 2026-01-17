import java.util.*;
public class Q08 {
    public static void main (String args []) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Units: ");
        double units = sc.nextDouble();
        System.out.print("Do you want to pay online? (write y/n): ");
        char ch = sc.next().toLowerCase().charAt(0);
        double bill = 0;

        if ( units <= 50 ) {
            bill += units * 3 ;
        } else if (units > 50 && units <= 200) {
            bill += ((units - 50)* 4.8 + 50 * 3 );
        } else if (units > 200 && units < 400) {
            bill += ((units - 200)* 5.8 + 50*3 + 150*4.8);
        } else {
            bill += ((units - 400)* 6.2+ 50*3 + 150*4.8 + 200* 5.8);
        }

        System.out.println("Your total bill is: " + bill);

        if (ch == 'y') {
            bill -= bill*0.03;
        }

        System.out.println("Your have to pay: " + bill);


    }


}
