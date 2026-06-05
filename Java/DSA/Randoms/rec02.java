public class rec02 {

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
    public static int pow(int x, int n) {
        if (n == 0) return 1;
        return x * pow(x, n - 1);
    }
    public static void revp(int n) {
        if (n < 0) {
            System.out.print("-");
            revp(-n);
            return;
        }
        if (n < 10) {
            System.out.print(n);
            return;
        }
        System.out.print(n % 10 + "");
        revp(n /= 10);
    }
    public static int fibo(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;
        return fibo(n - 1) + fibo(n - 2);
    }
    public static int gcd(int m, int n) {
        if (n == 0) return m;
        return gcd(n, m % n);
    }
    public static int bs(int arr[], int start, int end, int tg) {
        int mid = (start + end) / 2;

        if (arr[mid] == tg) return mid + 1;
        else if (arr[mid] > tg) return bs(arr, start, mid - 1, tg);
        else return bs(arr, mid + 1, end, tg);
    }
    public static void binr(int n) {
        if (n == 0) return;
        binr(n / 2);
        System.out.println(n % 2);
    }
    public static void revs(String s) {
        if (s.length() == 1) {
            System.out.print(s);
            return;
        }
        System.out.print(s.charAt(s.length() - 1));
        revs(s.substring(0, s.length() - 1));
    }
    public static String revst(String s) {
        if (s == null || s.length() <= 0) return s;
        return s.charAt(s.length() - 1) + revst(s.substring(0, s.length() - 1));
    }
    public static boolean pald(String s) {
        if (s == null || s.length() <= 1) return true;
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return pald(s.substring(1, s.length() - 1));
        }
        return false;
    }
    public static void swap(int arr[], int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
    public static void rear(int arr[], int left, int right, int k) {
        if (left >= right) return;
        if (arr[left] < k) rear(arr, left + 1, right, k);
        else if (arr[right] >= k) rear(arr, left, right - 1, k);
        else {
            swap(arr, left, right);
            rear(arr, left + 1, right - 1, k);
        }
    }

    public static void main(String[] args) {
        // System.out.println(fact(3));
        // System.out.println(pow(2, 6));
        // revp(-98);
        // System.out.println();
        // System.out.println(fibo(8));
        // System.out.println(gcd(10, 5));
        // int arr[] = {61, 62, 63, 64, 65, 66, 67, 68,69};
        // System.out.println(bs(arr, 0, arr.length - 1, 67));
        // binr(13);
        // revs("niggaaggin");
        // System.out.println();
        // System.out.println(revst("Nigga"));
        // System.out.println(pald("niggaaggin"));
    }
}