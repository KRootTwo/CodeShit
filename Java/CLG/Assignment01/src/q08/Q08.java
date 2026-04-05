// Write a java program to print M-by-N array in the tabular format. Also, display the sum of
// elements of the array.
import java.util.Scanner;
public class Q08 {
    public static void prntArr(int arr[][]) {
        System.out.println("The elements of the 2D Array are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int sumArr(int arr[][]) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                s += arr[i][j];
            }
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        System.out.print("Enter no. of rows & columns of 2D Array: ");

        int arr[][] = new int[blehh.nextInt()][blehh.nextInt()];

        System.out.print("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j] = blehh.nextInt();
                
            }
        }
        prntArr(arr);
        System.out.println("The sum of elements of the 2D Array is: " + sumArr(arr));
    }
}
