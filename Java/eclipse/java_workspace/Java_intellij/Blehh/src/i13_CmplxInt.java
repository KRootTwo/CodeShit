import java.util.Scanner;

//                     Create a program to calculate Compound interest.
//                         Compound Interest = P(1 + R/100)t

public class i13_CmplxInt {
    public static void main(String[] args) {
        Scanner piss = new Scanner(System.in);
        System.out.print("Principal(in rupees) P = ");
        float p = piss.nextFloat();
        System.out.print("Rate of interest per annum(in %) R = ");
        float r = piss.nextFloat();
        System.out.print("Time(number of years) T = ");
        float t = piss.nextFloat();

        System.out.println("\nCalculating yo goddamn interest...");

        float cmplxi = (p*(1 + r/100)*t) ;
        System.out.println("\nYour Interest sum is " + cmplxi + " rupees");
    }
}
