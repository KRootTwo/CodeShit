package question_08;
import java.util.*;
import java.math.*;


public class Question_08 {
	public static void main(String [] args ) {
		Scanner blehh = new Scanner(System.in);
		System.out.print("Enter the number of eggs = ");
		int egg = blehh.nextInt();
		
		int gross = (int)(egg/144);
		int dozen = (int)((egg - gross*144) /12);
		int leggs = (int)((egg - gross*144 - dozen*12)%12);
		
		System.out.println("You have " + gross + 
				" gross " + dozen + " dozen & " + leggs + 
				" eggs left." );
		
	}
}
