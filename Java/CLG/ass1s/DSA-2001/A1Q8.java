import java.util.*;
public class A1Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Row and Columns of 2D-Array: ");
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] array = new int[R][C];
        int sum = 0;
        System.out.print("Enter elements of 2D-Array: ");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                array[i][j] = sc.nextInt();
                sum += array[i][j];
            }
        }
        System.out.println("The elements of 2D array are: ");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The sum of elements of the 2D-Array is " + sum);
    }
}
