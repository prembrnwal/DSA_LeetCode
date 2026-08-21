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
    HashMap<Integer,Integer> map =new HashMap<>();
    public int[] findMode(TreeNode root) {
        inorder(root);

        int max = 0;

        for(int count: map.values()){
            max=Math.max(max,count);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int count:map.keySet()){
            if(map.get(count)==max){
                arr.add(count);
            }
        }
        int ans[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;

    }


    public void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
         inorder(root.right);
    }
}