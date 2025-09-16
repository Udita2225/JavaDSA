package DynamicProgramming1D;

public class LeetCode746MinCostClimbingStairsTabulation {
/*    // By Tabulation TC:- O(n) SC:- O(n)
    Loop from 2 to n-1;
    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int n = cost.length;
            int[] dp = new int[n];
            dp[0] =  cost[0];
            dp[1] =  cost[1];
            for(int i=2; i<n; i++){
                dp[i] =  cost[i] + Math.min(dp[i-1], dp[i-2]);
            }
            return Math.min(dp[n-2], dp[n-1]);
        }
    }
/*
Loop from  n-3 to 0
class Solution {
    public int minCostClimbingStairs(int[] cost) {
    int n = cost.length;
    int[] dp = new int[n];
    dp[n-1] = cost[n-1];
    dp[n-2] = cost[n-2];
    for(int i=n-3; i>=0; i--){
        dp[i] = cost[i] + Math.min(dp[i+1], dp[i+2]);
    }
    return Math.min(dp[1], dp[0]);
    }
}
*/
}
