class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
          int l = 1;
        int r = 0;
        int ans = Integer.MAX_VALUE;
        for (int i : nums)
            r = Math.max(i, r);
        while (r >= l) {
            int m = (l + r) / 2;
            int s = 0;
            for (int i : nums) {
                if (i % m != 0) {
                    s += 1;
                }
                s += (i / m);
            }
            if (s <= threshold) {
                ans = Math.min(ans, m);
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }
        return ans;
        
    }
}