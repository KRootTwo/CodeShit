public class seachAlgos {
    public static void linearSearch(int arr[], int key) {
        int i;
        boolean found = false;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Gotcha " + i);
        } else {
            System.out.println("404");
        }
    }
    public static void binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1,mid = 0;
        boolean found = false;
        while (start <= end) {
            mid = start + (end - start)/2;
            if (arr[mid] == key) {
                found = true;
                break;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (found) {
            System.out.println("Gotcha " + mid);
        } else {
            System.out.println("404");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        linearSearch(arr, 8);
        binarySearch(arr, 8);
    }
}
