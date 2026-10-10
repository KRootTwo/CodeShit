import java.util.Scanner;

public class BTree {
    public BTree () {

    }
    private static class Node {
        int val;
        Node left;
        Node right;

        public Node (int val) {
            this.val = val;
        }

    }
    private Node root;

    public void populate(Scanner in) {
        System.out.print("Enter root val: ");
        int val = in.nextInt();
        root = new Node(val);
        populate(in, root);
    }
    private void populate(Scanner in, Node node) {
        System.out.print("Enter to left of " + node.val + "? ");
        boolean l = Mtils.getYT(in);
        
        if(l) {
            System.out.print("Enter val: ");
            int v = in.nextInt();
            node.left = new Node(v);
            populate(in, node.left);
        }
        
        System.out.print("Enter to right of " + node.val + "? ");
        boolean r = Mtils.getYT(in);
        
        if(r) {
            System.out.print("Enter val: ");
            int v = in.nextInt();
            node.right = new Node(v);
            populate(in, node.right);
        }
        
    }
    public void display() {
        display(root, "");
    }
    private void display(Node node, String i) {
        if (node == null) return;
        System.out.println(i + node.val);
        display(node.left, i + "\t");
        display(node.right, i + "\t");
    }
    public void print() {
        System.out.println();
        print(root, 0);
    }
    private void print(Node node, int lvl) {
        if (node == null) return;

        // leftmost node
        print(node.right, lvl + 1);
        
        if (lvl != 0) {
            for (int i = 0; i < lvl - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|------>" + node.val);
        }
        else {
            System.out.println(node.val);
        }
        print(node.left, lvl + 1);
    }

}


/*
public void print() {
    print(root, "", true);
}

private void print(Node node, String prefix, boolean isTail) {
    if (node == null) return;

    if (node.right != null)
        print(node.right, prefix + (isTail ? "│   " : "    "), false);

    System.out.println(prefix + (isTail ? "└── " : "┌── ") + node.val);

    if (node.left != null)
        print(node.left, prefix + (isTail ? "    " : "│   "), true);
}
*/