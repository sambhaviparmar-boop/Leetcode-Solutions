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
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        return tree(inorder, postorder, 0, inorder.length - 1, postorder.length - 1);
    }

    public int find(int[] inorder , int target , int start , int end){

        for(int i = start ; i <= end ; i++){
            if(inorder[i] == target) return i;
        }

        return -1;

    }

    public TreeNode tree(int[] inorder, int[] postorder , int inStart , int inEnd , int i){

        if(inStart > inEnd) return null;

        TreeNode root = new TreeNode(postorder[i]);

        int pos = find(inorder , postorder[i] , inStart , inEnd);

        root.right = tree(inorder , postorder , pos+1 , inEnd , i-1);
        root.left = tree(inorder , postorder , inStart , pos-1 , i-(inEnd - pos)-1);

        return root;
    }
}