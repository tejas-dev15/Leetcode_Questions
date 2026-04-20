package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {

    public class TreeNode {
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

    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            Queue<TreeNode> pT = new LinkedList<>();
            Queue<TreeNode> qT = new LinkedList<>();
            pT.offer(p);
            qT.offer(q);

            while(!pT.isEmpty() && !qT.isEmpty()){
                TreeNode node1 = pT.poll();
                TreeNode node2 = qT.poll();

                if(node1 ==null && node2 == null) continue;
                if(node1 ==null || node2 ==null) return false;
                if(node1.val != node2.val) return false;


                pT.offer(node1.left);
                pT.offer(node1.right);

                qT.offer(node2.left);
                qT.offer(node2.right);

            }
            return pT.isEmpty() && qT.isEmpty();
        }

