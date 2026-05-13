public class LL {
    private class Node {
        private int value;
        private Node next;

        public Node (int value) {
            this.value = value;
            this.next = null;
        }

        public Node getNext() {
            return next;
        }

        public int getValue() {
            return value;
        }
        
    }

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }
    public LL(int val) {
        Node node = new Node(val);
        head = node;
        tail = node;
    }

    public void insertRec(int val, int index) {
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node t = new Node(val);
            t.next = node.next;
            node.next = t;
            size++;
            return t;
        }
        node.next = insertRec(val, index--, node.next);
    }
}
