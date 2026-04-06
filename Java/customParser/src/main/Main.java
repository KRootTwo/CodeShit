public class Main {
    public static String[] advCSVParser(String line) {
        char ch = ',';
        String sh = ",";

        for (char c : line.toCharArray()) {

        }
    }

    public static void main(String[] args) {
        String line = "1,The Hobbit, part 1,J.R.R. Tolkein,fantasy,hobbit,389,20260105,389,1,0,20260510,epic";

        char arr[] = line.toCharArray();
        // System.out.println((Arrays.toString(arr)));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
