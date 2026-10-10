public class LL <T extends Number> {

    private class Node {
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }
        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        public T getValue() {
            return value;
        }
        public void setValue(T value) {
            this.value = value;
        }
        
    }

    private Node head;
    private Node tail;
    private int size;

    public LL () {
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public void insertH(T val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertT(T val) {
        Node node = new Node(val);
        
        if (tail != null) {
            tail.next = node;
        }
        tail = node;

        if (head == null) {
            head = tail;
        }
        size++;
    }

    public void deleteH() {
        if (size <= 1) {
            head = null;
            tail = null;
            size--;
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteT() {
        if (size <= 1) {
            head = null;
            tail = null;
            size--;
            return;
        }

        Node sLast = head;
        for (int i = 0; i < size - 2; i++) {
            sLast = sLast.next;
        }
        sLast.next = null;
        tail = sLast;
        size--;
    }

    public void deleteEle(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Wrong index mate");
            return;
        }
        else if (index == 0) {
            deleteH();
            return;
        }
        else if (index == size - 1) {
            deleteT();
            return;
        }
        
        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;
        size--;
    }

    public void reverse() {
        Node head, curr, nxt;

        head = this.head;
        curr = head.next;

        while (curr != null) {
            nxt = curr.next;
            curr.next = head;
            head = curr;
            curr = nxt;
        }
    }

    public void display() {
        Node node = head;

        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.print("END\n");
    }

    public double sum() {
        Node temp = head;
        double s = 0;

        while (temp != null) { 
            s += temp.value.doubleValue();
            temp = temp.next;
        }
        return s;
    }
}
