import java.util.Scanner;

// Create a program to calculate Perimeter of a rectangle.
// Perimeter of rectangle ABCD = A+B+C+D

public class i10_PeriRect {
    public static void main(String[] args) {
        Scanner shit = new Scanner(System.in);
        System.out.print("Length of yo GodForsaken Rectangle(in metres) L = ");
        float length = shit.nextFloat();
        System.out.print("Breath of yo GodForsaken Rectangle(in metres) B = ");
        float breadth = shit.nextFloat();

        System.out.println("Calculating Perimeter of Da Rectangle...");

        System.out.println("Perimeter De Rectangle = " + (2*(length) + 2*(breadth)) + " metres");
    }
}
