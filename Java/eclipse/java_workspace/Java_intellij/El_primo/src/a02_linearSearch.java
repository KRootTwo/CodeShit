import java.util.Scanner;

public class a02_linearSearch {

    public static int lS(String bl[], String key) {
        for (int i = 0; i < bl.length; i++) {

            bl[i] = bl[i].toLowerCase();
            key = key.toLowerCase();

            if (bl[i].equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        System.out.println("Name that shitter: ");
        String shitter = blehh.nextLine();

        String mcs[] = {"vizion", "yefan911", "moone", "prodsb", "bbathh", "bebop"};

        System.out.println("shitter at " + lS(mcs, shitter));
    }
}
