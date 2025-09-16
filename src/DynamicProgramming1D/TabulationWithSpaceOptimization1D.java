package DynamicProgramming1D;

public class TabulationWithSpaceOptimization1D {
/* LeetCode 509
// Tabulation With Space Optimization
class Solution {
    public int fib(int n) {
    if(n<=1) return n;
    int[] dp = new int[3];
    dp[0] = 0;
    dp[1] = 1;
    for(int i=2; i<=n; i++){
        dp[2] = dp[0] + dp[1];
        dp[0] = dp[1]; //Next Time
        dp[1] = dp[2]; //Next Time
    }
    return dp[2];
    }
}
*/
}
