// Write a java program to find the maximum and minimum and how many times they both occur
// in an array of n elements. Find out the positions where the maximum first occurs and the
// minimum last occurs.
import java.util.Arrays;
import java.util.Scanner;
public class Q07 {
    public static int max(int a[]) {
        int mx = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > mx) mx = i;
        }
        return mx;
    }
    public static int min(int a[]) {
        int mn = a[0];
        for (int i : a) {
            if (i < mn) mn = i;
        }
        return mn;
    }
    public static int freqC(int a[], int n) {
        int c = 0;
        for (int i : a) {
            if (i == n) c++;
        }
        return c;
    }
    public static int Focc(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                return i + 1;
            }
        }
        return -1;
    }
    public static int Locc(int[] a, int n) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == n) {
                return i + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        System.out.print("Enter number of elements of Array: ");
        int arr[] = new int[blehh.nextInt()];
        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = blehh.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum element is " + max(arr) + " and " + " occurs " + freqC(arr, max(arr)) + " times");
        System.out.println("Minimum element is " + min(arr) + " and " + " occurs " + freqC(arr, min(arr)) + " times");
        System.out.println("First occurrence of maximum element is at position " + Focc(arr, max(arr)));
        System.out.println("Last occurrence of minimum element is at position " + Locc(arr, min(arr)));
    }
}

        // int arr[] = {1, 2, 3, 4, 2, 1, 5, 2, 1, 6, 8, 9, 1, 3, 9, 1};