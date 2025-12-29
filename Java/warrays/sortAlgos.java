import java.util.*;
public class sortAlgos {
    public static void bubbleSort(int arr[]) {
        int k = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - k; j++) {
                if (arr[j] > arr[j + 1]) arr[j + 1] = arr[j];
            }
            k++;
        }
    }
    public static void main(String[] args) {
         int arr[] = {3, 7, 1, 9, 5, 6, 2, 8, 4};
         bubbleSort(arr);

         String g = Arrays.toString(arr);
         System.out.println(g);

    }
}
