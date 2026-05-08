import java.util.Arrays;

public class BinarySearch {

    public static <T extends Comparable<T>> int BinarySearch(T arr[], T tg) {
        int start = 0, end = arr.length - 1;

        boolean isAsc = arr[0].compareTo(arr[1]) < 0;

        if (isAsc) {
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid].compareTo(tg) == 0) return mid;

                else if (arr[mid].compareTo(tg) > 0) end = mid - 1;

                else start = mid + 1;
            }
        }
        else {
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid].compareTo(tg) == 0) return mid;

                else if (arr[mid].compareTo(tg) < 0) end = mid - 1;

                else start = mid + 1;
            }

        }
        return -1;
    } 

    public static void main(String[] args) {
        int arr[] = {12, 43, 65, 92, 76, 39, 56, 20, 41, 34};
        int arr2[] = {99, 98, 97, 96, 95, 94, 93, 92, 91, 90};

        Arrays.sort(arr);

        Integer ar[] = Arrays.stream(arr)
                             .boxed()
                             .toArray(Integer[]::new);

        Integer ar2[] = Arrays.stream(arr2)
                              .boxed()
                              .toArray(Integer[]::new);

        System.out.println("SFN: " + BinarySearch(ar, 34));
        System.out.println("SFN: " + BinarySearch(ar2, 98));
    }
}