package question_03;
import java.util.*;
import java.math.*;

public class Question_03 {
	public static void main (String [] args) {
		Scanner blehh = new Scanner(System.in);
		System.out.print("Enter the basic salary amt: ");
		double sal = blehh.nextDouble();
		
//		double da = sal*0.4;
//		double hra = sal*0.2;
		
		double da = sal*(40.0/100);
		double hra = sal*(20.0/100);
		
		double grsal = (sal + da + hra);
		
		System.out.println("Your DA: " + da);
		System.out.println("Your HRA: " + hra);
		System.out.println("Your gross salary is: " + grsal);
		
	}
}
