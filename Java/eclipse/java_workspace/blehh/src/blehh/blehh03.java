package blehh;
import java.util.*;
import java.math.*;

public class blehh03{
    public static void main (String [] args) {
    	Scanner siu = new Scanner(System.in);
    	int ngg = (int) (Math.random()*10);
    	int gg = -1;
    	int guesses = 0;
    	
    	while (gg != ngg) {
    		System.out.print("Enter yo number(0-9) fam: ");
    		gg = siu.nextInt();
    		guesses++;
    		
    		if (gg == ngg) {
    			System.out.println("Siuuuu Nigga. Guesses = " + guesses);
    		} else if (gg > ngg) {
    			if (gg - ngg == 1) {
    				System.out.println("Slightly higher Nigga. Try Again.");
    			} else {
    				System.out.println("Too high Nigga. Try Again.");
    			}
    		} else {
    			if (Math.abs(gg - ngg) == 1) {
    				System.out.println("Slightly lower Nigga. Try Again.");
    			} else {
    				System.out.println("Too low Nigga. Try Again.");
    			}
    		}
    	}
    	siu.close();
    }
}