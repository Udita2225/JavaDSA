package DynamicProgramming2D;
//221. Maximal Square
/*
Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
Example 1:
Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
Output: 4
Example 2:
Input: matrix = [["0","1"],["1","0"]]
Output: 1
Example 3:
Input: matrix = [["0"]]
Output: 0
Constraints:
m == matrix.length
n == matrix[i].length
1 <= m, n <= 300
matrix[i][j] is '0' or '1'.
*/
public class LeetCode221MaximumSquareMemoization {
/*
// Recursion + Memoization
class Solution {
    int max =0;
    public int Max(int i, int j , int m, int n, char[][] matrix, int[][] dp){
    if(i>=m || j>=n) return 0;
    if(dp[i][j]!=-1) return dp[i][j];
    int right =  Max(i,j+1, m, n, matrix,dp);
    int down = Max(i+1,j,m, n,matrix, dp);
    int diagonal =  Max(i+1, j+1,m, n, matrix,dp);
    if(matrix[i][j]=='1'){
        dp[i][j] =  1 + Math.min(right, Math.min(down, diagonal));
    }
    else dp[i][j] = 0;
    max = Math.max(max, dp[i][j]);
    return dp[i][j];
    }
    public int maximalSquare(char[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(dp[i], -1);
        }
        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         Max(i,j,m, n, matrix, dp);
        //     }
        // }
        Max(0,0,m,n,matrix,dp);
        return max*max;
    }
}
*/
}
