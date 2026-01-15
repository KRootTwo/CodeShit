package ass6;

/*
 * Write a Java Program that converts a given string so that the first letter of every word
becomes uppercase, effectively converting the string to title case.
The program should include a method with the following header:
public static String toTitleCase(String str)
The method should take a string as input and return the converted string where the
first letter of each word is capitalized.
Example:
 		• Input: "welcome to java"
 		• Output: "Welcome To Java"
The program should prompt the user to enter a string and then display the converted
title-case string.
 */

public class Q14 {
	public static String toTitleCase(String str) {
		char [] s = str.toCharArray();
		for (int i = 0; i < s.length; i++) {
			if (i == 0 || s[i - 1] == ' ') {
				if (s[i] > 'a' && s[i] < 'z') {
					s[i] = (char) (s[i] - 32);
				}
			}
		}
		return new String(s);
	}

	public static void main(String[] args) {
		String input = "what the fuck nigga";
		String result = toTitleCase(input);
		System.out.println("Title Case: \n" + result);
		
	}

}
