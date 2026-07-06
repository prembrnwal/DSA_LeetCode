class Solution {
    public int removeDuplicates(int[] nums) {
        // int arr[]=new int[nums.length];
        // nums[0]=arr[0];

        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]!=arr[i-1]){
        //         arr[i]=nums[i];
        //     }
        // }
        // return arr.length;

        int ptr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[ptr]!=nums[i]){
                nums[ptr+1]=nums[i];
                ptr++;
            }
        }
        return ptr+1;

    }
}