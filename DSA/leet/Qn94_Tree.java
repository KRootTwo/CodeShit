import java.util.ArrayList;
import java.util.List;

public class Qn94 {
    private static void treeTrav(TreeNode n, List<Integer> l) {
        if (n == null) return;
        treeTrav(n.left, l);
        l.add(n.val);
        treeTrav(n.right, l);
        // l.add(n.val);
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        treeTrav(root, l);
        return l;
    }
    
    public static void main(String[] args) {
        // List<Integer> root = new ArrayList<>(
        //     List.of(1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9)
        // );

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(inorderTraversal(root));
    }
}
