

public class DLL {
    private class Node {
        private int data;
        private Node prev;
        private Node next;

        private int setData (int val) {
            this.data = val;
            return val;
        }
        private int getData (int val) {
            return this.data;
        }

        public Node () {
            this.prev = null;
            this.next = null;
        }
        public Node (int val) {
            this.data = val;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DLL (int val) {
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public void insretH (int val) {
        Node p = new Node(val);

        if (head == null) {
            head = p;
            tail = p;
            return;
        }
        p.next = head;
        head.prev = p;
        head = p;
    }
    public void insertT (int val) {
        Node p = new Node(val);

        if (head == null) {
            head = p;
            tail = p;
            return;
        }
        tail.next = p;
        p.prev = tail;
        tail = p;
    }
    public void insertA (int val, int id) {
        if (id < 0 || id > size) {
            throw new IllegalArgumentException("Invalid index");
        }
        else if (id == 0) {
            insretH(val);
            return;
        }
        else if (id == size) {
            insertT(val);
            return;
        }
        Node p = new Node(val);
        Node trk = head;

        for (int i = 0; i < id - 1; i ++) {
            trk = trk.next;
        }
        
        trk.next.prev = p;
        p.next = trk.next;
        
        p.prev = trk;
        trk.next = p;
    }
    public Node deleteH () {
        if (head == null) return null;
        if (head.next == null) {
            Node r = head;
            head = null;
            tail = null;
            return r;
        }
        Node cut = head;
        head = head.next;
        head.prev = null;
        return cut;
    }
    public Node deleteT () {
        if (head == null) return null;
        if (tail.prev == null) {
            Node r = head;
            head = null;
            tail = null;
            return r;
        }
        Node r = tail;
        tail = tail.prev;
        tail.next = null;
        return r;
    }
    public Node deleteA (int id) {
        if (id < 0 || id > size - 1) {
            throw new IllegalArgumentException("Invalid index");
        }
        if (id == 0) return deleteH();
        if (id == size - 1) return deleteT();

        Node trk = head;
        for (int i = 0; i < id - 1; i++) {
            trk = trk.next;
        }
        Node r = trk.next;
        trk.next.next.prev = trk;
        trk.next = trk.next.next;
        return r;
    }
    public Node search (int val) {
        for (Node t = head; t != null; t = t.next) {
            if (t.data == val) {
                return t;
            }
        }
        return null;
    }




}
