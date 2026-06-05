package question_05;
import java.util.*;
import java.math.*;

public class Question_05 {
	public static void main (String [] args){
		Scanner blehh = new Scanner(System.in);
		
		System.out.print("Enter x & y coordinates of first point: ");
		double x1 = blehh.nextDouble();
		double y1 = blehh.nextDouble();
		
		System.out.print("Enter x & y coordinates of second point: ");
		double x2 = blehh.nextDouble();
		double y2 = blehh.nextDouble();
		
		double dist = Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println("The distance between the two points = " + dist);
	}
}
