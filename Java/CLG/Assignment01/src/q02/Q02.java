// The body mass index (BMI) is commonly used by health and nutrition professionals to estimate
// human body fat in populations. It is computed by taking the individual's weight (mass) in
// kilograms and dividing it by the square of their height in meters. i.e.
// Metric: BMI = 𝑾𝒆𝒊𝒈𝒉𝒕 (𝒌𝒈)/(𝑯𝒆𝒊𝒈𝒉𝒕)^𝟐 (𝒎^𝟐)

// Write a java program by using conditional statement to show the category for a given BMI.

// Category            BMI
// Less than 18.5      Underweight
// 18.5 to 24.9        Normal Weight
// 25.0 to 29.9        Overweight
// 30.0 or more        Obese


import java.util.Scanner;
public class Q02 {
    public static String bmi(float f) {
        String s;
        if (f < 0) s = "Invalid Weight & height";
        else if (f < 18.5) s = "Underweight";
        else if (f >= 18.5 && f <= 24.9) s = "Normal Weight";
        else if (f >= 25 && f <= 29.9) s = "Overweight";
        else s = "Obese";
        return s;
    }
    public static float bmiC(float w, float h) {
        return (float) (w/(Math.pow(h, 2)));        
    }
    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        System.out.print("Enter Height(m) & Weight(kg): ");     
        float h = blehh.nextFloat();
        float w = blehh.nextFloat();
        System.out.println("You're " + bmi(bmiC(h, w)));
    }
}
