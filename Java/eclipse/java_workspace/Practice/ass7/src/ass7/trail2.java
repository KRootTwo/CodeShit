package ass7;
import java.util.*;

public class trail2 {
	public static void revArr(int [] arr) {
		int start = 0, end = arr.length - 1, temp = 0;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++; end--;
		}
	}
	public static void main (String [] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(arr));
		revArr(arr);
		System.out.println(Arrays.toString(arr));
	}

}
