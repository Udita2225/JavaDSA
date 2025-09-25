package DynamicProgrammingKnapSack;

public class GFG01KnapSackTabulation {
/*
class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        int n  = val.length;
        int[][] dp = new int[n][W+1];
        for(int i=0; i<n; i++) dp[i][0] = 0;
        for(int j=1; j<=W; j++) dp[0][j] = (wt[0]<=j)?val[0]:0;
        for(int i=1; i<n; i++){
            for(int j=1; j<=W; j++){
                int skip = dp[i-1][j];
                int pick = 0;
                if(wt[i]<=j)
                pick = val[i] + dp[i-1][j-wt[i]];
                dp[i][j] = Math.max(skip,pick);
            }
        }
        return dp[n-1][W];
    }
}



class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = val.length;
        int[][] dp = new int[n][W+1];
        for(int i=0; i<n; i++){
            for(int j=0; j<=W; j++){
                int skip = (i>0)?dp[i-1][j] : 0;
                int pick = 0;
                if(wt[i]<=j){
                    pick = (i>0)?dp[i-1][j-wt[i]]:0;
                    pick += val[i];
                }
                dp[i][j] = Math.max(skip,pick);
            }
        }
        return dp[n-1][W];
    }
}*/
}
