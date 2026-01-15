package ass6;

/*
 * Write a method that finds the number of occurrences of a specified character in a string
using the following header:
public static int count(String str, char a)
For example,
count ("Welcome", 'e') returns 2.
Write a Java Program that prompts the user to enter a string followed by a character
and displays the number of occurrences of the character in the string.
 */

public class Q11 {
	public static int count(String str, char a) {
		int c = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 1).equalsIgnoreCase(String.valueOf(a))) {}
		}
		return c;
	}
	public static int countS(String str, char a) {
		int c = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == a) c++;
		}
		return c;
	}
	public static void main(String[] args) {

	}

}
