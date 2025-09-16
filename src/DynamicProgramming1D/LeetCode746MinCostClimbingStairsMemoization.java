package DynamicProgramming1D;
//746. Min Cost Climbing Stairs
/*
You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
Once you pay the cost, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Return the minimum cost to reach the top of the floor.
Example 1:
Input: cost = [10,15,20]
Output: 15
Explanation: You will start at index 1.
- Pay 15 and climb two steps to reach the top.
The total cost is 15.
Example 2:
Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: You will start at index 0.
- Pay 1 and climb two steps to reach index 2.
- Pay 1 and climb two steps to reach index 4.
- Pay 1 and climb two steps to reach index 6.
- Pay 1 and climb one step to reach index 7.
- Pay 1 and climb two steps to reach index 9.
- Pay 1 and climb one step to reach the top.
The total cost is 6.
Constraints:
2 <= cost.length <= 1000
0 <= cost[i] <= 999
*/
public class LeetCode746MinCostClimbingStairsMemoization {
/*
// Recursion + Memoization
// TC:- O(n) SC:- O(n)
class Solution {
    public int minCost(int[] cost, int idx, int[] dp){
    if(idx==0 || idx==1) return cost[idx];
    if(dp[idx]!=-1) return dp[idx];
    return dp[idx] = cost[idx] + Math.min(minCost(cost,idx-1,dp), minCost(cost, idx-2,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
    int n = cost.length;
    // n is going from n-1 to 0
    int[] dp = new int[n];
    Arrays.fill(dp,-1);
    return Math.min(minCost(cost, n-1,dp), minCost(cost, n-2,dp));
    }
}

Not a good code because The Time Complexity is :
O(2^n)
SC : O(n)
class Solution {
    public int MinCost(int i, int[] cost){
        if(i==0 || i==1) return cost[i];
        return  cost[i] + Math.min(MinCost(i-1,cost), MinCost(i-2,cost));
    }
    public int minCostClimbingStairs(int[] cost) {
    int n =  cost.length;
    return Math.min(MinCost(n-1, cost), MinCost(n-2, cost));
    }
}
/*class Solution {
    public int MinCost(int i, int[] cost){
    int n = cost.length;
    if(i==n-1 || i==n-2) return cost[i];
    return cost[i] + Math.min(MinCost(i+1,cost), MinCost(i+2, cost));
    };
    public int minCostClimbingStairs(int[] cost) {
    return Math.min(MinCost(0,cost), MinCost(1,cost));
    }
}
/*class Solution {
    public int minCostClimbingStairs(int[] cost) {
    int n = cost.length;
    int[] dp = new int[n];
    dp[n-1] = cost[n-1];
    dp[n-2] = cost[n-2];
    for(int i=n-3; i>=0; i--){
        dp[i] = cost[i] + Math.min(dp[i+1], dp[i+2]);
    }
    int x=0;
    if(dp[1]<dp[0]) x=1;
    return dp[x];
    }
}
*/
}
