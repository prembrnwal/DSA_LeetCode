// class Solution {
//     public int longestConsecutive(int[] nums) {
//         Arrays.sort(nums);
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             int len=0;
//             if(nums[i]==(nums[i+1]+1)){
//                 len++;                
//             }
//             count=Math.max(count,len);
//         }
//         return count;
//     }
// }

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int count = 1;
        int maxLen = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;  
            }

            if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }

            maxLen = Math.max(maxLen, count);
        }

        return maxLen;
    }
}