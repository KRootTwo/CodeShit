import java.util.Scanner;

public class A1QH2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] lines = new String[n];
        for (int i = 0; i < n; i++) {
            lines[i] = sc.nextLine();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(lines[i]);
        }
    }
}

