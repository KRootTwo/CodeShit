package ass6;
/*
 * Write a method that counts the number of words in a given string using the following
method header:
public static int countWords(String str)
A word is defined as a sequence of characters separated by spaces.
countWords("Java is fun") returns 3.
Write a Java Program that prompts the user to enter a sentence and then displays the
total number of words in the sentence. Provide a sample run of the program.
 */
public class Q13 {
	public static int countWords(String str) {
		int c = 0;
		boolean inword = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				if (!inword) {
					c++;
					inword = true;
				}
			} else {
				inword = false;
			}
		}
		return c;
	}
	public static void main (String [] args) {
		String s = " Java is fun ";
		System.out.println(countWords(s));
	}
}
