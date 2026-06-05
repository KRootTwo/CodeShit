import java.util.*;
public class leapy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // #1
        if (year % 100 == 0) {
            if (year % 400 == 0 && year % 4 == 0) {
                System.out.println("Year is a leapyear.");
            }else {
                System.out.println("Year is not a leap year.");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println("Year is a leapyear.");
            } else {
                System.out.println("Year is not a leap year.");
            }
        }

        // #2
        if (year % 400 == 0) {
            System.out.println("Year is a leapyear.");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Year is a leapyear.");
        } else {
            System.out.println("Year is not a leapyear");
        }

        // #3
        String output = (year % 100 == 0)? ((year % 400 ==0)? "Year is a leapyear":"Year is not a leapyear")
                : ((year % 4 == 0)? "Year is a leapyear":"Year is not a leapyear");
        System.out.println(output);
    }
}
