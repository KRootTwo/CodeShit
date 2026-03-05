// Write a java program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix,
// and finds the first row and column with the most 1s.
import java.util.Arrays;
public class Q15 {
    public static int max(int a[]) {
        int id = 0, m = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > m) {
                id = i;
            }
        }
        return id;
    }
    public static void fillOZ(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int) (Math.random() * 2);
            }
        }
    }
    public static int[] mosOR(int a[][]) {
        int x[] = new int[4];
        for (int i = 0; i < a.length; i++) {
            int c = 0;
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 1) c++;
            }
            x[i] = c;
        }
        return x;
    }
    public static int[] mosOC(int a[][]) {
        int x[] = new int[4];
        for (int i = 0; i < a.length; i++) {
            int c = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j][i] == 1) c++;
            }
            x[i] = c;
        }
        return x;
    }
    public static void main(String[] args) {
        int g[][] = new int[4][4];
        fillOZ(g);
        System.out.println(Arrays.deepToString(g));
        int a[] = mosOR(g);
        System.out.println(Arrays.toString(a));
        int b[] = mosOC(g);
        System.out.println(Arrays.toString(b));
        System.out.println("The largest row index: " + max(a));
        System.out.println("The largest column index: " + max(b));
    }
}
