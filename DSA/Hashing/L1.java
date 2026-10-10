import java.util.HashMap;

public class L1 {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("Ktv", 90);
        map.put("pol", 91);
        map.put("yut", 92);
        System.out.println(map.get("Ktv"));
    }
}

