// Write a Java program that takes two arrays a and b of length n storing int values, and returns
// the dot product of a and b. That is, it returns an array c of length n such that c[i] = a[i] · b[i],
// for i = 0, . . . , n − 1.
import java.util.Arrays;
public class Q13 {
    public static int[] dotP(int a[], int b[]) {
        int s[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            s[i] = a[i] * b[i];
        }
        return s;
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int b[] = {7, 8, 9, 1, 2, 3};
        System.out.println(Arrays.toString(dotP(a, b)));
    }
}
