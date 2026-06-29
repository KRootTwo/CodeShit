import java.util.*;

public class Qn30 {
    
    public static List<Integer> findSubstring(String s, String[] words) {
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