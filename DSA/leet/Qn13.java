
import java.util.HashMap;

public class Qn13 {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int res = 0;
        char c[] = s.toCharArray();
        int i = 0, len = c.length;
        while (i < len) {
            int nx = (i < len - 1) ? map.get(c[i + 1]) : map.get(c[i]);
            int cu = map.get(c[i]);
            if (cu < nx) {
                // System.out.println(cu + " + " + nx);
                res += nx - cu;
                i += 2;
            }
            else {
                // System.out.println(cu);
                res += cu;
                i++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("III"));
    }
}

/*
        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
*/