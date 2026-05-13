import java.util.*;

public class t02 {
    public static void main(String[] args) {
        int arr[] = {2, 5, 2, 5, 8, 9, 5, 1, 5, 8, 3, 5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                
                if (arr[j + 1] < arr[j]) {
                    int t = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = t;
                }       
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}