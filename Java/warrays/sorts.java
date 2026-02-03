import java.util.*;

public class sorts {
    public static void bS(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j + 1];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    isSwap = true;
                }
            }
            if (!isSwap) return;
        }
    }
    public static void iS(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int t = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > t) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = t;
        }
    }





    public static void main(String[] args) {
        int arr[] = {3, 7, 1, 9, 5, 6, 2, 8, 4};
        iS(arr);

        String g = Arrays.toString(arr);
        System.out.println(g);
    }
}


/**
 *     public static void iS(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int t = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > t) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = t;
            
        }
    }
 */