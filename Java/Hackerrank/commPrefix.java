class commPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String s = " ";
        for (int i = 0; i < strs.length - 1; i++) {
            char c1[] = strs[i].toLowerCase().toCharArray();
            char c2[] = strs[i + 1].toLowerCase().toCharArray();
            for (int j = 0; j < Math.min(c1.length, c2.length); j++) {
                if (s.equals(" ") || s.charAt(s.length() - 1) == c1[s.length() - 1]) {
                    if (c1[j] == c2[j]) {
                        s += c1[j];
                    }
                }
            }
        }
        return s.strip();
    }
    public static void main(String[] args) {
        String s[] = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }
}