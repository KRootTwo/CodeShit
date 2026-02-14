
public class T2 {

    public static void main(String[] args) {
        String[] f1 = {
            "WHY DO", "WE FALL", "BRUCE?"
        };
        String[] f2 = {
            "SO WE CAN", "LEARN TO",
            "PICK OURSELVES", "UP.", "       -BATMAN BEGINS"
        };
        System.out.print("\033[?25l");

        for (int d = 0; d < f1.length; d++) {
            char[] i = f1[d].toCharArray();
            for (char s : i) {
                System.out.print("\033[1m\033[31m" + s + "\033[0m");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                }
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }

        System.out.println();
        System.out.println("\033[H\033[2J");
        System.out.flush();

        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
        }

        for (int d = 0; d < f2.length; d++) {
            char[] i = f2[d].toCharArray();
            for (char s : i) {

                System.out.print("\033[1m\033[32m" + s + "\033[0m");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                }
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }

        System.out.print("\033[?25h");
    }
}
