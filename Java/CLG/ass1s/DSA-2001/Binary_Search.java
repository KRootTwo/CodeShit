import java.util.*;
public class Binary_Search {
    public static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
    public static boolean bsearch(int [] A, int item){
        int l =0, h = A.length-1;
        while(l<=h){
            int mid  = l + (h-l)/2;
            if (A[mid]== item)
                return true;
            else if(A[mid]> item)
                h = mid - 1;
            else 
                l = mid +1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        int [] A = new int [n];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        bubbleSort(A);
        System.out.print("Enter the element to search: ");
        int item = sc.nextInt();
        if (bsearch(A, item)) 
            System.out.println("Item found.");
        else 
            System.out.println("Item not found.");
    }
}

