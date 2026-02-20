// Write a method to add two matrices. The header of the method is as follows:
// public static double[][] addMatrix(double[][] a, double[][] b)
// In order to be added, the two matrices must have the same dimensions and the same or
// compatible types of elements.
import java.util.Arrays;
public class Q14 {    
    public static double[][] addMatrix(double[][] a, double[][] b) {
        double z[][] = new double[a.length][a[0].length];
        if (a.length != b.length || a[0].length != b[0].length) return null;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                z[i][j] = a[i][j] + b[i][j];
            }
        }
        return z;
    }
    public static void main(String[] args) {
        double[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };
        double b[][] = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println(Arrays.deepToString(addMatrix(a, b)));
    }
}
