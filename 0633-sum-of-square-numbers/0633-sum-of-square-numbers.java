class Solution {
    public boolean judgeSquareSum(int c) {
        if(c<=2) return true;
        int a=0;
        int b = (int) Math.sqrt(Integer.MAX_VALUE);
        while(a<=b){
            if((a*a) + (b*b) == c) return true;
            else if((b*b) > c-(a*a))  b--;
            else a++;
        }
        return false;
    }
}