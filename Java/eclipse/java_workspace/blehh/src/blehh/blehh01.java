package blehh;
import java.util.*;
import java.math.*;

//public class blehh01 {
//	public static void main (String args []) {
//		static int siUuu (int a, int b) {
//			return a*b ;
//		}
//		
//		
//		Test.siuuu(4, 5);
//	}
//}

class blehh01 {
    static int siUuu(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int result = siUuu(4, 5);  // call directly, because it's static
        System.out.println(result);
    }
}
