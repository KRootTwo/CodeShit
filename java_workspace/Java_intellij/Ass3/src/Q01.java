import java.util.*;

public class Q01 {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You're eligible to cast a vote.");
        } else {
            System.out.println("You're not eligible to cast a vote.");
        }
    }
}