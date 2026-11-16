/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {

         boolean[] valid = {true};

        height(root , valid);

        return valid[0];
        
    }

    public int height(TreeNode root , boolean[] valid){
        if(root == null) return 0;

        int l = height(root.left , valid);
        int r = height(root.right , valid);

        if(Math.abs(l - r) > 1){
           valid[0] = false;
        }

        return 1 + Math.max(l , r);
    }
}