class Solution {
    public int maximumAmount(int[][] coins) {
        int m = coins.length;
        int n = coins[0].length;
        
        // dp[i][j][k] represents max coins at (i, j) with k abilities used
        // Using k = 0, 1, or 2 used.
        long[][][] dp = new long[m][n][3];
        
        // Initialize with a very small number
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], Long.MIN_VALUE / 2);
            }
        }

        // Base case: Start at (0, 0)
        // Choice 1: Don't use ability at start
        dp[0][0][0] = coins[0][0];
        // Choice 2: Use ability at start (if it's a robber)
        if (coins[0][0] < 0) {
            dp[0][0][1] = 0;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k <= 2; k++) {
                    if (i == 0 && j == 0) continue;

                    long prevMax = Long.MIN_VALUE / 2;
                    if (i > 0) prevMax = Math.max(prevMax, dp[i - 1][j][k]);
                    if (j > 0) prevMax = Math.max(prevMax, dp[i][j - 1][k]);

                    if (prevMax != Long.MIN_VALUE / 2) {
                        // Option 1: Standard move (gain coins or take penalty)
                        dp[i][j][k] = Math.max(dp[i][j][k], prevMax + coins[i][j]);

                        // Option 2: Use an ability if it's a robber and we have one left
                        if (coins[i][j] < 0 && k < 2) {
                            long prevForAbility = Long.MIN_VALUE / 2;
                            if (i > 0) prevForAbility = Math.max(prevForAbility, dp[i-1][j][k]);
                            if (j > 0) prevForAbility = Math.max(prevForAbility, dp[i][j-1][k]);
                            
                            // This uses the "next" level of K
                            dp[i][j][k+1] = Math.max(dp[i][j][k+1], prevForAbility);
                        }
                    }
                }
            }
        }

        // The answer is the max of using 0, 1, or 2 abilities at the destination
        return (int) Math.max(dp[m - 1][n - 1][0], 
                     Math.max(dp[m - 1][n - 1][1], dp[m - 1][n - 1][2]));
    }
}