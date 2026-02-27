

public class T1 {
    public static int sumD(int number) {
        int sum = 0;
        while (number != 0){
            int d = number % 10;
            sum += d;
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        // Scanner blehh = new Scanner(System.in);
        // System.out.print("Enter an int: ");
        // int v = blehh.nextInt();
        // siuuu(v);

        // double d = 24.34563;
        // int a = d;

        // double b = 5.01;
        // int a = 'A';
        // System.out.println(a);
        System.out.println(sumD(9294));
    }
}
