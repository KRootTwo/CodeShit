
import java.util.Scanner;

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
    
}
public class q1 {
    public static Scanner in = new Scanner(System.in);
    public static Node insert(Node rear, Node front) {
        System.out.print("Enter val: ");
        int n = in.nextInt();

        Node newNode = new Node(n);

        if (front == null) {
            front = newNode;
            rear = newNode;
        }
        else {
            front.next = newNode;
            rear = newNode;
        }
        return front;
    }
    public static Node delete(Node rear, Node front) {
        if (front == null) return null;

        front = front.next;
        if (front == null) return null;
        return front;

    }
    public static void display(Node rear, Node front) {
        if (front == null) return;
        Node t = front;

        while (t != null) {
            System.out.print(t.val + " ");
            t = t.next;
        }
    }
    public static Node updateRear (Node front) {
        if (front == null) return null;
        Node t = front;
        while (t.next != null) {
            t = t.next;
        }
        return t;
    }

    public static void main(String[] args) {
        Node front , rear = null;
    }

}