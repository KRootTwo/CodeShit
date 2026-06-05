package ass7;

/*
 * Write a Java Program that reads n elements into an array and finds the second
largest value.
Implement a method to determine the second largest element:
		public static int findSecondLargest(int[] arr);
Use this method in the main method to display the second largest value in the array.
Note: Don’t use any sorting methods.
 */

public class Q5 {
	public static int findSecondLargest(int[] arr) {
		int mx = arr[0], smx = Integer.MIN_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (mx < arr[i]) mx = arr[i];
		}
		for (int i = 1; i < arr.length; i++) {
			if (smx < arr[i] && arr[i] != mx) smx = arr[i];
		}
		return smx;
	}
	public static void main(String [] args) {
		int arr[] = {1, 3, 3, 4, 5, 9, 2, 6, 0, 8};
		int s = findSecondLargest(arr);
		System.out.println("Second Max: " + s);
	}

}

/*
 * if (smx > arr[i]) {
				smx = arr[i];
				if (smx < mx) smx = arr[i];
			}
*/
