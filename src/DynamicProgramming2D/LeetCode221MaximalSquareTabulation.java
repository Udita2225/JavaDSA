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
public class LeetCode221MaximalSquareTabulation {
/*
// By Using 1-D Extra DP Array.
class Solution {
    public int maximalSquare(char[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;
    int[] dp = new int[n];
    int max = 0;
    int prev = matrix[0][0] -'0';
    int temp = matrix[0][0] -'0';
    for(int i=0; i<m; i++){
        prev = 0;
        for(int j=0; j<n; j++){
            temp = dp[j];
            if(i==0 || j==0){
                dp[j] =  matrix[i][j]-'0';
            }
            else{
                if(matrix[i][j] == '1'){
                    dp[j] = 1 + Math.min(temp,Math.min(dp[j-1], prev));
                }
                else dp[j] = 0;
            }
            prev = temp;
            max = Math.max(max,dp[j]);
        }
    }
    return max*max;
    }
}
*/
/* By Using 2-D Extra DP Array
class Solution {
    public int maximalSquare(char[][] matrix) {
    int m =matrix.length;
    int n = matrix[0].length;
    int[][] dp = new int[m][n];
    int max = 0;
    for(int i=0; i<m; i++){
        int x = matrix[i][0]-'0';
        dp[i][0] = x;
        max = Math.max(max,x);
    }
    for(int i=0; i<n; i++){
        int x =  matrix[0][i]-'0';
        dp[0][i] = x;
        max = Math.max(max,x);
    }
    for(int i=1; i<m; i++){
        for(int j=1; j<n; j++){
            int x = matrix[i][j]-'0';
            if(x==1){
                dp[i][j] = x + Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
            }
            else dp[i][j] = 0;
            max = Math.max(max, dp[i][j]);
        }
    }
    return max*max;
    }
}
*/
}
