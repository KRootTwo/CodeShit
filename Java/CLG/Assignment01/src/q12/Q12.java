// Write a Java program that takes all the lines input to standard input and writes them to
// standard output in reverse order. That is, each line is output in the correct order, but the
// ordering of the lines is reversed.
import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        System.out.println("Enter lines write \"end\" to finish: ");
        String arr[] = new String[100];
        int c = 0;
        while (true) {
            String s = blehh.nextLine();
            if (s.strip().equalsIgnoreCase("end")) {
                break;
            }
            arr[c] = s; // store once
            c++;
        }
        for (int j = c - 1; j >= 0; j--) {
            System.out.println(arr[j]);
        }   
    }
}
