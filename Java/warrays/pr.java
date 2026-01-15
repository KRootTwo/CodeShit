// package warrays;
import java.util.*;
public class pr {
    public static void linearSearch(int arr[], int k) {
        int i;
        boolean f = false;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                f = true;
                break;
            }
        }
        if (f) {
            System.out.println("Gotcha " + i);
        } else {
            System.out.println("404");
        }
    }
    public static void binarySearch(int arr[], int k) {
        int s = 0, e = arr.length - 1,mid = 0;
        boolean f = false;
        while (s <= e) {
            mid = s + (e - s)/2;
            if (arr[mid] == k) {
                f = true;
                break;
            } else if (arr[mid] > k) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        if (f) {
            System.out.println("Gotcha " + mid);
        } else {
            System.out.println("404");
        }
    }
    public static void revArr (int arr[]) {
        int s = 0, e = arr.length - 1, l = 0;
        while (s < e) {
            arr[s] = l;
            arr[s] = arr[e];
            arr[e] = l;
            s++;
            e--;
        }
    }
    public static void pairUp(int arr[]) 
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("("+ arr[i] +", "+ arr[j] +")\t");
            }
            System.out.println("\n");
        }
    }
    public static void subArr(int arr[]) 
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("( ");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] +" ");
                }
                System.out.print(")\n");
            }
            System.out.println();
        }
    }
    public static int maxSubArrSumBF(int arr[]) {
        int l = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i;j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum > l) l = sum;
            }
        }
        return l;
    }
    public static int maxSubArrSumPS(int arr[]) {
        int sum, l = Integer.MIN_VALUE;
        int p[] = new int[arr.length];
        for (int i = 0; i < p.length; i++) {
            p[i] = i == 0 ? arr[i] : p[i - 1] + arr[i];
        }

        for (int i = 0; i < p.length; i++) {
            for (int j = i; j < p.length; j++) {
                sum = i == 0 ? p[j ] : p[j] - p[i - 1];
                if (sum > l) l = sum;
            }
        }
        return l;
    }
    public static int mxSbArSmKadaneO(int arr[]) {
        int cs = 0, ms = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs < 0) cs = 0;
            ms = Math.max(cs, ms);
        }
        return ms;
    }
    public static int mxSbArSmKadaneE(int arr[]) {
        int cs = arr[0], ms = arr[0];
        for (int i = 1; i < arr.length; i++) {
            cs = Math.max(arr[i], arr[i] + cs);
            ms = Math.max(cs, ms);
        }
        return ms;
    }
    public static void main(String[] args) 
    {
        int arr2[] = {-1, -2, 3, -4, -5, 6, -7, -8, -9};
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        linearSearch(arr, 8);
        binarySearch(arr, 8);
        pairUp(arr);
        subArr(arr);
        revArr(arr);
        String g = Arrays.toString(arr);
        System.out.println(g);
        System.out.println(maxSubArrSumPS(arr));
        System.out.println(mxSbArSmKadaneE(arr2));

    }
}
