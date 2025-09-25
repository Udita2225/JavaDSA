package DynamicProgrammingKnapSack;

public class LeetCode322CoinChangeTabulation {
    /*Space Optimized Code
    class Solution {
        public int coinChange(int[] coins, int amount) {
            int n = coins.length;
            int[][] dp = new int[2][amount+1];
            dp[0][0] = 0;
            dp[1][0] = 0;
            for(int j=1; j<=amount; j++) dp[0][j] = j%coins[0]==0 ? j/coins[0] : Integer.MAX_VALUE;
            for(int i=1; i<n; i++){//i-1 => 0 i=>1 Only in dp
                for(int j=1; j<=amount; j++){
                    int skip =  dp[0][j];
                    int pick = Integer.MAX_VALUE;
                    if(coins[i]<=j && dp[1][j-coins[i]]!= Integer.MAX_VALUE){
                        pick = 1 + dp[1][j-coins[i]];
                    }
                    dp[1][j] =  Math.min(skip,pick);
                }
                for(int j=1; j<=amount; j++) dp[0][j] = dp[1][j];
            }
            return dp[0][amount]==Integer.MAX_VALUE ? -1: dp[0][amount];
        }
    }

    /*class Solution {
    public int coinChange(int[] coins, int amount) {
    int n = coins.length;
    int[][] dp = new int[n][amount+1];
    for(int i=0; i<n; i++) dp[i][0] = 0;
    for(int j=1; j<=amount; j++) dp[0][j] = j%coins[0]==0 ? j/coins[0] :Integer.   MAX_VALUE;
    for(int i=1; i<n; i++){
        for(int j=1; j<=amount; j++){
            int skip =  dp[i-1][j];
            int pick = Integer.MAX_VALUE;
            if(coins[i]<=j && dp[i][j-coins[i]]!=Integer.MAX_VALUE){
                pick = 1 + dp[i][j-coins[i]];
            }
            dp[i][j] =  Math.min(skip,pick);
        }
    }
    return dp[n-1][amount]==Integer.MAX_VALUE?-1:dp[n-1][amount];
    }
}
*/
}
