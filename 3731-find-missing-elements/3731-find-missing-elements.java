class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=nums[0];i<=nums[n-1];i++){
            map.put(i,0);

        }
        for(int j=0;j<n;j++){
            
            // map.put(nums[j],map.get(nums[j]+1));
              map.put(nums[j], 1);
            
        }
        ArrayList<Integer> arr =new ArrayList<>();
        for(int i=nums[0];i<=nums[n-1];i++){
             if(map.get(i) == 0){
                arr.add(i);
            }
        }

return arr;

    }
}