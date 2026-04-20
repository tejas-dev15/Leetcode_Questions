package Trees;

import java.util.Deque;
import java.util.LinkedList;

public class InvertBinaryTree {

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
        public TreeNode invertTree(TreeNode root) {
            Deque<TreeNode> q = new LinkedList<>();
            q.offer(root);

            while (!q.isEmpty()) {
                TreeNode node = q.poll();

                if (node == null) continue;

                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;

                q.offer(node.left);
                q.offer(node.right);
            }
            return root;
        }
    }
}
