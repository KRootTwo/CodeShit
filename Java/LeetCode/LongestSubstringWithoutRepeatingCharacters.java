
public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        StringBuilder str = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            if (!(str.toString()).contains((String.valueOf(s.charAt(i))))) {
                str.append(s.charAt(i));
                Math.max(max, str.length());
            } else {
                str.delete(max, i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}


/*
 char c[] = new char[s.length()];
        String r = "";
        int max = 0;
        int index = 0;

        for (int i = 0; i < c.length - 1; i++) {
            int size = 0;
            char ch = c[i];
            for (int j = i + 1; j < c.length; j++) {
                if (ch != c[j]) {
                    size++;
                }
            }
            if (size > max) {
                max = size;
                index = i;
            }
        }
        return max;

*/