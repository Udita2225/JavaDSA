package DynamicProgrammingMatrixChainMultiplication;
import java.util.*;
public class MCMSingleArrayInput {
    public static int mcm(int i, int j, int[] arr, int[][] dp){
        if(i==j) return 0;
        int minCost =  Integer.MAX_VALUE;
        if(dp[i][j] != -1) return dp[i][j];
        for(int k=i; k<j; k++){
            int x = arr[i] * arr[k+1] * arr[j+1];
            int tc = mcm(i,k,arr,dp) + mcm(k+1,j,arr,dp) + x;
            minCost =  Math.min(minCost,tc);
        }
        return dp[i][j] = minCost;
    }
    static void main() {
        int[] arr =  {1,2,3,4,2};
        int n =  arr.length-1;
        int[][] dp =  new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(mcm(0,n-1,arr,dp));
    }
}
