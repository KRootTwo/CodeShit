import java.util.*;

public class Qn438 {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ls = new ArrayList<>();
        int freqP[] = new int[26];
        int freq[] = new int[26];
        int n = p.length();

        for (int i = 0; i < n; i++) {
            freqP[p.charAt(i) - 'a']++;
        }

        int lft = 0;
        for (int rgt = 0; rgt < s.length(); rgt++) {
            freq[s.charAt(rgt) - 'a']++;

            if ((rgt - lft + 1) > n) {
                freq[s.charAt(lft++) - 'a']--;
            }
            if (rgt - lft + 1 == n) {
                boolean shit = true;
                for (int i = 0; i < freq.length; i++) {
                    if (freq[i] != freqP[i]) {
                        shit = false;
                        break;
                    }
                }
                if (shit) {
                    ls.add(lft);
                }
            }
            else {}
        }
        return ls;
    }
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";

        List<Integer> cl = findAnagrams(s, p);

        for (int i = 0; i < cl.size(); i++) {
            System.out.print(cl.get(i) + " ");
        }
        System.out.println();
    }
}

/*
List<Integer> ls = new ArrayList<>();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < p.length(); i++) {
            set.add(p.charAt(i));
        }

        int lft = 0;
        long l = myHash(p);
        for (int rgt = 0; rgt < s.length(); rgt++) {
            
            if (l == myHash(s.substring(lft, rgt))) {
                ls.add(lft);
                lft++;
            }
            if (!set.contains(s.charAt(rgt))) {
                lft = rgt + 1;
            } 
            if (s.substring(lft, rgt).length() > p.length()) {
                if (rgt < s.length() - 1) {
                    lft = rgt + 1;
                }
            }
        }
        return ls;
*/