// Write a method that returns the sum of all the elements in a specified column in a matrix
// using the following header:
// public static double sumColumn(double[][] m, int columnIndex)
// Write a java program that reads a 3-by-4 matrix and displays the sum of each column.
import java.util.*;
public class Q10 {
    public static double sumColumn(double[][] m, int columnIndex) {
        double s = 0;
        for (int i = 0; i < m.length; i++) {
            if (columnIndex < m.length) s += m[i][columnIndex];
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        double arr[][] = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = blehh.nextDouble();
            }
        }
        for (int j = -1; j < arr[0].length; j++) {
            System.out.println("Sum of column " + j + " is " + sumColumn(arr, j));
        }
    }
}
