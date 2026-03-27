
// Write a Java program that can take a positive integer greater than 2 as input and write out the
// number of times one must repeatedly divide this number by 2 before getting a value less
// than 2

public class Q01 {
    public static int cnt(int n) {
        int c = 0;
        while (n > 2) {
            n /= 2;
            c = c + 1;
        }
        return c;
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        System.out.println("Division times: " + cnt(a));
        
    }
}
