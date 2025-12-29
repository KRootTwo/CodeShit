public class Q07 {

    public static void lp1(int yr) {

        if (yr % 400 == 0) {
            System.out.println (yr +" Year is a leapyear.");
        } else if (yr % 4 == 0 && yr % 100 != 0) {
            System.out.println (yr +" Year is a leapyear.");
        } else {
            System.out.println (yr +" Year is not a leapyear.");
        }
    }

    public static void lp2 (int yr) {

        if (yr % 100 == 0) {
            if (yr % 400 == 0 && yr % 4 == 0) {
                System.out.println (yr + " Year is a leapyear.");
            } else  {
                System.out.println (yr + " Year is not a leapyear.");
            }
        } else {
            if (yr % 4 == 0) {
                System.out.println (yr + " Year is a leapyear.");
            } else {
                System.out.println (yr + " Year is not a leapyear.");
            }
        }
    }
    public static void lp3 (int yr) {

        String output =((yr % 100 == 0)? ((yr % 400 == 0)? yr + " Year is a leapyear.":yr + " Year is not a leapyear." ):((yr % 4 == 0)? yr + " Year is a leapyear.": yr + " Year is not a leapyear."));
        System.out.println(output);
    }

    public static void main (String args []) {
        lp1(2001);
        lp2(2001);
        lp3(2001);
    }

}
