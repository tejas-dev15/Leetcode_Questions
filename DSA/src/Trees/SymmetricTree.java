package Trees;

import java.util.Deque;
import java.util.LinkedList;

public class SymmetricTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            Deque<TreeNode> q = new LinkedList<>();
            Deque<TreeNode> p = new LinkedList<>();
            q.offer(root.left);
            p.offer(root.right);

            while (!q.isEmpty()) {
                TreeNode node1 = q.poll();
                TreeNode node2 = p.poll();

                if (node1 == null && node2 == null) continue;
                if (node1 == null || node2 == null) return false;

                if (node1.val != node2.val) return false;


                q.offer(node1.right);
                q.offer(node1.left);

                p.offer(node2.left);
                p.offer(node2.right);
            }
            return true;
        }
    }
}