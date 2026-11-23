import java.util.Stack;

public class Qn100_Tree {
    public static boolean isSameTreeBFS(TreeNode p, TreeNode q) {

        if (p == null || q == null) return false;

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(p); s2.push(q);

        while(!s1.isEmpty() || !s2.isEmpty()) {
            TreeNode r1 = s1.pop();
            TreeNode r2 = s2.pop();

            if (r1.val != r2.val) return false;

            if (r1.left != null) s1.push(r1.left);
            if (r1.right != null) s1.push(r1.right);
            if (r2.left != null) s2.push(r2.left);
            if (r2.right != null) s2.push(r2.right);
        }
        return true;
    }


    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        root1.right.left = new TreeNode(6);
        root1.right.right = new TreeNode(7);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.right.left = new TreeNode(6);
        root2.right.right = new TreeNode(7);

        System.out.println(isSameTreeBFS(root1, root2));
    }
}
