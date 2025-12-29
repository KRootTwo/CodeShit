import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter units: ");
        int n = sc.nextInt();

        switch (n) {
            default :
                System.out.println("RED");
            case 'a' :
                System.out.println("BLUE");
            case 'b' :
                System.out.println("GREEN");
                break;
            case 'c' :
                System.out.println("ORANGE");
//            default :
//                System.out.println("RED");
        }

    }
}
