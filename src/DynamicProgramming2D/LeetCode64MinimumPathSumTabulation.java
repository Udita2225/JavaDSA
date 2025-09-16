package DynamicProgramming2D;
//64. Minimum Path Sum
/*
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right,
which minimizes the sum of all numbers along its path.
Note: You can only move either down or right at any point in time.
Example 1:
Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
Example 2:
Input: grid = [[1,2,3],[4,5,6]]
Output: 12
Constraints:
m == grid.length
n == grid[i].length
1 <= m, n <= 200
0 <= grid[i][j] <= 200
*/
public class LeetCode64MinimumPathSumTabulation {
/*
class Solution {
    public int minPathSum(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            if(i==0 && j==0) continue;
            else if(i==0) grid[i][j] += grid[i][j-1];
            else if(j==0) grid[i][j] += grid[i-1][j];
            else grid[i][j] +=  Math.min(grid[i][j-1], grid[i-1][j]);
        }
    }
    return grid[m-1][n-1];
    }
}
/* TC: O(m*n)
// Auxillary SC: O(m*n) if we are using extra dp array else Extra Space will be O(1)
class Solution {
    public int minPathSum(int[][] grid) {
    int m =  grid.length, n= grid[0].length;
    int[][] dp = new int[m][n];
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            if(i==0 && j==0) dp[i][j] = grid[i][j];
            else if(i==0) dp[i][j] = grid[i][j] + dp[i][j-1];
            else if(j==0) dp[i][j] = grid[i][j] + dp[i-1][j];
            else dp[i][j] = grid[i][j] +  Math.min(dp[i][j-1], dp[i-1][j]);
        }
    }
    return dp[m-1][n-1];
    }
}
/* Without Using Extra DP Array
class Solution {
    public int minPathSum(int[][] grid) {
    int m =  grid.length;
    int n = grid[0].length;
    for(int i=m-2; i>=0; i--){
        grid[i][n-1] += grid[i+1][n-1];
    }
    for(int i=n-2; i>=0; i--){
        grid[m-1][i] += grid[m-1][i+1];
    }
    for(int i=m-2; i>=0; i--){
        for(int j=n-2; j>=0; j--){
            grid[i][j] += Math.min(grid[i+1][j], grid[i][j+1]);
        }
    }
    return grid[0][0];
    }
}
/* Tabulation - By Using Extra DP array
class Solution {
    public int minPathSum(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    int[][] dp = new int[m][n];
    dp[m-1][n-1] = grid[m-1][n-1];
    for(int i=m-2; i>=0; i--){
        dp[i][n-1] = grid[i][n-1] + dp[i+1][n-1];
    }
    for(int i=n-2; i>=0; i--){
        dp[m-1][i] = grid[m-1][i] + dp[m-1][i+1];
    }
    for(int i=m-2; i>=0; i--){
        for(int j=n-2; j>=0; j--){
                dp[i][j] = grid[i][j] + Math.min(dp[i+1][j], dp[i][j+1]);
        }
    }
    return dp[0][0];
    }
}

*/
}
