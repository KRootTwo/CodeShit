import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class binTreeMs {
        private static List<Integer> treeTravBFS(TreeNode n) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> l = new LinkedList<Integer>();

        if (n == null) return l;

        q.offer(n);
        while (!q.isEmpty()) {
            TreeNode c = q.poll();
            l.add(c.val);

            if (c.left != null) q.offer(c.left);
            if (c.right != null) q.offer(c.right);
        }
        return l;
    }
    private static void treeTrav(TreeNode n, ArrayList<Integer> l) {
        if (n == null) return;
        l.add(n.val);
        treeTrav(n.left, l);
        treeTrav(n.right, l);
    }
}
