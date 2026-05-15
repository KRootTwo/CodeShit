package ass6;

/*
 * Write a method that finds the number of vowels in a given string using the following
method header:
public static int countVowels(String str)
A vowel is any of the following characters: a, e, i, o, u (both uppercase and lowercase).
For example:
countVowels("Welcome") returns 3.
 */

public class Q12 {
	public static int countVowels(String str) {
		int c = 0;
		char s [] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		for (char ch : s) {
			for (int i = 0; i < str.length(); i++) {
				if (ch == str.charAt(i)) c++;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		String s = "aeiouAEIOU	";
		System.out.println(countVowels(s));
	}

}
