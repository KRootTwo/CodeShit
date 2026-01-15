package ass7;

/*
 * Write a method that returns the largest digit in a given integer.
Use the following method header:
					public static int largestDigit(int n)
 */

public class Q8 {
	public static int largestDigit(int n) {
		int lD = Integer.MIN_VALUE;
		while (n != 0) {
			int s = n % 10;
			n /= 10;
			if (s > lD) lD = s;
		}
		return lD;
	}
	public static void main (String [] args) {
		System.out.print(largestDigit(3456));
	}
}
