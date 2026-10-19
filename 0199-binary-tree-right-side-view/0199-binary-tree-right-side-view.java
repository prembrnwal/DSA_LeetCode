class Solution {
    public void right(TreeNode curr, ArrayList<Integer> res,int level){
        if(curr==null) return;
        if(level==res.size()){
            res.add(curr.val);
        }
        right(curr.right,res,level+1);
        right(curr.left,res,level+1);

    }
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> res=new ArrayList<>();
        right(root,res,0);
        return res;
    }
}