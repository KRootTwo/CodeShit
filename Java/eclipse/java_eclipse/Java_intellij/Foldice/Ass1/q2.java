import java.util.*;

public class q2 {
	public static void main (String [] args) {
	
		Scanner blehh = new Scanner(System.in);
		System.out.print ("Enter number of rows: ");
		int n = blehh.nextInt();
	
		String ruler = "";
		
		for (int i = 0; i < n; i++) {
			ruler = ruler + (i +1) + ruler ;
			System.out.println(ruler);
	
		}
	


	}


}
