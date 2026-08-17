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
    public int height(TreeNode root){
        if(root==null) return 0;
        int left=height(root.left);
        int right=height(root.right);
        return 1+Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int lft=height(root.left);
        // if(root.left!=null) lft++;

        int rht=height(root.right);
        // if(root.right!=null) rht++;

        int d=lft-rht;
        if(d<0) d=-d;

        if(d>1) return false;

        return (isBalanced(root.left) && isBalanced(root.right));
    }
}