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
    boolean isUnival(TreeNode root,int n){
        if(root==null) return true;
         if(root.val!=n) return false;
        

        return isUnival(root.left,n) && isUnival(root.right,n);
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        int n =root.val;
        // if(root.val!=n) return false;
        // isUnivalTree( root.left);
        // isUnivalTree( root.right);
        

        return isUnival( root, n);
    }
}