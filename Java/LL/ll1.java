class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class ll1 {
    public static void main(String[] args) {
        Node head = new Node(7);
        head.next = new Node(8);
        head.next.next = new Node(9);
        head.next.next.next = new Node(10);

        llshit.printLL(head);
        // while (temp != null) {
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }
    }
}