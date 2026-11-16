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
    public boolean isSymmetric(TreeNode root) {

        if(root == null) return true;

       return solve(root.left , root.right);
    }

    public boolean solve(TreeNode left , TreeNode right){
        
        //both null
        if(left == null && right == null){
            return true;
        }

        //one null
        if(left == null || right == null){
            return false;
        }

        //values match
        if(left.val != right.val){
            return false;
        }

        //compare mirror position
        return solve(left.left , right.right) && solve(left.right , right.left);

    }
}