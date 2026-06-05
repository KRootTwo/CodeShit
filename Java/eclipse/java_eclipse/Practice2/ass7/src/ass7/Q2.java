package ass7;
import java.util.*;
/*
 * Write a Java Program that uses an array to read a sequence of integers between 1
and 100, ending when the user enters 0. Store and count the occurrences of each
number in the array.
Your program must use the following methods:
	1. A method to read the input values and update the counts:
		public static void readInput(int[] counts);
	2. A method to display how many times each number appears:
		public static void displayCounts(int[] counts);
Use these methods in the main method to count and display the occurrences of the
numbers.
 */

public class Q2 {
	public static void readInput(int[] counts) {
		Scanner blehh = new Scanner(System.in);
		System.out.print("Entre numero b/w 1-100(0 to stop): ");

		while (true) {
			int n = blehh.nextInt();
			if (n == 0) break;
			else if (n < 1 || n > 100) System.out.println("Invalid input");
			else {
				counts[n]++;
			}
		}
		blehh.close();
	}
	
	public static void displayCounts(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] == 0) continue;
			else if (counts[i] == 1)
				System.out.println(i + " is repeated " + counts[i] + " time");
			else
				System.out.println(i + " is repeated " + counts[i] + " times");
		}
	}
	
	public static void main(String[] args) {
		int counts[] = new int[101];
		readInput(counts);
		displayCounts(counts);
		

	}

}
