import java.sql.SQLOutput;
import java.util.Scanner;

public class i07_SwapNumbers {
    public static void main(String[] args) {
        System.out.println(" This The Swapping Station Nigga!!!!!");

        Scanner fn = new Scanner(System.in);
        System.out.print("Put yo first number fammm a = ");
        int a = fn.nextInt();

        Scanner sn = new Scanner(System.in);
        System.out.print("Put yo second number fammm b = ");
        int b = sn.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("Swapping De Numbers");

        int c = a ;
        a = b ;
        b = c ;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
