class Solution {

    public int ans(int dp[], int[] nums,int i){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=nums[i]+ans(dp,nums,i+2);
        int skip=ans(dp,nums,i+1);
        return dp[i]=Math.max(take,skip);
    }
    public int rob(int[] nums) {
      int dp[]=new int[nums.length];
      Arrays.fill(dp,-1);
      return ans(dp,nums,0);
    }
}