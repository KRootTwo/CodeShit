
import java.util.Scanner;

public class Main2 {
    static class Node {
        int info;
        Node next;

        public Node(int info) {
            this.info = info;
        }
    }
    Node top;

    static Scanner in = new Scanner(System.in);

    public static Node push(Node top) {
        System.out.print("Enter info: ");
        int n = in.nextInt();

        Node newNode = new Node(n);
        
        if (top == null) {
            top = newNode;
            return top;
        }
        top.next = newNode;
        top = newNode;
        return top;
    }
    public static Node pop(Node top) {
        if (top == null) {
            throw new IllegalStateException("Empty stack mate");
        }
        top = top.next;
        return top;
    }
    public static void display(Node top) {
        
    }

}
