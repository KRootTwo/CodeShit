import java.util.*;

import static java.lang.Integer.parseInt;

public class p02 {

    public static void divNine() {
        Scanner blehh = new Scanner(System.in);
        System.out.print("Enter Number(s): ");
        int n = blehh.nextInt();
        int sum = 0, m = n;

        while  (m > 0) {
            sum += m % 10;
            m /= 10;
        }
        if (sum % 9 == 0) {
            System.out.println("The number "+ n +" is divisible by 9.");
        } else {
            System.out.println("The number " + n + " is not divisible by 9.");
        }
    }

    public static void pat1 (int n) {
        String sh = "1";
        System.out.println(sh);

        for (int i = 2; i <= n; i++) {
            sh = sh + i + sh ;
            System.out.println(sh);
        }
    }

    public static boolean oddEven (int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void thInt() {
        Scanner blehh = new Scanner(System.in);
        System.out.print("Enter Number(s): ");
        int a = blehh.nextInt();
        int b = blehh.nextInt();
        int c = blehh.nextInt();

        for (int i = a; i <= b; i += c) {
            System.out.print(i + " ");
        }
    }

    public static void gcd() {
        Scanner blehh = new Scanner(System.in);
        System.out.print("Enter Number(s): ");
        int x = blehh.nextInt();
        int y = blehh.nextInt();

        while (y != 0) {
            int g = x % y ;
            x = y;
            y = g;
        }
        System.out.println("GCD is " + x);
    }

    public static long rmZero(long x) {
        long rev = 0;
        while (x > 0) {
            long z = x % 10;
            if (z != 0) {
                rev = rev * 10 + z;
            }
            x /= 10;
        }
        x = 0;
        while (rev > 0) {
            x = (x * 10) +rev % 10;
            rev /= 10;
        }
        return x;
    }

    public static boolean isPrime(int x) {
        int cnt = 0;
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                cnt++;
            }
        }
        if (cnt == 0) {
            return true;
        }
        return false;
    }

    public static void twisPrime(int m) {
        int n = m, rev = 0;
        while (n > 0) {
            rev = ((rev * 10) + (n % 10));
            n /= 10;
        }
        if (isPrime(m) && isPrime(rev) && isPrime(m) == isPrime(rev)) {
            System.out.println("Twisted Prime.");
        } else {
            System.out.println("Not Twisted Prime.");
        }
    }
    public static double fact(int n) {
        double f = 1, i = 1;
        for (i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
    public static void mnF() {
        Scanner blehh = new Scanner(System.in);
        System.out.print("entre numero uno: ");
        int a = blehh.nextInt();
        System.out.print("entre numero dos: ");
        int b = blehh.nextInt();

        double s = 0;

        for (int i = a; i <= b; i++) {
            s = p02.fact(i);
            System.out.println("Factorial of " + i + " is " + s);

        }
    }



    public static void main(String[] args) {
//        divNine();
//        pat1(n);
//        thInt();
//        gcd();
//        System.out.println(rmZero(1020030040));
//        twisPrime(97);
//        mnF();
    }
}
