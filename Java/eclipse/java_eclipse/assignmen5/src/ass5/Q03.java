package ass5;

import java.util.Scanner;

public class Q03 {
	public static void strong(int n) {
		int x = n, su = 0;

		while (x > 0) {
			int fac = 1;
			for (int i = 1; i <= (x % 10); i ++) {
				fac *= i;
			}
			su += fac;
			x = x / 10;
		}
		if (su == n) {
			System.out.println("Strong AF");
		} else {
			System.out.println("Weak AH");
		}
	}
	
	public static void main (String args []) {
		Scanner blehh = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = blehh.nextInt();
		
		strong(n);
		
	}
}
