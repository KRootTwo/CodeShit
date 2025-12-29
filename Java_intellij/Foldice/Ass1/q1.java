import java.util.*;
public class q1 {
	public static void main (String [] args) {
	
		Scanner blehh = new Scanner(System.in);
		System.out.print("Enter yo number: ");
		int n = blehh.nextInt();
		int sum = 0;
	
		while (n>0) {
			sum += n%10 ;
			n = ((int) n/10);	
		}
	
		if (sum%9 == 0) {
			System.out.println ("Number is divisible by 9.");
		} else {
			System.out.println ("Number is not divisible by 9.");
		}
	}
}
