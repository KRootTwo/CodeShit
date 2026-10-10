import java.util.Scanner;

public class Mtils {
    public static boolean getY(Scanner in) {
        String s = in.next();
        return s.trim().toLowerCase().charAt(0) == 'y';
    }
    public static boolean getT(Scanner in) {
        String s = in.next();
        return s.trim().toLowerCase().charAt(0) == 't';
    }
    public static boolean getYT(Scanner in) {
        String s = in.next();
        return s.trim().toLowerCase().charAt(0) == 't' || s.trim().toLowerCase().charAt(0) == 'y';
    }

}
