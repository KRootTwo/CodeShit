import java.util.*;

public class Qn30 {
    
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ls = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        int wordLen = words[0].length();
        int arrLen = words.length;

        int left = 0, right = arrLen * wordLen;
        
        while (right <= s.length()) {
            HashMap<String, Integer> map2 = new HashMap<>();
            int j = left;
            for (int i = j; i <= right; i += wordLen) {
                // System.out.println(left + "\t" + i);
                String sub = s.substring(j, i);
                map2.put(sub, map2.getOrDefault(sub, 0) + 1);
                j += wordLen;
            }
            if (map.equals(map2)) {
                ls.add(left);
            }
            String sub = s.substring(left, left + wordLen);
            map2.put(sub, map2.getOrDefault(sub, 0) - 1);
            left++;
            if (right < s.length()) {
                sub = s.substring(right, right + wordLen);
            }
            right++;
            map2.put(sub, map2.getOrDefault(sub, 0) + 1);
        }

        // System.out.println(map);
        // System.out.println(map2);
        return ls;
    }
    public static void main(String[] args) {
        String s = "barfoofoobarthefoobarman";
        String words[] = {"bar","foo","the"};

        List<Integer> ls = findSubstring(s, words);
        System.out.println(ls);
    }
}

/*
if (map.containsKey(word)) {
    map.put(word, map.get(word) + 1);
} else {
    map.put(word, 1);
}

for (String st : words) {
            map.put(st, map.getOrDefault(st, 0) + 1);
        }
*/

/*
 List<Integer> ls = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        if (words.length <= 0) return ls;
        for (String st : words) {
            map.put(st, map.getOrDefault(st, 0) + 1);
        }

        // System.out.println(set);

        int wordLen = words[0].length();
        int arrLen = words.length;
        int left = 0, right = wordLen * arrLen;

        while (right < s.length()) {
            String str = s.substring(left, right);
            if ()
        }

        
        return ls;
*/