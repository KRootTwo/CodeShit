public class Qn226 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode head = root;
        TreeNode t = head.left;
        head.left = head.right;
        head.right = t;

        invertTree(root.left);
        invertTree(root.right);

        return head;
    }
    public static void main(String[] args) {
        
    }
}
