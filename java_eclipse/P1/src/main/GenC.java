import java.util.HashSet;
import java.util.Set;

public class GenC {
    private static String s;

    public GenC(String s) {
        this.s = s;
    }

    public static Set<String> abvNames(String s) {
        Set<String> set = new HashSet<>();
        String a = s.replaceAll("\\s+", "").strip().toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < s.length(); k++) {
                    if (i != j && i != k && j != k) {
                        set.add("" + s.charAt(i) + s.charAt(j) + s.charAt(k));
                    }
                }
            }
        }
        return set;
    }    
}