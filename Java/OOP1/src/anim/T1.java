public class T1 {
    public static void main(String[] args) {
        String[] frm = {
            "Shut",
            "Yo",
            "Bitch",
            "Ass",
            "Up",
            "Nigga"
        };
        for (int i = 0; i < frm.length; i++) {
            System.out.println("\033[H\033[2J");
            System.out.println(frm[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
    }
}
