package ass5;

import java.util.Scanner;

public class Q02 {
	public static void divNine(int x) {
		int count = 0;
		int n = x, sum1 = 0;
		
		while (x > 0) {
			sum1 += (x % 10) ;
			x = x / 10 ;
		}
		if (sum1 % 9 == 0) {
			System.out.println("Div by 9");
		} else {
			System.out.println("Not Div by 9");
		}
	}

	public static void main (String args[]) {
		Scanner blehh = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = blehh.nextInt();
		
		divNine (n);
		
	}
}
