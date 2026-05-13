class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;

    public Node (int regd_no, float mark) {
        this.regd_no = regd_no;
        this.mark = mark;
        this.next = null;
    }   
}
public class t01 {
    public static void main(String[] args) {
       Node start = new Node(232323, 69.99f);
       System.out.println(start.next == null);
    }
}