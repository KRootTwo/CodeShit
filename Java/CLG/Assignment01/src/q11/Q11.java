// Write a Java program that takes as input three integers, a, b, and c, from the Java console
// and determines if they can be used in a correct arithmetic formula (in the given order), like
// “a + b = c,” “a = b − c,” or “a b = c.”∗
public class Q11 {
    public static boolean isEl(int a, int b, int c) {
        if (c == a + b) {
            if (b - c == a) {
                if (c == a * b) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        isEl(1, 3, 5);
    }
}
