package ass5;
import java.util.*;

public class Q01 {
	public static boolean isPrime(int x) {
		int count = 0;
		for (int i = 2; i <= Math.sqrt(x); i++ ) {
			if (x % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			return true;
		}
		return false;
	}

	public static void main (String args[]) {
		Scanner blehh = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = blehh.nextInt();
		int a = n, rev = 0;
		
		while (a > 0) {
			rev *= 10;
			rev += (a % 10) ;
			a = a / 10 ;
		}
			if (isPrime(n)) {
				if ((isPrime(rev))) {
					System.out.println("Twisted Prime.");
				}
			} else {
				System.out.println("Not Twisted Prime.");
			}
		
	}
}
