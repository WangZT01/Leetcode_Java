package DP;

public class MinimumPathSum_64 {

    public int minPathSum(int[][] grid) {
        int i_length = grid.length;
        int j_length = grid[0].length;

        int dp[][] = new int[i_length][j_length];

        dp[0][0] = grid[0][0];
        for( int i = 1; i < i_length; i++){
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }
        for (int j = 1; j < j_length; j++) {
            dp[0][j] = grid[0][j] + dp[0][j - 1];
        }

        for( int i = 1; i < i_length; i++){
            for (int j = 1; j < j_length; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j - 1]);
            }
        }

        return dp[i_length-1][j_length-1];
    }
}
