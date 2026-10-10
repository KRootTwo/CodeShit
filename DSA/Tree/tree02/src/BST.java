public class BST {
    private class Node {
        private int val;
        private Node left;
        private Node right;
        private int height;

        public Node(int val) {
            this.val = val;
        }

        public int getHeight() {
            return height;
        }
        public int getVal() {
            return val;
        }
        
    }
    private Node root;

    public BST() {}

    public void pop() {
        
    }
}
