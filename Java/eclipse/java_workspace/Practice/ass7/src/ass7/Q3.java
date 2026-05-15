package ass7;
import java.util.*;

/*
 * Write a Java Program that reads 10 integers from the keyboard and stores them in
an array. After the array is filled, prompt the user to enter a number to search for. Use
the following methods:
1. A method to read and store the 10 integers into the array:
	public static void readArray(int[] arr);
2. A method to count how many times the searched number appears in the array:
	public static int countOccurrences(int[] arr, int key);
In the main method, call these methods and display whether the number is found and
how many times it occurs.
 * */

public class Q3 {
	public static void readArray(int[] arr) {
		Scanner blehh = new Scanner(System.in);
		System.out.print("Enter 10 integers: ");
		for (int i = 0; i < arr.length; i++) {
			int s = blehh.nextInt();
			arr[i] = s;
		}
	}
	public static int countOccurrences(int[] arr, int key) {
		int ct = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) ct++;
		}
		return ct;
	}
	public static void main(String[] args) {
		Scanner blehh = new Scanner(System.in);
		int arr[] = new int[10];
		readArray(arr);
		String p = Arrays.toString(arr);
		System.out.println(p);
		
		System.out.println("Enter a number to search: ");
		int x = blehh.nextInt();
		int c = countOccurrences(arr, x);
		System.out.println(x + " appears " + c + " time(s).");
		
	}

}
