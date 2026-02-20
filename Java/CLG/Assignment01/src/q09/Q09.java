// Write a method that sums all the numbers in the major diagonal in an n * n matrix of double
// values using the following header:
// public static double sumMajorDiagonal(double[][] m)
// Write a java program that reads a 4-by-4 matrix and displays the sum of all its elements on the
// major diagonal.
import java.util.*;
public class Q09 {
    public static double sumMajorDiagonal(double[][] m) {
        double s = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if (i == j) s += m[i][j];
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        double arr[][] = new double[4][4];
        System.out.print("Enter a 4-by-4 matrix row by row: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = blehh.nextDouble();
            }
        }
        System.out.println("Sum of the elements in the major diagonal is: " + sumMajorDiagonal(arr));
    }
}
