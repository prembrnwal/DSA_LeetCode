class Solution {
    public int maxArea(int[] height) {
      int first=0;
      int end=height.length-1;
      int max_area=0;
      while(first < end){
        int contain=Math.min(height[first],height[end]);
        int area=contain*(end-first);
        max_area = Math.max(area,max_area);      
        if (height[first] < height[end]) {
                first++;
            } else {
                end--;
            }

      }
      return max_area;
    }
}