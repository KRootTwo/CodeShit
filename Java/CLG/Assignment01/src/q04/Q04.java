// Write a Java program that outputs all possible strings formed by using the characters 'c', 'a', 'r',
// 'b', 'o', and 'n' exactly once.
public class Q04 {
    public static void main(String[] args) {
        String s = "carbon";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < s.length(); k++) {
                    for (int l = 0; l < s.length(); l++) {
                        for (int m = 0; m < s.length(); m++) {
                            for (int n = 0; n < s.length(); n++) {
                                if (i != j && i != k && i != l && i != m && i != n &&
                                    j != k && j != l && j != m && j != n &&
                                    k != l && k != m && k != n &&
                                    l != m && l != n &&
                                    m != n) {
                                        System.out.println("" + s.charAt(i) + s.charAt(j) + 
                                        s.charAt(k) + s.charAt(l) + s.charAt(m) + s.charAt(n));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
