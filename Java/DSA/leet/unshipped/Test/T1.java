public class T1 {
    public static long myHash(String s) {
        long h = 0;
        for (int i = 0; i < s.length(); i++) {
            h += (int) s.charAt(i);
        }
        return h;
    }
    public static void main(String[] args) {
        String s1 = "ktv";
        String s2= "tvk";

        System.out.println(myHash(s1));
        System.out.println(myHash(s2));
    }    
}
