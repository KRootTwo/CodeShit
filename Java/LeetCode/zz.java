public class zz {

    public static void  lengthOfLongestSubstring(String s) {
        char c[] = s.toCharArray();
        String str = s;
        char ch[] = 

        for (int i = 0; i < c.length; i++) {
            for (int j = i; j < c.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(c[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
   
    }
    public static void main(String[] args) {
        lengthOfLongestSubstring("pwwkew");
    }
}

