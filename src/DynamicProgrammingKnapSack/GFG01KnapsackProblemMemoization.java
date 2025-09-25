package DynamicProgrammingKnapSack;
//0 - 1 Knapsack Problem
/*
Given n items, each with a specific weight and value, and a knapsack with a capacity of W, the task is to put the items
in the knapsack such that the sum of weights of the items <= W and the sum of values associated with them is maximized.
Note: You can either place an item entirely in the bag or leave it out entirely. Also, each item is available in single
quantity.
Examples :
Input: W = 4, val[] = [1, 2, 3], wt[] = [4, 5, 1]
Output: 3
Explanation: Choose the last item, which weighs 1 unit and has a value of 3.
Input: W = 3, val[] = [1, 2, 3], wt[] = [4, 5, 6]
Output: 0
Explanation: Every item has a weight exceeding the knapsack's capacity (3).
Input: W = 5, val[] = [10, 40, 30, 50], wt[] = [5, 4, 2, 3]
Output: 80
Explanation: Choose the third item (value 30, weight 2) and the last item (value 50, weight 3) for a total value of 80.
Constraints:
2 ≤ val.size() = wt.size() ≤ 103
1 ≤ W ≤ 103
1 ≤ val[i] ≤ 103
1 ≤ wt[i] ≤ 103
Expected Complexities
Time Complexity: O (n * W)
Auxiliary Space: O (n * W)
Company Tags
FlipkartMorgan StanleyAmazonMicrosoftSnapdealOraclePayuVisaDirectiGreyOrangeMobicip
Topic Tags
Dynamic ProgrammingAlgorithms
*/
public class GFG01KnapsackProblemMemoization {
/*
class Solution {
    static int profit(int i,int W,int[] val, int[] wt, int[][] dp){
        if(i==wt.length) return 0;
        if(dp[i][W]!=-1) return dp[i][W];
        int skip = profit(i+1,W,val,wt,dp);
        if(wt[i]>W) return dp[i][W] = skip;
        int pick =  val[i] + profit(i+1,W-wt[i],val,wt,dp);
        return dp[i][W] =  Math.max(pick,skip);
    }
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = wt.length;
        int[][] dp =  new int[n][W+1];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        return profit(0,W,val,wt,dp);
    }
}
*/
}
