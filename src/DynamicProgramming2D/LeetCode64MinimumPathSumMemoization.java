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
public class LeetCode64MinimumPathSumMemoization {
/*Recursion +  Memoization
class Solution {
    public int Min(int[][] grid,int row, int col, int m, int n, int[][] dp){
    if(row>=m || col>=n) return Integer.MAX_VALUE;
    if(row==m-1 && col==n-1) return grid[row][col];
    if(dp[row][col]!=-1) return dp[row][col];
    int rightSum = Min(grid,row, col+1, m, n, dp);
    int downSum = Min(grid,row+1, col, m,n, dp);
    return dp[row][col] = grid[row][col] + Math.min(rightSum , downSum);
    }
    public int minPathSum(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    int[][] dp = new int[m][n];
    for(int i=0; i<m; i++){
        Arrays.fill(dp[i],-1);
    }
    return Min(grid,0,0,m,n,dp);
    }
}
*/
}
