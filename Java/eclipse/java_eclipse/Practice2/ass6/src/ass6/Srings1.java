package ass6;

public class Srings1 {

	public static void main(String[] args) {
		String s = new String("abc");
		String S = new String("ABC");
		String s1 = new String("Hello");

		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.equals(S));
		System.out.println(s.equalsIgnoreCase(S));
		System.out.println(s.concat(S));
		System.out.println(s.compareTo(S));
		System.out.println(s.compareToIgnoreCase(S));
		System.out.println(s.startsWith("a"));
		System.out.println(s.endsWith("C"));
		System.out.println(s1.indexOf("l"));
		System.out.println(s1.lastIndexOf("l"));
		System.out.println(s.substring(0));
		System.out.println(s.substring(1));
		System.out.println(s.substring(2));
		System.out.println(s1.substring(1, s1.length()));

	}

}
