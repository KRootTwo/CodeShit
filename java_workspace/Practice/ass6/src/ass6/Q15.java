package ass6;

/*
 * Write a Java Program that checks whether a given string is a palindrome.
The program should include a method with the following header:
public static boolean isPalindrome(String str)
The method should take a string as input and return true if the string is a
palindrome, and false otherwise.
A palindrome is a string that reads the same backward as forward (e.g.,
"madam" or "level").
The program should prompt the user to enter a string and then display whether the
string is a palindrome or not.
Example:
• Input: "madam" → Output: "madam is a palindrome"
• Input: "java" → Output: "java is not a palindrome"
 */

public class Q15 {
	public static boolean isPalindrome(String str) {
		boolean p = false;
		
		String rev = new StringBuilder(new String(str)).reverse().toString();
		
		char[] revc = new StringBuilder(new String(str)).reverse().toString().toCharArray();

		if (str.equals(rev)) p = true;
		return p;
	}
	public static void main(String[] args) {
		String s = "blehh";
		System.out.println(isPalindrome(s));

	}

}
