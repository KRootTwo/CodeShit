import java.util.Scanner;

//                 Create a program to convert Fahrenheit to Celsius
//                            °C = (°F - 32) × 5/9


public class i14_CelToFah {
    public static void main(String[] args) {
        Scanner heat = new Scanner(System.in);
        System.out.print("Put yo temperature in Fahrenheit F = ");
        float f = heat.nextFloat();

        System.out.println("\nConverting to Celsius...");

        float temp = ((5*(f-32))/9) ;
        System.out.println("\nYo Temperature in Celsius is C = " + temp);
    }
}
