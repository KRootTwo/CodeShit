import java.util.Scanner;

//                       Create a program to calculate simple interest.
//                             Simple Interest = (P x T x R)/100

public class i12_SimpInt {
    public static void main(String[] args) {
        Scanner piss = new Scanner(System.in);
        System.out.print("Principal(in rupees) P = ");
        float p = piss.nextFloat();
        System.out.print("Rate of interest per annum(in %) R = ");
        float r = piss.nextFloat();
        System.out.print("Time(number of years) T = ");
        float t = piss.nextFloat();

        System.out.println("\nCalculating yo goddamn interest...");

        float si = ((p * r * t)/100) ;
        System.out.println("\nYour Interest sum is " + si + " rupees");
    }
}
