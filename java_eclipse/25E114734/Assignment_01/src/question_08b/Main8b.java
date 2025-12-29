package question_08b;
import java.util.Scanner;

public class Main8b {
	public static void main(String[] args) {
		Scanner gh = new Scanner(System.in);
		System.out.print("First Number: ");
		int a = gh.nextInt();
		System.out.print("First Number: ");
		int b = gh.nextInt();
		
//		int a = 10 ;
//		int b = 5 ;
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		
		System.out.println("Swapping numbers...");
		
		a = a+b ;
		b = a-b ;
		a = a-b ;
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		
	}
}
