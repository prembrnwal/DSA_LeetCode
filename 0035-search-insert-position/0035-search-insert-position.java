class Solution {
    public int searchInsert(int[] nums, int target) {
        int st=0;
        int mid=0;
        int end=nums.length-1;
        while(st<=end){
            mid =st+(end-st)/2;
            if(target<nums[mid]){
                end=mid-1;
            }else{
                st=mid+1;
            }
             if(nums[mid]==target) return mid;
        }
        
        return st;
        
    }
}