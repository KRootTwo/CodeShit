// package warrays;

import java.util.Arrays;

public class revArr {
    public static void revArrO(int arr[]) {
        int start = 0, end = arr.length - 1, l;
        while (start < end) {
            l = arr[start];
            arr[start] = arr[end];
            arr[end] = l;
            start++;
            end--;
        }
    }
    public static void revArrV1(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            arr[start] += arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }
    }
    public static void revArrV2(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] += arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i] - arr[arr.length - 1 - i];
            arr[i] -= arr[arr.length - 1 - i];
        }
    }

    

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        revArrV2(arr);


        String g = Arrays.toString(arr);
        System.out.println(g);
        
    }
    
}


/*
while conditions -- 
start < (start + arr.length - l
l < arr.length

public static void revArrV2c(int arr[]) {
    for (int start = 0; start < arr.length / 2; start++) {
        arr[start] += arr[arr.length - 1 - start];
        arr[arr.length - 1 - start] = arr[start] - arr[arr.length - 1 - start];
        arr[start] -= arr[arr.length - 1 - start];
    }
}

public static void revArrV2(int arr[]) {
    for (int i = 0; i < arr.length / 2; i++) {
        arr[i] += arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = arr[i] - arr[arr.length - 1 - i];
        arr[i] -= arr[arr.length - 1 - i];
    }
}

*/