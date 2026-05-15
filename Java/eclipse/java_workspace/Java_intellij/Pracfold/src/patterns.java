public class patterns {


    public static void numTrig1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void starTrig1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void numTrig2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void alphTrig1 (int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(64 + j) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void dolTrig(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void dolTrigMir(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void dolTrigRev(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void dolTrigRevMir(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n - i + 1 ; k++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void starDigSq(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > 0; j--) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 2*(n - i); k > 0; k--) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int k = 2*(n - i); k > 0; k--) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }






    public static void main(String[] args) {
        numTrig1(5);
        starTrig1(5);
        numTrig2(5);
        alphTrig1(5);
        dolTrig(5);
        dolTrigMir(5);
        dolTrigRev(5);
        dolTrigRevMir(5);
        starDigSq(5);
        butterfly(5);

    }
}