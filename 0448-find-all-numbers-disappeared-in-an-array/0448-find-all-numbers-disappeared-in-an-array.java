class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 1; i <= n; i++) {
            map.put(i, 0);
        }
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
        }
        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (map.get(i) == 0) {
                ans.add(i);
            }
        }
        return ans;
    }
}