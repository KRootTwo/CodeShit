package question_05;
import java.math.*;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner blud = new Scanner(System.in);
		System.out.print("Radius of circle: ");
		int r = blud.nextInt();
		System.out.println("Perimeter of the circle is: " + r*Math.PI*2);
		System.out.println("Area of the circle is: " + Math.PI*Math.pow(r,2));
	}

}
