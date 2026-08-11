public class Solution {
public int[] searchRange(int[] nums, int target) {
    int[] result = new int[2];
    result[0] = findFirst(nums, target);
    result[1] = findLast(nums, target);
    return result;
}

private int findFirst(int[] nums, int target){
    int idx = -1;
    int start = 0;
    int end = nums.length - 1;
    while(start <= end){
        int mid = (start + end) / 2;
        if(nums[mid] >= target){
            end = mid - 1;
        }else{
            start = mid + 1;
        }
        if(nums[mid] == target) idx = mid;
    }
    return idx;
}

private int findLast(int[] nums, int target){
  int st=0;
  int idx=-1;
  int end=nums.length-1;
  while(st<=end){
    int mid=(st+end)/2;
    if(nums[mid]>target){
        end=mid-1;
    }else if(nums[mid]<=target){
        st=mid+1;
    }
    if(nums[mid]==target) idx=mid;
  }     
  return idx;
}
}