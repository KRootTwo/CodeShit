public class llshit {

    public static void printLL(Node n) {
        Node t = n;
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("null");
    }
    
}