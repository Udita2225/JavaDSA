package DynamicProgramming2D;
// LeetCode 62 Unique Paths
public class TabulationWithSpaceOptimization {
/*
By Using 1*n extra Array
class Solution {
    public int uniquePaths(int m, int n) {
    int[] dp =  new int[n];
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
           int top = dp[j];
           if(i==0 || j==0) dp[j] = 1;
           else  dp[j] = top + dp[j-1];
        }
    }
    return dp[n-1];
    }
}

// By Using 2*N Array Without Copy-Pasting
class Solution {
    public int uniquePaths(int m, int n) {
    int[][] dp = new int[2][n];
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
           if(i==0) dp[0][j] = 1;
           else if(j==0) dp[1][j] = 1;
           else{
            if(i%2!=0){
                dp[1][j] = dp[1][j-1] + dp[0][j];
            }
            else dp[0][j] = dp[0][j-1] + dp[1][j];
           }
        }
    }
    return Math.max(dp[0][n-1], dp[1][n-1]);
    }
}

/* By Using 2*N Extra Array
class Solution {
    public int uniquePaths(int m, int n) {
    if(m==1 || n==1) return 1;
    int[][] dp =  new int[2][n];
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            if(i==0) dp[i][j] = 1;
            else if(j==0) dp[1][j] = 1;
            else {
            dp[1][j] =  dp[0][j] + dp[1][j-1];
            dp[0][j] = dp[1][j];
            }
        }
    }
    return dp[1][n-1];
    }
}
*/
}
