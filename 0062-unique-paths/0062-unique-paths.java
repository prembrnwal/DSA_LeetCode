class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
       
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0) dp[i][j]=1;
                else  dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        return dp[m-1][n-1];













        // for (int i = 0; i < m; i++) {
        //     Arrays.fill(dp[i], -1);
        // }
        // int mst = 0;
        // int nst = 0;
        // return pair(m, n, mst, nst, dp);
    }

    public int pair(int m, int n, int mst, int nst, int dp[][]) {
        if (mst >= m || nst >= n)
            return 0;
        if (mst == m - 1 && nst == n - 1)
            return 1;
        if (dp[mst][nst] != -1)
            return dp[mst][nst];
        int right = pair(m, n, mst, nst + 1, dp);
        int down = pair(m, n, mst + 1, nst, dp);
        return dp[mst][nst] = right + down;
    }
}