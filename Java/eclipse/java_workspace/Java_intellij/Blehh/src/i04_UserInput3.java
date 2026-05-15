import java.util.Scanner ;

public class i04_UserInput3 {
    public static void main (String [] args) {
        Scanner firstNumber = new Scanner (System.in) ;
        System.out.print("Enter first number fam: ");
        int fn = firstNumber.nextInt() ;
        System.out.println("first_number_--confirmed: " + fn) ;

        Scanner secondNumber = new Scanner(System.in) ;
        System.out.print("Enter second number fam: ") ;
        int sn = secondNumber.nextInt() ;
        System.out.println("second_number_--confirmed: ") ;

        int sumn = fn + sn ;
        System.out.println("Your sum is: " + sumn);

        System.out.println("FUCK YOU NIGGA!");
    }
}
