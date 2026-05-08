
import java.util.Scanner;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}
public class Main {
    public static Node create(Node head) {
        Scanner blehh = new Scanner(System.in);

        System.out.print("Enter no. of nodes: ");
        int n = blehh.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            int d = blehh.nextInt();

            if (head == null) {
                Node p = new Node(d);
                head = p;
            }
            else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new Node(d);
            }
        }
        return head;
    }
    public static void show(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(6);
        head.next.next = new Node(7);

        show(head);

        // Node head = null;

        // create(head);

    }
}
