import java.util.HashSet;

public class Qn3 {
	public static int lengthOfLongestSubstring(String s) {
		int n = s.length();
		HashSet<Character> set = new HashSet<>();
		int left = 0, maxLen = 0;

		for (int right = 0; right < s.length(); right++) {

			while(set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add((Character) s.charAt(right));
			maxLen = Math.max(maxLen, right - left + 1);
		}
		return maxLen;
	}
	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}

}
