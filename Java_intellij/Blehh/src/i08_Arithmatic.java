import java.util.Scanner;

// Create a program that takes two numbers and shows result of all
//arithmetic operators (+,-,*,/,%).

public class i08_Arithmatic {
    public static void main(String[] args) {
        Scanner red = new Scanner(System.in);
        System.out.print("First Number A = ");
        int fn = red.nextInt();
        System.out.print("First Number B = ");
        int sn = red.nextInt();

        System.out.println("A + B = " + (fn + sn));
        System.out.println("A + B = " + (fn - sn));
        System.out.println("A + B = " + (fn * sn));
        System.out.println("A + B = " + (fn / sn));
        System.out.println("A %sball B = " + (fn % sn));

    }
}
