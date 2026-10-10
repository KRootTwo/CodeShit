import java.util.*;

public class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;

    public Node (int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
    }

    public static Node start = null;
    public static Scanner in = new Scanner(System.in);

    public static void create(Node start) {
        System.out.print("Enter no of nodes: ");
    }
}
