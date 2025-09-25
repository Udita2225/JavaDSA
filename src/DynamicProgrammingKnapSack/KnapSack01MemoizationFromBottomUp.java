package DynamicProgrammingKnapSack;
import java.util.*;
public class KnapSack01MemoizationFromBottomUp {
    public static int profit(int i, int c, int[] val, int[] wt, int[][] dp){
        if(i<0) return 0;
        if(dp[i][c] != -1) return dp[i][c];
        int skip = profit(i-1,c,val,wt,dp);
        if(wt[i]>c) return dp[i][c] = skip;
        int pick = val[i] + profit(i-1,c-wt[i],val,wt,dp);
        return dp[i][c] = Math.max(skip,pick);
    }
    public static void main(String[] args) {
        int[] val  = {5,3,8,16};
        int[] wt = {1,2,8,10};
        int c = 8;
        int n = val.length;
        int[][] dp = new int[n][c+1];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(profit(n-1,c,val,wt,dp));
    }
}
