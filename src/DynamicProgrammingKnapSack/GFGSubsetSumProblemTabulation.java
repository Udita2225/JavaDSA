package DynamicProgrammingKnapSack;

public class GFGSubsetSumProblemTabulation {
/*
class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        boolean[][] dp = new boolean[n][sum+1];
        if(arr[0]<=sum) dp[0][arr[0]] = true;
        for(int i=0; i<n; i++) dp[i][0] =  true;
        for(int i=1; i<n; i++){
            for(int j=1; j<=sum;j++){
                Boolean skip = (i>0)?dp[i-1][j]:false;
                Boolean pick = false;
                if(arr[i]<=j){
                    if(i>0) pick = dp[i-1][j-arr[i]];
                }
                dp[i][j] = pick||skip;
            }
        }
        return dp[n-1][sum];
    }
}

/*class Solution {
    static Boolean isTrue(int i,int[] arr, int sum, int[][] dp){
        if(sum==0) return true;
        if(i<0) return false;
        if(dp[i][sum]!=-1) return dp[i][sum]==1;
        Boolean skip = isTrue(i-1,arr,sum,dp);
        Boolean pick = false;
        if(arr[i]<=sum) pick = isTrue(i-1,arr,sum-arr[i],dp);
        dp[i][sum] = (skip||pick)?1:0;
        return skip||pick;
    }
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        int[][] dp = new int[n][sum+1];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        return isTrue(n-1,arr,sum,dp);
    }
}
*/
}
