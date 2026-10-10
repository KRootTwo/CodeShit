public class Qn9 {
	public static boolean isPalindrome(int x) {
		int rev = 0;
		int m = (x < 0)? -(x) : x;
		
		while (m != 0) {
			rev = rev * 10 + (m % 10);
			m /= 10;
		}
		return rev == x;
	}
	public static boolean isPalindromeOp(int x) {
		if (x < 0) return false;
		int rev = 0, m = x;
		
		while (m != 0) {
			rev = rev * 10 + (m % 10);
			m /= 10;
		}
		return rev == x;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome(-121));
	}
}
