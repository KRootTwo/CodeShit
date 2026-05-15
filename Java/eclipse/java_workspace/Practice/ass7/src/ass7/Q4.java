package ass7;
import java.util.*;
/*
 * Write a method that finds the smallest element in an array of double values using
the following header:
			public static double min(double[] array)
Write a Java Program that prompts the user to enter ten numbers, invokes this
method to return the minimum value, and displays the minimum value.
 */
public class Q4 {
	public static double min(double[] array) {
		double d = array[0];
		for (int i = 1; i < array.length; i++) {
			if (d > array[i]) d = array[i];
		}
		return d;
	}
	public static void main(String[] args) {
		double arr[] = {1.2, 3.3, 3.2, 4.3, 5.8, 9.0, 2.1, 6.9, 0.9, 8.4};
		double o = min(arr);
		System.out.println("Here's yo min nigga: " + o);
	}

}
