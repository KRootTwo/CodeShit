package ass6;

import java.util.Scanner;

/*
 * Some websites impose specific rules for passwords to ensure security. Write a Java
program that checks whether a given string is a valid password based on the following
rules:
Password Rules
1. A password must have at least eight characters.
2. A password must consist of only letters and digits.
3. A password must contain at least two digits.
The program should include a method with the following header:
public static boolean isValidPassword(String password)
• The method should take a string as input and return true if the password satisfies
all the rules, and false otherwise.
Program Requirement
• The program should prompt the user to enter a password.
• It should then display:
o "Valid Password" if the password meets all the rules, or
o "Invalid Password" if any rule is violated.
 */

public class Q16 {
	public static boolean valP(String pass) {
		char [] p = pass.toCharArray();
		boolean v = false; int dig = 0;
		
		if (pass.length() < 8) return false;
		
		for (int i = 0; i < p.length; i++) {
			if ((p[i] >= 48 && p[i] <= 57) || (p[i] >= 97 && p[i] <= 122) || (p[i] >= 65 && p[i] <= 90)){
				if (p[i] >= 48 && p[i] <= 57) dig++;
			} else {
				v = false;
				break;
			}
		}
		if (dig >= 2) v = true;
		return v;
	}
	public static boolean valp (String s) {
		boolean v = false; int d = 0;
		char c[] = s.toCharArray();
		if (s.length() < 8) return false; 
		for (char i : c) {
			if (Character.isDigit(i)) d++;
			else if (Character.isLetter(i));
			else return false;
		}
		if (d >= 2) v = true; 
		return v;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inp = sc.nextLine();
        
        if (valp(inp)) System.out.println("Valid");
        else System.out.println("InValid");
	}

}
