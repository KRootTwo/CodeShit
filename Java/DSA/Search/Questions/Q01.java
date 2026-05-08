public class Q01 {

    public static int ceilT(int arr[], int tg) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] > tg) {
                if (arr[mid - 1] < tg) {
                    return arr[mid];
                }
                end = mid - 1;
            }
            else if (arr[mid] < tg) {
                if (arr[mid + 1] > tg) {
                    return arr[mid + 1];
                }
                start = mid + 1; 
            }
            else {
                return arr[mid];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 9, 14, 16, 17, 18};

        System.out.println(ceilT(arr, 15));
    }
}