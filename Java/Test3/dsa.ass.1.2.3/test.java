public class test {
    //  gcd(m,n)=gcd(n, m mod n).
    public static int gcd(int m, int n) {
        if (n == 0) {
            return 1;
        }
        return gcd(n, m % n);
    }

    // binary
    public static int bS(int a[], int start, int end, int tg) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (a[mid] == tg) {
            return mid;
        }
        else if (tg > a[mid]) {
            return bS(a, mid + 1, end, tg);
        }
        else {
            return bS(a, start, mid - 1, tg);
        }
    }
    
    public static void main(String[] args) {
        
    }
}