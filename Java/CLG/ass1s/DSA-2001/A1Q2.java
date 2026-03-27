import java.util.*;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter person Weight in kg: ");
        double w = sc.nextDouble();
        System.out.print("Enter person Height in kg: ");
        double h = sc.nextDouble();
        double bmi = w/(h*h);
        if (bmi < 18.5)
            System.out.println("The person is Underweight.");
        else if(bmi >= 18.5 && bmi <= 24.9)
            System.out.println("The person is Normalweight.");
        else if(bmi >= 25.0 && bmi <= 29.9)
            System.out.println("The person is Overweight.");
        else
            System.out.println("The person is Obese.");
        
        
    }
    
}
