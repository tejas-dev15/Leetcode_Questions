package Trees;

public class LeetCode1448 {
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
        int goodNdes =0;
        public int goodNodes(TreeNode root) {
            int greatest = root.val;
            gdNodes(root, greatest);
            return goodNdes;
        }

        public void gdNodes(TreeNode root, int greatest) {
            if(root == null) return;

            if(root.val >= greatest) {
                goodNdes++;
                greatest = root.val;
            }

            gdNodes(root.left, greatest);
            gdNodes(root.right, greatest);

        }
    }
}
