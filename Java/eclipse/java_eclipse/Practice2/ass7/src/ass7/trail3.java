package ass7;

import java.util.Arrays;

public class trail3 {
	public static void selectionSort(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void bubbleSort(int arr []) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
	}
	public static void bubbleSortCG(int[] arr) {
	    for (int i = 0; i < arr.length - 1; i++) {
	        for (int j = 0; j < arr.length - i - 1; j++) {
	            if (arr[j] > arr[j + 1]) {
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		int arr[] = {1, 3, 2, 7, 5, 4, 9, 8, 6, -1};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
