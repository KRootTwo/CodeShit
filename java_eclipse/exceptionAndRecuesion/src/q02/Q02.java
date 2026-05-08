 package q02;

import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
		Scanner blehh = new Scanner(System.in); 
		String a[] = {"Red", "White", "Black", "Green", "Bruhh"};
		try {
			while (true) {
				int i = 0, next;
				System.out.println("Ur favourite color: " + a[i]);
				while (true) {
					System.out.println("1 for next, 0 to stop: ");
					next = blehh.nextInt();
					if (next == 1) {
						System.out.println(a[++i]);
					}
					else {
						break;
					}
				}
			}
		}
		catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		finally {
			blehh.close();
		}
	}
}