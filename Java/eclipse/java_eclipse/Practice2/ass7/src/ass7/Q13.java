package ass7;
/*
 * Write a Java Program that creates an array of size 10 and populates it with random
values between 50 and 100. Implement the following methods:
1. A method to fill the array with random values:
public static void fillArray(int[] arr);
2. A method to print the array elements:
public static void printArray(int[] arr);
3. A method to reverse the order of the array elements:
public static void reverseArray(int[] arr);
Use these methods in the main method to display the array before and after the
reversal operation.
 */

public class Q13 {
	public static void fillArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int s = (int) (((Math.random()) * 51) + 50);
			arr[i] = s;
		}
	}
	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static void reverseArray(int[] arr) {
		int s = 0, e = arr.length -1, temp = 0;
		while (s < e) {
			temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++; e--;
		}
	}
	public static void main (String args []) {
		int arr[] = new int[10];
		int a = 0;
		while (a != 10) {
			fillArray(arr);
			printArray(arr);
			reverseArray(arr);
			printArray(arr);
			System.out.println();
			a++;
		}
	}
}
