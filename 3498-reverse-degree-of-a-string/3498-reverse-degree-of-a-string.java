class Solution {
    public int reverseDegree(String s) {
        int ans =0;
        for(int i=0;i<s.length();i++){
            char n=s.charAt(i);
            ans =ans+(122 - n + 1)*(i+1);
        }
        return ans;
    }
}