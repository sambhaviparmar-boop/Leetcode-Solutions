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
    public TreeNode buildTree(int[] preorder, int[] inorder) {


     return tree(preorder, inorder, 0 , preorder.length-1 , 0);
        
    }

     public int find(int inorder[] , int target , int start , int end){

        for(int i = start ; i <= end ; i++){
            if(inorder[i] == target) return i;

           
        }
         return -1;
     }

    public TreeNode tree(int[] preorder, int[] inorder, int inStart , int InEnd , int index){

        if(inStart > InEnd) return null;

        TreeNode root = new TreeNode(preorder[index]);

        int pos = find(inorder , preorder[index] , inStart , InEnd);

        root.left = tree(preorder ,inorder , inStart , pos-1 , index+1);

        root.right = tree(preorder ,inorder , pos+1 , InEnd , index + (pos-inStart)+1);

         return root;
    }

  
}