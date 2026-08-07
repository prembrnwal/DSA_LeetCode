class Solution {
    public void rotate(int[] nums, int k) {
        Queue<Integer> q=new LinkedList<>();
        // int n =nums.length;
         k = k % nums.length;
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
        }
        for(int j=1;j<=nums.length-k;j++){
            q.add(q.remove());
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=q.remove();
        }
    }
}