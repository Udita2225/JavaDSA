package DynamicProgrammingKnapSack;
import java.util.*;
// Recursion +  Memoization
// Tc: O(n*c)
// Sc: O(n*c) //Auxillary Space
public class KnapSack01Memoization {
    public static int profit(int i,int[] wt, int[] val, int capacity, int[][] dp){
        if(i==wt.length) return 0;
        if(dp[i][capacity]!=-1) return dp[i][capacity];
        int skip = profit(i+1,wt,val,capacity,dp);
        if(wt[i]>capacity) return dp[i][capacity]=skip;
        int pick = val[i]+profit(i+1,wt,val,capacity-wt[i],dp);
        return dp[i][capacity] = Math.max(pick,skip);
    }

    public static void main(String[] args) {
        int[] val = {5,3,7,16};
        int[] wt =  {1,2,8,10};
        int capacity =8;
        int n =  wt.length;
        //i = 0 to n-1 and capacity =capacity to 0
        //So we will use 2-D DP Array to Optimize this
        int[][] dp = new int[n][capacity+1];
        for(int i =0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(profit(0,wt,val,capacity,dp));
    }
}
