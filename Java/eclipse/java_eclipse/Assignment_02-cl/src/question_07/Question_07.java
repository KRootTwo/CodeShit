package question_07;
import java.util.*;
import java.math.*;

public class Question_07 {
	public static void main (String [] args) {
		Scanner siu = new Scanner(System.in);
		System.out.print("Enter tze base(a) = ");
		int a = siu.nextInt();
		System.out.print("Enter tze power(b) = ");
		int b = siu.nextInt();
		int pow = (int) Math.pow(a, b);
		System.out.println(a +" "+ b +" "+"  " + pow);
		
		int pow2 = (int) Math.pow(a++, b++);
		System.out.println(a +" "+ b +" "+"  " + pow2);
		
		int pow3 = (int) Math.pow(a++, b++);
		System.out.println(a +" "+ b +" "+"  " + pow3);
		
		int pow4 = (int) Math.pow(a++, b++);
		System.out.println(a +" "+ b +" "+"  " + pow4);
		
		int pow5 = (int) Math.pow(a++, b++);
		System.out.println(a +" "+ b +" "+"  " + pow5);
	}
}
