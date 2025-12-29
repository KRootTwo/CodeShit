package question_06;
import java.util.*;
import java.math.*;

public class Question_06 {
	public static void main (String [] args) {
		Scanner blehh = new Scanner(System.in);
		
		System.out.print("Enter x & y coordinates of first point: ");
		double x1 = blehh.nextDouble();
		double y1 = blehh.nextDouble();
		
		System.out.print("Enter x & y coordinates of second point: ");
		double x2 = blehh.nextDouble();
		double y2 = blehh.nextDouble();
		
		System.out.print("Enter x & y coordinates of third point: ");
		double x3 = blehh.nextDouble();
		double y3 = blehh.nextDouble();
		
		double sd1 = Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		double sd2 = Math.sqrt( Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		double sd3 = Math.sqrt( Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
		
		double s = ((sd1 + sd2 + sd3)/2.0);
		double area = Math.sqrt(s*(s-sd1)*(s-sd2)*(s-sd3));
		
		System.out.println("The area of the triangle = " + area);
	}
}
