class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int cons=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cons++;
                if(ans<cons) ans=cons;
            }
            else{
                cons=0;
            }
        }
        return ans;
    }
}