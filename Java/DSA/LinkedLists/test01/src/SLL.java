public class SLL <T extends Number> {
    private class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public T getData() {
            return data;
        }
        public Node getNext() {
            return next;
        }
        
    }

    private int size;
    private Node head;
    private Node tail;

    public SLL() {
        this.size = 0;
        head = null;
        tail = null;
    }
    public Node getHead() {
        return head;
    }
    public Node getTail() {
        return tail;
    }

    public void insertH (T data) {
        Node p = new Node(data);
        p.next = head;
        head = p;

        if (tail == null) {
            tail = head;
        }
        size++;
    }
    public void insertT (T data) {
        Node p = new Node(data); 

        if (tail != null) {
            tail.next = p;
            tail = p;
        } 
        else {
            head = p;
            tail = p;
        }
        size++;
    }
    public void insertN (T data, int index) {
        if (index > size || index < 0) {
            System.out.println("Shit id");
            return;
        }
        else if (index == 0) {
            insertH(data);
            return;
        }
        else if (index == size) {
            insertT(data);
            return;
        }

        Node p = new Node(data);
        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }

        p.next = prev.next;
        prev.next = p;

        size++;
    }
    
    public void deleteH () {
        if (head == null || size == 0) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        }
        else {
            head = head.next;
        }

        size--;
    }
    public void deleteT () {
        if (head == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        }
        else {
            Node p = head;
            while (p.next != tail) {
                p = p.next;
            }

            p.next = null;
            tail = p;
        }

        size--;
    }
    public void deleteN (int index) {
        if (head == null) {
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Shit id");
            return;
        }
        if (index == 0) {
            deleteH();
            return;
        }
        if (index == size - 1) {
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
    
    public Node getNode (int index) {
        if (head == null || index < 0 || index >= size) {
            return null;
        }
        Node p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p;
    }
    public int findE (T data) {
        if (head != null) {
            int id = 0;
            Node p = head;
            while (p.next != null) {
                if (p.data.equals(data)) {
                    return id;
                }
                p = p.next;
                id++;
            }
        }
        return -1;
    } 



}
