package ass6;
/*
 * The Collatz sequence is defined using the following rules for any positive integer n:
• If n is even, replace n with n / 2
• If n is odd, replace n with 3n + 1
• Continue repeating this process until the value of n becomes 1
The number of steps required to reach 1 is called the Collatz length.
Write a Java method with the following header:
public static int collatzLength(int n)
 */
public class Q5 {
	public static int cll(int n) {
		int cl = 0;
		while (n != 1) {
			if (n % 2 == 0) {
				if (n % 2 == 0) n /= 2;
				else n = (3 * n) + 1;
			}
			else {
				if (n % 2 == 0) n /= 2;
				else n = (3 * n) + 1;
			}
			cl++;
		}
		return cl;
	}

	public static void main(String[] args) {
		System.out.println(cll(11));
	}

}
