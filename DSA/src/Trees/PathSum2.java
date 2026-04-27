package Trees;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
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

        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> ans = new ArrayList<>();
            ArrayList<Integer> list = new ArrayList<>();
            int rem = targetSum;
            check(root, ans, list, rem);
            return ans;
        }

        public void check(TreeNode node, List<List<Integer>> ans, ArrayList<Integer> list, int rem  ){

            if(node==null) return;

            list.add(node.val);

            rem  = rem - node.val;

            if(node.right==null && node.left==null && rem==0){
                ans.add(new ArrayList<>(list));
            }

            check(node.left, ans, list, rem);
            check(node.right, ans, list, rem);

            list.remove(list.size()-1);
        }
    }
}
