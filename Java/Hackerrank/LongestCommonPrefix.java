public class LongestCommonPrefix {
    public static String lcp(String[] strs) {
        String g = "";
        char s[] = strs[0].toLowerCase().toCharArray();
        for (int i = 1; i < strs.length; i++) {

            char c[] = strs[i].toLowerCase().toCharArray();

            if (strs[i].length() == 0) return "";

            else if (strs[i].length() == 1) {
                if (s.length == 0) return "";
                else if (s[0] == c[0]) {
                    g += s[0];
                    return g;
                }
                else return "";
            }

            int x = Math.min(s.length, c.length);

            for (int k = 0; k < x && s[k] != '0'; k++) {
                if (c[k] != s[k]) {
                    s[k] = '0';
                    break;
                }
            }
            if (x < s.length) s[x] = '0'; 
        }
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '0') break;
            if (s[i] != '0') g += s[i];
        }
        return g;
    }
    public static void main(String[] args) {
        String strs1[] = {"flower","flow","flight"};
        String strs2[] = {"aa", "ab"};
        String strs3[] = {"ab", "a"};
        String strs4[] = {"ab", "abc"};
        String strs5[] = {"b", "a"};
        String strs6[] = {"a","a","b"};

        System.out.println(lcp(strs1));
        System.out.println(lcp(strs3));
        System.out.println(lcp(strs4));
        System.out.println(lcp(strs5));
        System.out.println(lcp(strs6));
        System.out.println(lcp(strs2));
    }
}


    // public static String lcp(String[] strs) {
    //     String g = "";
    //     char s[] = strs[0].toLowerCase().toCharArray();

    //     for (int i = 1; i < strs.length; i++) {

    //         char c[] = strs[i].toLowerCase().toCharArray();

    //         if (strs[i].length() == 0) return "";

    //         int x = Math.min(s.length, c.length);

    //         for (int k = 0; k < x && s[k] != '0'; k++) {
    //             if (c[k] != s[k]) {
    //                 s[k] = '0';
    //                 break;
    //             }
    //         }

    //         if (x < s.length) s[x] = '0';
    //     }

    //     for (int i = 0; i < s.length; i++) {
    //         if (s[i] == '0') break;
    //         g += s[i];
    //     }

    //     return g;
    // }
