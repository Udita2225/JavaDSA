package DynamicProgrammingMatrixChainMultiplication;
import java.util.*;


public class MatrixChainMultiplicationPractice {
    public static int maxCost;
    private static int mcm(int i, int j, int[][] arr, int[][] dp) {
        if(i==j) return 0;
        int minCost = Integer.MAX_VALUE;
        if(dp[i][j] != -1) return dp[i][j];
        for(int k=i; k<j; k++){
            int x =  arr[i][0] * arr[k][1] * arr[j][1];
            int tc = mcm(i,k,arr,dp) + mcm(k+1,j,arr,dp) + x;
            minCost = Math.min(minCost,tc);
            maxCost = Math.max(maxCost,tc);
        }
        return dp[i][j] = minCost;
    }
    public static void main(String[] args) {
        maxCost = Integer.MIN_VALUE;
        int[][] arr = {{1, 2}, {2, 3}, {3, 4}, {4,2}};
        int n = arr.length;
        int[][] dp =  new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(mcm(0,n-1,arr,dp));
        System.out.println(maxCost);
    }
}
