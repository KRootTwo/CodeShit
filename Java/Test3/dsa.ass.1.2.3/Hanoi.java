public class Hanoi {
    
    public static void towerOfHanoi(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + A + " to " + C);
            return;
        }

        towerOfHanoi(n - 1, A, C, B); // Step 1
        System.out.println("Move disk " + n + " from " + A + " to " + C); // Step 2
        towerOfHanoi(n - 1, B, A, C); // Step 3
    }

    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}