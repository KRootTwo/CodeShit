package q01;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner blehh = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = blehh.nextInt();
		try {
			if (n > 0) {
				System.out.println("Here's yo lucky number: " + n);
			}
			else {
				throw new NumberFormatException("Negatives ain't allowed fam");
			}
		}
		catch (NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
		}
		finally {
			blehh.close();
		}
	}
}
