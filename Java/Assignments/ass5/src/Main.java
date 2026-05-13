
import java.util.Scanner;


class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;

    public Node(int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
        this.prev = null;
    } 
}



public class Main {

    static Scanner in = new Scanner(System.in);
    static Node start = null;
    static Node end = null;

    public static Node create (Node start, Node end) {
        System.out.print("How many nodes: ");
        int n = in.nextInt();

        Node tr = end;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter reg & marks: ");
            int r = in.nextInt();
            float m = in.nextFloat();

            Node newNode = new Node(r, m);

            if (tr == null || start == null) {
                start = newNode;
                end = newNode;
                tr = newNode;
            }
            else {
                tr.next = newNode;
                newNode.prev = tr;
                tr = newNode;
                end = newNode;
            }
        }
        return end;
    }
    public static Node insBeg (Node start, Node end) {
        System.out.print("Enter reg & marks: ");
        int r = in.nextInt();
        float m = in.nextFloat();

        Node newNode = new Node(r, m);

        if (start == null) {
            start = newNode;
            end = newNode;
        }
        else {
            newNode.next = start;
            start.prev = newNode;
            start = newNode;
        }
        return start;
    }
    public static Node insEnd (Node start, Node end) {
        System.out.print("Enter reg & marks: ");
        int r = in.nextInt();
        float m = in.nextFloat();

        Node newNode = new Node(r, m);

        if (start == null) {
            start = newNode;
            end = newNode;
        }  
        else {
            end.next = newNode;
            newNode.prev = end;
            end = newNode;
        }
        return start;
    }
    public static Node insAny (Node start, Node end) {
        int size = 0;
        System.out.print("Enter index: ");
        int id = in.nextInt();

        for (Node node = start; node != null; node = node.next) {
            size++;
        }

        if (id < 0 && id > size + 1) {
            throw new IndexOutOfBoundsException("invalid index mate");
        }
        else if 

        System.out.print("Enter reg & marks: ");
        int r = in.nextInt();
        float m = in.nextFloat();

        Node newNode = new Node(r, m);
    }

    public static void main(String[] args) {
        
    }
}
