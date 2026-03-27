import java.util.*;
public class A1QH14 {
    public static void readarr(double [] [] a) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<a.length; i++){
            for (int j =0 ; j<a[0].length; j++){
                a[i][j] = sc.nextDouble();
            }   
        } 
    }
    public static double[][] addMatrix(double[][] A, double[][] B){
        if (A.length != B.length || A[0].length != B[0].length)
            System.out.println("Matrices must have the same dimensions.");
        int rows = A.length;
        int cols = A[0].length;
        double[][] C = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of matrix: ");
        int n = sc.nextInt();
        double [][]A = new double [n][n];
        double [][]B = new double [n][n];
        System.out.println("Enter the elements of the ARRAY A: ");
        readarr(A);
        System.out.println("Enter the elements of the ARRAY B: ");
        readarr(B);
        double[][] result = addMatrix(A, B);

        System.out.println("Result Matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + "   ");
        }
        System.out.println();
        }

    }
    
}
