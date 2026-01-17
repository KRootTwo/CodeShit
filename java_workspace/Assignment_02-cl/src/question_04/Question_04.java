package question_04;
import java.util.*;
import java.math.*;

public class Question_04 {
	public static void main(String [] args) {
		Scanner blehh = new Scanner(System.in);
		System.out.print("Enter one side of the hexagon: ");
		double sd = blehh.nextDouble();
		
		double area = (3.0/2.0) * Math.sqrt(3) * Math.pow(sd, 2);
		
//		double area = (3.0/2.0) * Math.sqrt(3) * sd * sd;
		
		System.out.println("The area of the hexagon is: " + area);
	}
}
