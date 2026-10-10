public class Tre1 {
    private class Node {
        int val;
        Node l, r;
        public Node() {}
        public Node(int val) {
            this.val = val;
        }
    }

    Node root;

    public Tre1() {
        root = new Node();
    }

    public void populate() {
        populate(root, "");
    }
    private void populate(Node node, String indent) {
        if (node == null) {
            
        }
    }


}
