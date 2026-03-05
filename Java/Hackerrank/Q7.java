import java.text.*;
import java.util.*;

public class Q7 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        // NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.INDIA);
        // double us = nf1.format(payment);
        
        // System.out.println("US: " + us);
        // System.out.println("India: " + india);
        // System.out.println("China: " + china);
        // System.out.println("France: " + france);
    }
}