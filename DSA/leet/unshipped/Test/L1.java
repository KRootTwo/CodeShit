package Test;
import static java.util.Objects.hash;

public class L1 {
    public static void main(String[] args) {
        Integer n = 10;
        String s = "KTV";

        // System.out.println(n.hashCode());
        // System.out.println(s.hashCode());

        int i1 = hash(s);
        int i2 = s.hashCode();

        System.out.println(i1 + "\n" + i2);
        System.out.println("\n" + i1 % 10 + " " + i2 % 10);

    }
}