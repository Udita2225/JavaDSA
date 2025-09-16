package DynamicProgramming2D;
//62. Unique Paths
/*
There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
The robot can only move either down or right at any point in time.
Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
The test cases are generated so that the answer will be less than or equal to 2 * 109.
Example 1:
Input: m = 3, n = 7
Output: 28
Example 2:
Input: m = 3, n = 2
Output: 3
Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Down -> Down
2. Down -> Down -> Right
3. Down -> Right -> Down
Constraints:
1 <= m, n <= 100
*/
public class LeetCode62UniquePathsMemoization {
    /*
    // Recursion+ Memoization By Using Two Variables
class Solution {
    public int Ways(int m, int n, int[][] dp){
        if(m==0 || n==0) return 1;
        if(dp[m][n]!=-1) return dp[m][n];
        int rightWays = Ways(m,n-1,dp);
        int downWays =  Ways(m-1,n,dp);
        return dp[m][n] = rightWays + downWays;
    }
    public int uniquePaths(int m, int n) {
    int[][] dp = new int[m][n];
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            dp[i][j]  = -1;
        }
    }
    return Ways(m-1, n-1, dp);
    }
}


    // Recursion + Memoization By Using Four Variables
   class Solution {
    public int paths(int row, int col, Integer m, Integer n, int[][] dp){
        if(row>=m || col>=n) return 0;
        if(row==m-1 && col==n-1) return 1;
        if(dp[row][col] != -1) return dp[row][col];
        int rightways = paths(row, col+1,m,n,dp);
        int downways = paths(row+1, col, m,n,dp);
        return dp[row][col] = rightways + downways;
    }
    public int uniquePaths(int m, int n) {
     //row:- 0 to m-1 | col: 0 to n-1
     //Total no.of calls possible:-  m*n
     int[][] dp = new int[m][n];
     for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            dp[i][j] = -1;
        }
     }
     return paths(0,0,m,n,dp);
    }
}


    Pure Recursion - Time Limit Exceeded
    //Integer - Object (Objects are passed by refernce)
    class Solution {
        public int paths(int row, int col, Integer m, Integer n){
            if(row==m || col==n) return 1;
            // if(row>=m || col>=n) return 0;
            // if(row==m-1 && col==n-1) return 1;
            int rightWays = paths(row, col+1, m,n);
            int downWays = paths(row+1, col, m, n);
            return rightWays+downWays;
        }
        public int uniquePaths(int m, int n) {
            //Using Four Variables
            return paths(0,0,m-1,n-1);
            // return paths(0,0,m,n);
        }
    }*/
}
