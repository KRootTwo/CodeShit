import java.util.Scanner;

public class BinTree {
    private static class Node {
        private int val;
        private Node left;
        private Node right;

        public Node (int val) {
            this.val = val;
        }
    }
    private Node root;

    public void populate(Scanner in) {
        System.out.print("Enter root node: ");
        int val = in.nextInt();

        root = new Node(val);

        populate(in, root);
    }

    private void populate(Scanner in, Node node) {

        System.out.print("Do you want to enter left of " + node.val + "? (true/false): ");
        boolean left = in.nextBoolean();

        if (left) {
            System.out.print("Enter value: ");
            int val = in.nextInt();

            node.left = new Node(val);

            populate(in, node.left);
        }

        System.out.print("Do you want to enter right of " + node.val + "? (true/false): ");
        boolean right = in.nextBoolean();

        if (right) {
            System.out.print("Enter value: ");
            int val = in.nextInt();

            node.right = new Node(val);

            populate(in, node.right);
        }
    } 
    public void display () {
        display(root, "");
    }
    private void display (Node node, String i) {
        if (node == null) return;
        System.out.println(i + node.val);
        display(node.left, i + "\t");
        display(node.right, i + "\t");
    }
}
