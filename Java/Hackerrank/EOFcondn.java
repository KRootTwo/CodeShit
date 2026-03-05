import java.util.*;

public class EOFcondn {

    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        int n = 0;
        while (blehh.hasNext()) {
            String s = blehh.nextLine();
            System.out.println(++n + " " +s);
        }
        blehh.close();
    }
}

/**
 * The Scanner class is often used for reading text and is a common method for handling an unknown number of input lines, especially in competitive programming scenarios. 

    Method: Use the hasNext() or hasNextLine() methods within a loop condition.
    Behavior at EOF: These methods return false when there is no more input to read, which naturally terminates the loop.
 */