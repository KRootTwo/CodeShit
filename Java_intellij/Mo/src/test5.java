import java.util.Scanner;
public class test5 {
    public static int rev (int n) {
        int s = String.valueOf(n).length();
        return s;
    }
    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        int n = blehh.nextInt();
        int d = 0;
        String s = "";
        for (int i = 1; i <= n; i++) {
            s = s + (d+i) + s ;
            System.out.println(s);
        }


    }
}
