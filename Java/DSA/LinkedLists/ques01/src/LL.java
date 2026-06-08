public class LL {
    private class Node {
        private int value;
        private Node next;

        public Node (int value) {
            this.value = value;
            this.next = null;
        }
        public Node (int val, Node next) {
            this.value = val;
            this.next = next;
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
        Node temp = head;
        head = insertRec(val, index, temp);
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node newNode = new Node(val, node);
            size++;
            return newNode;
        }
        node.next = insertRec(val, index--, node.next);
        return node;
    }

    
    // private Node insertRec(int val, int index, Node node) {
    //     if (index == 0) {
    //         Node newNode = new Node(val, )
    //     }
    // }
    
    
}
