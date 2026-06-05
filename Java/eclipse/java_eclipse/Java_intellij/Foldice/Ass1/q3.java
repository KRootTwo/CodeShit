import java.util.*;

public class q3 {
	public static void main (String [] args) {
		
		Scanner blehh = new Scanner(System.in);
        	
		do {
        		System.out.print ("Enter number of rows: ");
        		int n = blehh.nextInt();
			
			if (n != 0) {
				if (n % 2 == 0) {
					System.out.println ("Even.");
				}else {
					System.out.println ("Odd.");
				}
			} else {
				break;
			}

		} while (true);
		
		
	}


}
