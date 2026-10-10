import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BTree bt = new BTree();
        bt.populate(in);
        bt.print();
    }
}
