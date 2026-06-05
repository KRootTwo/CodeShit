public class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;

    public Node (int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
        this.prev = null;
    } 
}
