package ass7;

import java.util.Arrays;

public class Q9 {
	public static void bS(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {1, 3, 2, 7, 5, 4, 9, 8, 6, -1};
		bS(arr);
		System.out.println(Arrays.toString(arr));
	}

}
