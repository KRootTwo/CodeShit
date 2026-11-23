public class BinaryTree<T extends Comparable<T>> {
    private static class Node<T> {
        T val;
        Node<T> l;
        Node<T> r;

        public Node(T val) {
            this.val = val;
        }
    }
    public Node<T> root;

    /* Methods */
    public void insertRec(T val) {
        root = insertRec(root, val);
    }

    private Node<T> insertRec(Node curr, T val) {
        if (curr == null) {
            return new Node<>(val);
        }

        if (val.compareTo((T) curr.val) < 0) {
            curr.l = insertRec(curr.l, val);
        }
        if (val.compareTo((T) curr.val) > 0) {
            curr.r = insertRec(curr.r, val);
        }
        return curr;
    }
    private void inOrderRec(Node<T> curr) {
        if (curr == null) return;

        inOrderRec(curr.l);
        System.out.print(curr.val + " ");
        inOrderRec(curr.r);
    }

    
}
