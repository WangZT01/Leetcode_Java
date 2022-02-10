package DP;

public class Example {
    public int fun(int n){

        if(n <= 1){
            return n;
        }
        int[] dp = new int[n+1];
        // 给出初始值
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        // 通过关系式来计算出 dp[n]
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        // 把最终结果返回
        return dp[n];
    }
}
