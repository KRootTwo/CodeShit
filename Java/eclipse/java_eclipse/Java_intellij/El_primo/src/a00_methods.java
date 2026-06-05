public class a00_methods {
    //1
    public static void helwo () {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }
    //2  Sum  ( Overloading Functions )
    public static int sum (int x, int y) {
        return x + y ;
    }
    public static int sum (int x, int y, int z) {
        return x + y + z ;
    }
    public static double sum (double x, double y) {
        return x + y ;
    }
    //3  Swapping
    public static void swap (int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println(a + " " + b);
    }
    //4  Factorial
    public static double factorial (double h) {
        double f = 1;
        for (int i = 1; i <= h ; i++) {
            f *= i ;
        }
        return f;
    }
    //5  Prime or not
    public static boolean isPrime (int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    //6  Primes in range
    public static void primoRange(int a) {
        for (int j = 2; j < a; j++) {
            if ( isPrime(j) ) {
                System.out.println((j)) ;
            }
        }
    }
    //7  Binary to decimal
    public static void b2d (long b) {
        long d = 0, p = 0;
        while (b > 0) {
            d += ((b % 10) * Math.pow(2, p));
            b /= 10 ;
            p++;
        }
        System.out.println(d);
    }
    //8  Decimal to binary
    public static void d2b (long d) {
        long b = 0;
        while (d > 0) {
            b *= 10 ;
            b += ( d % 2 ) ;
            d /= 2 ;
        }
        long rev = 0;
        while (b != 0) {
            long dig = b % 10 ;
            rev = rev * 10 + dig ;
            b /= 10 ;
        }
        System.out.println(rev);
    }





    public static void main(String[] args) {
        helwo();       // 1
        System.out.println(sum(5, 9));   // 2
        int m = 10 ;
        int n = 69 ;
        swap(m, n);          // 3
        System.out.println(factorial(9));  // 4
        System.out.println( isPrime(9) );  // 5
        primoRange(97);
        b2d( 10101 );
        d2b(90);

    }
}
