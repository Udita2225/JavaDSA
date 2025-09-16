package DynamicProgramming2D;
//1277. Count Square Submatrices with All Ones
/*
Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.
Example 1:
Input: matrix =
[
  [0,1,1,1],
  [1,1,1,1],
  [0,1,1,1]
]
Output: 15
Explanation:
There are 10 squares of side 1.
There are 4 squares of side 2.
There is  1 square of side 3.
Total number of squares = 10 + 4 + 1 = 15.
Example 2:
Input: matrix =
[
  [1,0,1],
  [1,1,0],
  [1,1,0]
]
Output: 7
Explanation:
There are 6 squares of side 1.
There is 1 square of side 2.
Total number of squares = 6 + 1 = 7.
Constraints:
1 <= arr.length <= 300
1 <= arr[0].length <= 300
0 <= arr[i][j] <= 1
*/
public class LeetCode1277CountSquareSubmatricesWithall1Tabulation {
/*
// Using 1-D DP Array
class Solution {
    public int countSquares(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;
    int[] dp = new int[n];
    int prevTop = 0;
    int count =0;
    for(int i=0; i<m; i++){
        int prevDiagonal = 0;
        for(int j=0; j<n; j++){
            prevTop = dp[j];
            if(i==0 || j==0){
                dp[j] =  matrix[i][j];
            }
            else{
                if(matrix[i][j]==1){
                    dp[j] =  1 + Math.min(prevTop, Math.min(prevDiagonal,dp[j-1]));
                }
                else dp[j] = 0;
            }
            prevDiagonal = prevTop;
            count += dp[j];
        }
    }
    return count;
    }
}


Using 2-D DP Array
class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int count = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==0){
                    dp[i][j] =  matrix[i][j];
                }
                else{
                    if(matrix[i][j]==1) {
                        dp[i][j] =  1 + Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1]));
                    }
                    else dp[i][j] = 0;
                }
                count += dp[i][j];
            }
        }
        return count;
    }
}
*/
}
