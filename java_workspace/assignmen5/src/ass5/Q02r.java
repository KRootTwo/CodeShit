package ass5;

import java.util.Scanner;

public class Q02r {
	public static int factorSum(int x) {
		int sum = 0;
		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static void main (String args []) {
		Scanner blehh = new Scanner(System.in);
		System.out.print("Enter two number: ");
		int n1 = blehh.nextInt();
		int n2 = blehh.nextInt();
		
		if (n2 == factorSum(n1) & n1 == factorSum(n2) ) {
			System.out.println("Amicable.");
		} else {
			System.out.println("Not Amicable.");
		}
	}
}
