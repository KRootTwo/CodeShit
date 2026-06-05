public class Main {

    static void pat1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    static void pat2() {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5-i; j++) {
                    System.out.print(" *");
                }
                System.out.println();
        }
    }

    static void pat3() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    static void pat4() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i-1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= 5 - i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        pat1();
        System.out.println();
        pat2();
        System.out.println();
        pat3();
        System.out.println();
        pat4();



    }
}
