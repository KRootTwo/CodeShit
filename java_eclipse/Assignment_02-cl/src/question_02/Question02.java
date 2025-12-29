package question_02;
import java.util.*;
import java.math.*;

public class Question02 {
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter radius: ");
		float rad = sc.nextFloat();
		System.out.print("Enter length: ");
		float len = sc.nextFloat();
		
		double area = Math.PI*Math.pow(rad, 2);
		double vol = area*len;
		
		System.out.println("The area of the cylinder is: " + area);
		System.out.println("The volume of the cylinder is: " + vol);
	}
}
