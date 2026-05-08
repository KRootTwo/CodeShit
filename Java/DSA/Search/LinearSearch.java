import java.util.Arrays;

public class LinearSearch {

    public static <T> int linearSearch(T arr[], T tg) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(tg)) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {12, 43, 65, 92, 76, 39, 56, 20, 41, 34};

        Arrays.sort(arr);

        Integer ar[] = Arrays.stream(arr)
                             .boxed()
                             .toArray(Integer[]::new);

        System.out.println("SFN: " + linearSearch(ar, 92));
    }
}