// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000

class roman {
    public static int eomToInt (String s) {
        String f = "";
        int i = 0;
        switch (f) {
            case "I":
                i += 1;
                break;
            case "II":
                i += 2;
                break;
            case "III":
                i += 3;
                break;
            case "IV":
                i += 4;
                break;
            case "V":
                i += 5;
                break;
            case "VI":
                i += 6;
                break;
            case "VII":
                i += 7;
                break;
            case "VIII":
                i += 8;
                break;
            case "IX":
                i += 9;
                break;
            case "X":
                i += 10;
                break;
            default:
                throw new AssertionError();
        }
    }
    public static void main(String[] args) {
        
    }
}