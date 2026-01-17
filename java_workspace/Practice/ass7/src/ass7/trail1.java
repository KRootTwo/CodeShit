package ass7;
import java.util.*;

public class trail1 {
	public static int[] revArr(int arr[]) {
		int rev[] = new int[arr.length];
		int start = 0, end = arr.length - 1, temp;
		
		while (start < end) {
			temp = arr[start];
			arr[end] = arr[start];
			arr[end] = temp;
			start++;
			end--;
		}
		return rev;
	}
	public static char[] toArray(String s) {
		int l = s.length();
		char arr[] = new char[l];
		for (int i = 0; i < l; i++) {
			arr[i] = s.charAt(i);
		}
		return arr;
	}
	public static char[] revArray(char s[]) {
		int l = s.length;
		char rev[] = new char[l];
		for (int i = 0; i < l; i++) {
			rev[i] = s[l - i - 1];
		}
		return rev;
	}
	public static boolean isPalindrome(String v) {
		String d, m;
		
		d = Arrays.toString(revArray(toArray(v)));
		m = Arrays.toString(toArray(v));
		
		if (d.equals(m)) return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner blehh = new Scanner(System.in);
		System.out.print("Entre String: ");
		String s = blehh.nextLine();
		
		if (isPalindrome(s)) System.out.println(s + " is a palindrome");
		else System.out.println(s + " is a not palindrome");
		
		System.out.print("Entre String: ");
		
		blehh.close();
	}
	
}
