package Trees;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
public class BTRightSideView {
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
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            Deque<TreeNode> q = new ArrayDeque<>();
            if (root == null) return list;
            q.offer(root);

            while (!q.isEmpty()) {
                int s = q.size();

                for (int i = 0; i < s; i++) {
                    TreeNode node = q.poll();

                    if (node.left != null) q.addLast(node.left);
                    if (node.right != null) q.addLast(node.right);

                    if (i == s - 1) {
                        list.add(node.val);
                    }
                }
            }
            return list;
        }
    }
}