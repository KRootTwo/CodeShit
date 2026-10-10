public class Qn8 {
	public static int myAtoi(String s) {
		char d[] = s.toCharArray();
		int i = 0;
		while (i < d.length && d[i] == ' ') {
			i++;
		}
		
		boolean isNegative = false;
		if (i < d.length && d[i] == '-') {
			isNegative = true;
			i++;
		}
		else if (i < d.length && d[i] == '+') i++;
		while (i < d.length && d[i] == '0') i++;
		
		long res = 0;
		while (i < d.length) {
			int c = (int) d[i];
			if (c < 48 || c > 57) break;
			
			res = res * 10 + (c - 48);
			
			if (!isNegative && res > Integer.MAX_VALUE) {
		        return Integer.MAX_VALUE;
		    }

		    if (isNegative && -res < Integer.MIN_VALUE) {
		        return Integer.MIN_VALUE;
		    }
			
			i++;
		}
		if (isNegative) {
	        res = -res;
	    }
	    if (res < Integer.MIN_VALUE) {
	        return Integer.MIN_VALUE;
	    }
	    if (res > Integer.MAX_VALUE) {
	        return Integer.MAX_VALUE;
	    }
	    return (int) res;
	}
	public static void main(String[] args) {
//		String s = "  490l8 ";
		System.out.println(myAtoi("9223372036854775808"));
		System.out.println();
	}

}

/*
 * String d = s.strip();
		boolean isNegative = false;

		if (d.charAt(0) == '-') {
			isNegative = true;
			d = d.substring(1, d.length());
		}
		
		long r = Long.parseLong(d);
		
		if (r < Integer.MIN_VALUE) return Integer.MIN_VALUE;
		if (r > Integer.MAX_VALUE) return Integer.MAX_VALUE;
		
		if (isNegative) return -(int)r;
		return (int)r;
 *
 */