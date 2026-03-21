import java.util.Arrays;
public class pr3 {
    public static void bubbleSort (int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }
    public static void selectionSort (int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = 0 + i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }
    }
    public static void main(String[] args) {
        int a[] = {2, 5, 1, 4, 8, 2, 7, 5, 9, 5, 2, 5, 6, 0};
        // bubbleSort(a);
        selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
