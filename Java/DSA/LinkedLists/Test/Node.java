public class Node {
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

    public Node insert(Node head, int val) {
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
    public Node insert(Node head, int val[]) {
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
    public void display(Node head) {
        if (head == null) return;
        for(Node t = head; t != null; t = t.next) {
            System.out.print(t.val + " -> ");
        }
        System.out.print("NULL\n");
    }

}