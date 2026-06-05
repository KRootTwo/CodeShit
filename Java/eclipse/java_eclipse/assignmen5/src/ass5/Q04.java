package ass5;

import java.util.Scanner;

public class Q04 {
	
	public static int factorCount(int x) {
		int count = 0;
		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				count++;
			}
		}
		return count;
	}
	public static int countFactMax(int a, int b) {
		int p = 0, count = 0;
		for (int i = a; i <= b; i++) {
			int j = Q04.factorCount(i);
			if (j > p) {
				p = j;
				count++;
			} 
		}
		return (a + count);
	}
	
	
	public static void main (String args []) {
		Scanner blehh = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n1 = blehh.nextInt();
		int n2 = blehh.nextInt();
		
		System.out.println(countFactMax(n1, n2));
//		System.out.println(factorCount(n1));
		
		
	}
	
}
