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
    public List<Integer> same (TreeNode root,List<Integer> a){
        if(root==null) return a;

        if(root.left==null && root.right==null) {
            a.add(root.val);
        }
        same(root.left,a);
        same(root.right,a);
        return a;
        
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>(); 
        
        same(root1,a1);
        same(root2,a2);
        if(a1.equals(a2))return true;

        return false;
        
    }
}