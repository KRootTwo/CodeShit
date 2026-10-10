class Node {
    int val;
    Node next;

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}
public class swap{

    public static Node insert(Node head, int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            return head;
        }
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = newNode;
        return head;
    }
    public static Node insert(Node head, int val[]) {
        int l = val.length;
        if (l <= 0) {
            if (head == null) return null;
            return head;
        }
        
        Node newNode = new Node(val[0]);
        if (head == null) head = newNode;

        Node t = head;
        while (t.next != null) {
            t = t.next;
        }

        for (int i = 1; i < l; i++) {
            Node p = new Node(val[i]);
            t.next = p;
            t = t.next;
        }
        return head;
    }
    public static void display(Node head) {
        if (head == null) return;
        for(Node t = head; t != null; t = t.next) {
            System.out.print(t.val + " -> ");
        }
        System.out.print("NULL\n");
    }
    public static Node swap (int id1, int id2, Node head) {
        Node t1 = head;
        Node t2 = head;

        for (int i = 0; i < id1 - 1; i++) {
            t1 = t1.next;
        }
        for (int i = 0; i < id2 - 1; i++) {
            t2 = t2.next;
        }
        Node tg1 = t1.next;
        Node tg2 = t2.next;

        Node t3 = t1.next.next;
        Node t4 = t2.next.next;

        t1.next = tg2;
        tg2.next = t3;

        t2.next = tg1;
        tg1.next = t4;

        return head;
    }
    
    public static void main(String[] args) {
        Node head = null;
        int vals[] = {22, 33, 44, 55, 66, 77, 88, 99};

        head = insert(head, vals);
        display(head);

        swap(2, 5, head);

        display(head);
    }
}